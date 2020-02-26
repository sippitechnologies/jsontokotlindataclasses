package com.sippitechnologies.jsontokotlindataclass.model.gsondataclasses


import com.google.gson.annotations.SerializedName


data class StatesItem(

	@field:SerializedName("tite")
	val tite: String? = null,

	@field:SerializedName("Speciality")
	val speciality: String? = null
)