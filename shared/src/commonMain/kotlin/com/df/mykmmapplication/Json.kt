package com.df.mykmmapplication

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Json(
    @SerialName("type")
    val type: String?,

    @SerialName("text")
    val text: String?
)