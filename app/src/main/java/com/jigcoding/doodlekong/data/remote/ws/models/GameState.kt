package com.jigcoding.doodlekong.data.remote.ws.models

import com.jigcoding.doodlekong.util.Constants.TYPE_GAME_STATE

data class GameState(
    val drawingPlayer: String,
    val word: String
): BaseModel(TYPE_GAME_STATE)
