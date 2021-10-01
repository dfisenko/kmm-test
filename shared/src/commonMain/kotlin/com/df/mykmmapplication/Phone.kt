package com.df.mykmmapplication

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Phone(
    @SerialName("Number")
    val number: String?,

    @SerialName("Type")
    val type: String?
)