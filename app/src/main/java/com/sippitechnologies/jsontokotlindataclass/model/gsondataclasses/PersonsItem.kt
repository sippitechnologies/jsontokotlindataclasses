package com.sippitechnologies.jsontokotlindataclass.model.gsondataclasses


import com.google.gson.annotations.SerializedName


data class PersonsItem(

	@field:SerializedName("address")
	val address: Address? = null,

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("age")
	val age: Int? = null
)