package com.sippitechnologies.jsontokotlindataclass.model

import com.squareup.moshi.JsonClass


// Take key name and data type should be same as json object
//Apply Mosh annotation

@JsonClass(generateAdapter = true)
data class Person(val fname:String,
                  val lname:String,
                  val age:Int,
                  val height:Float,
                  val weight:Int)