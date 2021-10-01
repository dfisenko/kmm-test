package com.df.mykmmapplication

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Inferences(
    @SerialName("IsPersonalContact")
    val isPersonalContact: Boolean?,

    @SerialName("HaveReceivedEmailsFrom")
    val hasReceivedEmailsFrom: Boolean?,

    @SerialName("HaveSentEmailsTo")
    val hasSentEmailsTo: Boolean?,

    @SerialName("HasReceivedMessagesFrom")
    val hasReceivedMessagesFrom: Boolean?,
)