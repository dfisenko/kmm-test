package com.df.mykmmapplication

/*
 * Entity Resolution State.
 */
enum class EntityResolutionState {
    /*
     * Client must resolve entities in other action properties before
     * entities for this property can be provided.
     */
    ServerTurnRequired,

    /*
     * Client should use entity options referenced in response from current
     * or previous turns.
     */
    EntitiesAvailable
}