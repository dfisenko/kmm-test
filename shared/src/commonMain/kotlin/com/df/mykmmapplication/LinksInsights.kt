package com.df.mykmmapplication

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class LinksInsights(
    @SerialName("IsSharedOneToOne")
    val isSharedOneToOne: Boolean?,
)