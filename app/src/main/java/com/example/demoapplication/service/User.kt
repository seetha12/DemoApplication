package com.example.demoapplication.service

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
class User(val firstName: String?,
val lastName: String?) : Parcelable