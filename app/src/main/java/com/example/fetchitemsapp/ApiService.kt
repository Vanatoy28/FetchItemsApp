package com.example.fetchitemsapp

import retrofit2.Response
import retrofit2.http.GET

interface ApiService {
    @GET("hiring.json")
    suspend fun getItems(): Response<List<Item>>
}