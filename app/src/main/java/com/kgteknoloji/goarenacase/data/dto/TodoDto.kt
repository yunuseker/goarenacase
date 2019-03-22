package com.kgteknoloji.goarenacase.data.dto

import com.google.gson.annotations.SerializedName

data class TodoDto(
        @SerializedName("createdDate")
        val createdDate: String?,
        @SerializedName("done")
        val done: Boolean,
        @SerializedName("id")
        val id: Int,
        @SerializedName("status")
        val status: String,
        @SerializedName("text")
        val text: String
)