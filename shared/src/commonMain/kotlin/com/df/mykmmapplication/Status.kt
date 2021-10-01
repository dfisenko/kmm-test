package com.df.mykmmapplication

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Status(
    @SerialName("Response")
    val response: String?,

    @SerialName("Time")
    val time: String?
)