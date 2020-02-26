package com.sippitechnologies.jsontokotlindataclass.model.moshidataclasses


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/*
For Moshi you need to add this line on every class
* */
@JsonClass(generateAdapter = true)
data class Address(

	@Json(name="Houseno")
	val houseno: Int? = null,

	@Json(name="pin")
	val pin: Int? = null,

	@Json(name="Locality")
	val locality: String? = null,

	@Json(name="state")
	val state: String? = null
)