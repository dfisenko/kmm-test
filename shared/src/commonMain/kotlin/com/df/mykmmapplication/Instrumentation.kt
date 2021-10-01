package com.df.mykmmapplication

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Instrumentation(
    @SerialName("TraceId")
    val traceId: String?
)