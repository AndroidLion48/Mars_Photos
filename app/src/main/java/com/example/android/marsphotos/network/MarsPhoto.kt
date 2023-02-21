package com.example.android.marsphotos.network

import com.squareup.moshi.Json

/**
 * Created by Clarence E Moore on 2023-02-19.
 *
 * Description:
 *
 *
 */
data class MarsPhoto(
    val id: String,
    @Json(name =  "img_src") val imgSrcUrl: String
)
