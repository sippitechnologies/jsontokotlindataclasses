package com.sippitechnologies.jsontokotlindataclass.model.moshidataclasses


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class StatesItem(

	@Json(name="tite")
	val tite: String? = null,

	@Json(name="Speciality")
	val speciality: String? = null
)