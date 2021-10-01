package com.df.mykmmapplication.result

import com.df.mykmmapplication.Source
import kotlinx.serialization.DeserializationStrategy
import kotlinx.serialization.Polymorphic
import kotlinx.serialization.PolymorphicSerializer
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.JsonContentPolymorphicSerializer
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.jsonObject
import kotlinx.serialization.json.jsonPrimitive

@Serializable(with = ResultSourceSerializer::class)
sealed class Result<T : Source> {
    abstract val source: T?

    @SerialName("Id")
    val id: String = ""

    @SerialName("ContentSource")
    val contentSource: String = ""

    @SerialName("ReferenceId")
    val referenceId: String = ""

    @SerialName("Rank")
    val rank: Long = 0

    @SerialName("Type")
    val type: String = ""

    @Serializable
    data class PeopleResult(
        @SerialName("Source")
        override val source: Source.PeopleSource?
    ) : Result<Source.PeopleSource>()

    @Serializable
    data class AcronymResult(
        @SerialName("Source")
        override val source: Source.AcronymSource?
    ) : Result<Source.AcronymSource>()

    @Serializable
    data class BookmarkResult(
        @SerialName("Source")
        override val source: Source.BookmarkSource?
    ) : Result<Source.BookmarkSource>()

    @Serializable
    data class MeetingProposalResult(
        @SerialName("Source")
        override val source: Source.MeetingProposalSource?
    ) : Result<Source.MeetingProposalSource>()

    @Serializable
    data class CalendarResult(
        @SerialName("Source")
        override val source: Source.CalendarSource?
    ) : Result<Source.CalendarSource>()

    @Serializable
    data class FileResult(
        @SerialName("Source")
        override val source: Source.FileSource?
    ) : Result<Source.FileSource>()

    @Serializable
    data class LinkResult(
        @SerialName("Source")
        override val source: Source.LinkSource?
    ) : Result<Source.LinkSource>()

    @Serializable
    data class UnknownResult(
        @SerialName("Source")
        override val source: Source.UnknownSource = Source.UnknownSource()
    ) : Result<Source.UnknownSource>()
}

internal object ResultSourceSerializer: JsonContentPolymorphicSerializer<Result<*>>(Result::class) {
    override fun selectDeserializer(element: JsonElement): DeserializationStrategy<out Result<*>> =
        when(element.jsonObject["Type"]?.jsonPrimitive?.content) {
            "Link" -> Result.LinkResult.serializer()
            "File" -> Result.FileResult.serializer()
            "Event" -> Result.CalendarResult.serializer()
            "MeetingProposal" -> Result.MeetingProposalResult.serializer()
            "Bookmark" -> Result.BookmarkResult.serializer()
            "Acronym" -> Result.AcronymResult.serializer()
            "People" -> Result.PeopleResult.serializer()
            else -> Result.UnknownResult.serializer()
        }

}