package com.sippitechnologies.jsontokotlindataclass.model.gsondataclasses


import com.google.gson.annotations.SerializedName

data class ApiResponseforGson(

	@field:SerializedName("Persons")
	val persons: List<PersonsItem?>? = null,

	@field:SerializedName("states")
	val states: List<StatesItem?>? = null
)