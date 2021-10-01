package com.df.mykmmapplication

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Attendee(
    @SerialName("Status")
    val status: Status?,

    @SerialName("EmailAddress")
    val emailAddress: EmailAddress?
)