package com.df.mykmmapplication.wholepageranking

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class EntityCard(
    @SerialName("Position")
    val position: Int?,

    @SerialName("EntityIds")
    val entityIds: List<String>?,
)