package com.kgteknoloji.goarenacase.data.dto

import com.google.gson.annotations.SerializedName

data class LoginBody(
    @SerializedName("password")
    val password: String,
    @SerializedName("rememberMe")
    val rememberMe: Boolean,
    @SerializedName("username")
    val username: String
)