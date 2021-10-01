package com.df.mykmmapplication

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class CandidateEntity(
    @SerialName("EntityId")
    val entityId: String = "",

    @SerialName("NextTurnResolutionToken")
    val nextTurnResolutionToken: String = ""
)