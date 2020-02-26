package com.sippitechnologies.jsontokotlindataclass.model.moshidataclasses


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ApiResponseinMoshi(

	@Json(name="Persons")
	val persons: List<PersonsItem?>? = null,

	@Json(name="states")
	val states: List<StatesItem?>? = null
)