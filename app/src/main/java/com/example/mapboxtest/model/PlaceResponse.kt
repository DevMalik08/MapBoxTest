package com.example.mapboxtest.model

import com.google.gson.annotations.SerializedName

data class PlaceResponse(
	@field:SerializedName("features")
	val features: List<PlacesItem>
)