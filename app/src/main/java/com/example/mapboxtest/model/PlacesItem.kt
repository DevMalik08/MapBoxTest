package com.example.mapboxtest.model

import com.google.gson.annotations.SerializedName

data class PlacesItem(
	@field:SerializedName("place_name")
	val placeName: String,
	@field:SerializedName("geometry")
	var geometry: Geometry? = Geometry(),
)