package com.kgteknoloji.goarenacase.data.dto

import com.google.gson.annotations.SerializedName

data class ProfileDto(
        @SerializedName("activated")
        val activated: Boolean,
        @SerializedName("createdBy")
        val createdBy: String,
        @SerializedName("createdDate")
        val createdDate: String,
        @SerializedName("email")
        val email: String,
        @SerializedName("firstName")
        val firstName: String,
        @SerializedName("id")
        val id: Int,
        @SerializedName("imageUrl")
        val imageUrl: String,
        @SerializedName("langKey")
        val langKey: String,
        @SerializedName("lastModifiedBy")
        val lastModifiedBy: String,
        @SerializedName("lastModifiedDate")
        val lastModifiedDate: String,
        @SerializedName("lastName")
        val lastName: String,
        @SerializedName("login")
        val login: String
)