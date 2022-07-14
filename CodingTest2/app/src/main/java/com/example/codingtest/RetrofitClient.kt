package com.example.codingtest

import retrofit2.Retrofit
import retrofit2.http.GET


interface RetrofitClient {

    var retrofit: RetrofitClient
    var BASE_URL: <List<Students>>

    @GET("students")
    companion object{
        var retrofit = Retrofit.Builder()
            .baseUrl("https://mocki.io/v1/abb92e67-c508-4b16-bdb2-\n" +
                    "0573b53cd364")
            .addConverterFactory()
            .build()

        return BASE_URL

    }


}