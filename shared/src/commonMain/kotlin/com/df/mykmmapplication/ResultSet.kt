package com.df.mykmmapplication

import com.df.mykmmapplication.result.Result
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ResultSet(
    @SerialName("ContentSources")
    val contentSources: List<String>?,

    @SerialName("Results")
    val results: List<Result<Source>>?,

    @SerialName("Total")
    val total: Long?,

    @SerialName("MoreResultsAvailable")
    val moreResultsAvailable: Boolean?,

    @SerialName("Rank")
    val rank: Long?
)