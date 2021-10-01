package com.df.mykmmapplication

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json

const val KEY_ANSWER_ENTITY_REQUESTS = "AnswerEntityRequests"

@Serializable
data class EntityRequest(
    @SerialName("EntityTypes")
    val entityTypes: Collection<EntityType>,

    @SerialName("Query")
    val query: Query
)

@Serializable
data class Query(
    @SerialName("QueryString")
    val queryString: String,
    
    @SerialName("InputKind")
    val inputKind: InputKind
)

enum class InputKind {
    Text,
    Speech,
    Blah
}

fun buildRequest(query: String, entityTypes: Collection<EntityType>, isVoiceSearch: Boolean): String =
    Json.encodeToString(
        arrayOf(
            EntityRequest(
                entityTypes,
                Query(
                    query,
                    if (isVoiceSearch) InputKind.Speech else InputKind.Text
                )
            )
        )
    )
