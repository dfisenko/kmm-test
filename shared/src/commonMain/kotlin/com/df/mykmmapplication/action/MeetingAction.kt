package com.df.mykmmapplication.action

import com.df.mykmmapplication.ActionSlot
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class MeetingAction(
    @SerialName("ActionId")
    override val actionId: String = "",

    @SerialName("ActionKind")
    override val actionKind: String = "",

    @SerialName("MeetingTitle")
    val title: String = "",

    @SerialName("Attendees")
    val attendees: List<ActionSlot> = listOf(),

    @SerialName("MeetingTime")
    val meetingTime: ActionSlot? = null,

    @SerialName("MeetingRoom")
    val meetingRoom: ActionSlot? = null
) : Action()