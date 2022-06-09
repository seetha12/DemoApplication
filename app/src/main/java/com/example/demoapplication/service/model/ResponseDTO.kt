package com.example.demoapplication.service.model

import com.example.demoapplication.service.model.Support
import com.example.demoapplication.service.model.User
import com.google.gson.annotations.SerializedName

data class ResponseDTO(
    val page: Int,
    @SerializedName("per_page")
    val perPage: Int,
    val total: Int,
    @SerializedName("total_pages")
    val totalPages: Int,
    val data: ArrayList<User>?,
    val support: Support?
) {
}