package com.example.demoapplication.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.demoapplication.repository.UserRepository
import com.example.demoapplication.service.Resource
import com.example.demoapplication.service.model.User

class SharedViewModel(private val userRepository: UserRepository): ViewModel() {
    val users: MutableLiveData<Resource<ArrayList<User>>> = MutableLiveData<Resource<ArrayList<User>>>()

    suspend fun getUsers() {
        users.postValue(Resource.Loading())

        val response = userRepository.getUsers()

        if (response.isSuccessful && response.body() != null && !response.body()!!.data.isNullOrEmpty()) {
            users.postValue(Resource.Success(response.body()?.data!!))
        } else {
            users.postValue(Resource.Error("Please try again..."))
        }
    }
}