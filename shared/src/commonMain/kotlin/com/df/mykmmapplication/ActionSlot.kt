package com.df.mykmmapplication

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ActionSlot(
    @SerialName("CandidateEntities")
    val candidateEntities: List<CandidateEntity> = listOf(),

    @SerialName("RawQueryParse")
    val rawQueryParse: String = "",

    @SerialName("EntityResolutionState")
    val entityResolutionState: EntityResolutionState? = null,

    @SerialName("PrerequisitePropertiesToResolve")
    val prerequisitePropertiesToResolve: List<String> = listOf(),

    @SerialName("AsyncResolutionToken")
    val asyncResolutionToken: String = ""
)