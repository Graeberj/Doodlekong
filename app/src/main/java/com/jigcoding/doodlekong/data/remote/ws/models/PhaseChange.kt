package com.jigcoding.doodlekong.data.remote.ws.models

import com.jigcoding.doodlekong.data.remote.ws.Room
import com.jigcoding.doodlekong.util.Constants.TYPE_PHASE_CHANGE

data class PhaseChange(
    var phase: Room.Phase?,
    var time: Long,
    val drawingPlayer: String? = null
): BaseModel(TYPE_PHASE_CHANGE)
