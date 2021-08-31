package com.example.apicalculator.API

import com.example.apicalculator.Calculator
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiInterface {

    @GET("posts")
    fun getAnswers():Call<List<Calculator>>

    @GET("addition")
    fun getNumberOne(@Path("num1")num1:Int): Call<Calculator>

    @GET("subtraction")
    fun getNumberTwo(@Path("num2")num2:Int): Call<Calculator>





}