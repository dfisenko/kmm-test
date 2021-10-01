package com.df.mykmmapplication

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class EmailAddress(
    @SerialName("Name")
    val name: String?,

    @SerialName("Address")
    val address: String?
)