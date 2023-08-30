package com.jigcoding.doodlekong.data.remote.ws.models

import com.jigcoding.doodlekong.util.Constants.TYPE_CUR_ROUND_DRAW_INFO

data class RoundDrawInfo(
    val data: List<String>
): BaseModel(TYPE_CUR_ROUND_DRAW_INFO)
