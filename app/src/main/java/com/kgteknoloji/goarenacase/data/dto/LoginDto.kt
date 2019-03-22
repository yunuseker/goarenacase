package com.kgteknoloji.goarenacase.data.dto

import com.google.gson.annotations.SerializedName

data class LoginDto(
    @SerializedName("id_token")
    val idToken: String
)