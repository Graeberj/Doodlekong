package com.jigcoding.doodlekong.data.remote.ws.models

import com.jigcoding.doodlekong.util.Constants.TYPE_PLAYERS_LIST


data class PlayersList(
    val players: List<PlayerData>
): BaseModel(TYPE_PLAYERS_LIST)
