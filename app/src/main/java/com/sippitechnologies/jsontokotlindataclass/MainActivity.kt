package com.sippitechnologies.jsontokotlindataclass

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.sippitechnologies.jsontokotlindataclass.model.Person
import com.squareup.moshi.JsonAdapter
import com.squareup.moshi.Moshi

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        jsonToDataClass()


    }

    fun jsonToDataClass()
    {
        //Json Object Creation in form of String is done
        // Now Create Data class from Json String
        val personJson="""{
            
            "fname" : "Testing",
            "lname" : "test",
            "age"   : 35,
            "height" : 5.7,
            "weight" : 80
            }
            
        """

        //Write Moshi Adapter Code

        val moshi = Moshi.Builder().build()
        val personAdapter:JsonAdapter<Person> = moshi.adapter(Person::class.java)
        val person = personAdapter.fromJson(personJson)
        Log.d("Person:",person!!.toString())

    }





}
