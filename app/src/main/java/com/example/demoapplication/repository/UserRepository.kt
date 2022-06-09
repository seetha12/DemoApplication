package com.example.demoapplication.repository

import com.example.demoapplication.service.RetrofitInstance

class UserRepository {
    suspend fun getUsers() =
        RetrofitInstance.api.getUsers()
}