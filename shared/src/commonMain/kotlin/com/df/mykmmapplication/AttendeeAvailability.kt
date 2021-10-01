package com.df.mykmmapplication

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class AttendeeAvailability(
    @SerialName("Attendee")
    val attendee: Attendee?,

    @SerialName("Availability")
    val availability: String?
)