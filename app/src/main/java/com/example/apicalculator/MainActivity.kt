package com.example.apicalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.apicalculator.API.ApiClient
import com.example.apicalculator.API.ApiInterface
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    lateinit var etNum1:EditText
    lateinit var etNum2:EditText
    lateinit var tvAnswer:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun fetchAnswers() {
        var retrofit= ApiClient.buildApiClient(ApiInterface::class.java)
        var request=retrofit.getAnswers()
        request.enqueue(object :Callback <List<Calculator>>{

        override fun onResponse(call: Call<List<Calculator>>, response: Response<List<Calculator>>) {
            if (response.isSuccessful){
                var answers=response.body()
                etNum1=findViewById(R.id.etNum1)
                etNum2=findViewById(R.id.etNum2)
                tvAnswer=findViewById(R.id.tvAnswer)
                var myAdapter=(baseContext,answers)



            }
        }

        override fun onFailure(call: Call<List<Calculator>>, t: Throwable) {
            Toast.makeText(baseContext,t.message, Toast.LENGTH_LONG).show()
        }
    })

    }}
