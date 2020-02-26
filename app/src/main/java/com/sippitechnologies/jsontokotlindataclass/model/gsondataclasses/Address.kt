package com.sippitechnologies.jsontokotlindataclass.model.gsondataclasses

import com.google.gson.annotations.SerializedName


data class Address(

	@field:SerializedName("Houseno")
	val houseno: Int? = null,

	@field:SerializedName("pin")
	val pin: Int? = null,

	@field:SerializedName("Locality")
	val locality: String? = null,

	@field:SerializedName("state")
	val state: String? = null
)