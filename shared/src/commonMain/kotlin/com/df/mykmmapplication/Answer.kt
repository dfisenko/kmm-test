package com.df.mykmmapplication

import com.df.mykmmapplication.action.Action
import com.df.mykmmapplication.wholepageranking.WholePageRanking
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.Json

@Serializable
data class Answer(
    @SerialName("ApiVersion")
    val apiVersion: String?,

    @SerialName("AnswerEntitySets")
    val answerEntitySets: List<AnswerEntitySet> = listOf(),

    @SerialName("Instrumentation")
    val instrumentation: Instrumentation?,

    @SerialName("Actions")
    val actions: List<Action> = listOf(),

    @SerialName("WholePageRankings")
    val wholePageRankings: List<WholePageRanking> = listOf(),
)

private val format by lazy {
    Json {
        ignoreUnknownKeys = true
        isLenient = true
        encodeDefaults = true
    }
}

fun getAnswer(json: String): Answer = format.decodeFromString(Answer.serializer(), json)