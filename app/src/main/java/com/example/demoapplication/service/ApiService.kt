package com.example.demoapplication.service

import com.example.demoapplication.service.model.ResponseDTO
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {
    @GET("api/users")
    suspend fun getUsers(): Response<ResponseDTO>
}