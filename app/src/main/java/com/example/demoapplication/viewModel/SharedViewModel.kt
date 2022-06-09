package com.example.demoapplication.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.demoapplication.service.User

class SharedViewModel: ViewModel() {
    val users: MutableLiveData<ArrayList<User>> = MutableLiveData<ArrayList<User>>()
}