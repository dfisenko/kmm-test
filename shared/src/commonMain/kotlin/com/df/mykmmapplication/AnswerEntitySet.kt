package com.df.mykmmapplication

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class AnswerEntitySet(
    @SerialName("ResultSets")
    val resultSets: List<ResultSet> = listOf(),

    @SerialName("EntityType")
    val entityType: String = "",

    @SerialName("Intent")
    val intent: String = "",

    @SerialName("Rank")
    val rank: Rank? = null
)

//inline fun <reified T : Result<*>> AnswerEntitySet.extractResults(): List<T> =
//    resultSets.orEmpty()
//        .first()
//        .results.orEmpty()
//        .filterIsInstance<T>()