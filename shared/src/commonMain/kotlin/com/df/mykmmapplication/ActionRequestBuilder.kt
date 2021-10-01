package com.df.mykmmapplication

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json


const val KEY_ACTION_REQUESTS = "ActionRequests"
const val COMMUNICATION_ACTION_KIND = "Communication"
const val MEETING_ACTION_KIND = "Meeting"
const val MAKE_CALL_ACTION = "MakeCall"
const val SEND_MESSAGE_ACTION = "SendMessage"
const val CREATE_MEETING_ACTION = "CreateMeeting"

@Serializable
data class ActionRequest(
    @SerialName("ActionKind")
    val actionKind: String,

    @SerialName("SupportedActions")
    val supportedActions: List<String> = listOf(),

    @SerialName("IsMultiTurnSupported")
    val isMultiTurnSupported: Boolean
)

fun buildRequest(supportedActions: List<String>): String {
    val actions: MutableList<ActionRequest> = ArrayList()
    if (supportedActions.contains(MAKE_CALL_ACTION) || supportedActions.contains(SEND_MESSAGE_ACTION)) {
        actions.add(
            ActionRequest(
                COMMUNICATION_ACTION_KIND,
                supportedActions.filter { it == MAKE_CALL_ACTION || it == SEND_MESSAGE_ACTION },
                false
            )
        )
    }

    if (supportedActions.contains(CREATE_MEETING_ACTION)) {
        actions.add(
            ActionRequest(
                MEETING_ACTION_KIND,
                listOf(CREATE_MEETING_ACTION),
                false
            )
        )
    }

    return Json.encodeToString(actions)
}