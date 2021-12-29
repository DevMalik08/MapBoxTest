package com.example.mapboxtest.model

import com.google.gson.annotations.SerializedName

data class Geometry(
    @field:SerializedName("type")
    var type: String? = null,
    @field:SerializedName("coordinates")
    var coordinates: ArrayList<Double> = arrayListOf()
)