package com.df.mykmmapplication.action

import kotlinx.serialization.DeserializationStrategy
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.JsonContentPolymorphicSerializer
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.jsonObject
import kotlinx.serialization.json.jsonPrimitive

@Serializable(with = ActionSerializer::class)
sealed class Action {
    abstract val actionId: String?
    abstract val actionKind: String?
}

@Serializable
data class BasicAction(
    @SerialName("ActionId")
    override val actionId: String?,

    @SerialName("ActionKind")
    override val actionKind: String?
) : Action()

internal object ActionSerializer : JsonContentPolymorphicSerializer<Action>(Action::class) {
    override fun selectDeserializer(element: JsonElement): DeserializationStrategy<out Action> =
        when (element.jsonObject["ActionKind"]?.jsonPrimitive?.content) {
            "Meeting" -> MeetingAction.serializer()
            "Communication" -> CommunicationAction.serializer()
            else -> BasicAction.serializer()
        }
}
