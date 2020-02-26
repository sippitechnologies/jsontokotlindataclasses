package com.sippitechnologies.jsontokotlindataclass.model.moshidataclasses


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class PersonsItem(

	@Json(name="address")
	val address: Address? = null,

	@Json(name="name")
	val name: String? = null,

	@Json(name="age")
	val age: Int? = null
)