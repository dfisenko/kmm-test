package com.df.mykmmapplication

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class MeetingTimeSlot(
    @SerialName("Start")
    val start: TimeSlot?,

    @SerialName("End")
    val end: TimeSlot?
)

@Serializable
data class TimeSlot(
    @SerialName("DateTime")
    val dateTime: String?,

    @SerialName("TimeZone")
    val timeZone: String?
)