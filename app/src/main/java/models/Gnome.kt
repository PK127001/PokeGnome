package com.example.pokegnomego.models

import java.sql.Blob

data class GnomeResponse(
    val gnome_id: Int,
    val name: String,
    val latitude: Double,
    val longitude: Double,
    //val image_url: String
)
