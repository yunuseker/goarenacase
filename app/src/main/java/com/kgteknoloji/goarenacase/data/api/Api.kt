package com.kgteknoloji.goarenacase.data.api

import com.kgteknoloji.goarenacase.data.dto.*
import io.reactivex.Observable
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path

/**
 * Created by yunuseker on 20.3.2019.
 */
interface Api {
    @POST("authenticate")
    fun login(@Body loginBody: LoginBody): Observable<LoginDto>

    @GET("todos")
    fun getTodoList(): Observable<MutableList<TodoDto>>

    @GET("users/{username}")
    fun getProfile(@Path("username") username: String): Observable<ProfileDto>
}