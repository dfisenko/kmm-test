package com.df.mykmmapplication.wholepageranking

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class WholePageRanking(
    @SerialName("EntityCards")
    val entityCards: List<EntityCard>?,
)
