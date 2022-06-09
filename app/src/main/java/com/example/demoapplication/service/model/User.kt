package com.example.demoapplication.service.model

import com.google.gson.annotations.SerializedName

data class User(
    val id: String? = null,
    var email: String?,
    @SerializedName("first_name")
    var firstName: String?,
    @SerializedName("last_name")
    var lastName: String?,
    var avatar: String?,
    var userId: Int? = null
) {
}