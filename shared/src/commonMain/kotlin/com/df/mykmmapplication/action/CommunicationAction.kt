package com.df.mykmmapplication.action

import com.df.mykmmapplication.ActionSlot
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class CommunicationAction(
    @SerialName("ActionId")
    override val actionId: String = "",

    @SerialName("ActionKind")
    override val actionKind: String = "",

    @SerialName("Message")
    val message: String = "",

    @SerialName("Subject")
    val subject: String = "",

    @SerialName("Addresses")
    val addresses: List<ActionSlot> = listOf(),

    @SerialName("CommunicationChannel")
    val communicationChannel: String = ""
) : Action()