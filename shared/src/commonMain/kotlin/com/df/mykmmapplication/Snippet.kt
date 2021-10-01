package com.df.mykmmapplication

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Snippet(
    @SerialName("json")
    val json: List<Json>?
)