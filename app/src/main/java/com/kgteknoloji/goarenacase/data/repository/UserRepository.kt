package com.kgteknoloji.goarenacase.data.repository

import android.content.SharedPreferences
import com.kgteknoloji.goarenacase.base.BaseRepository
import com.kgteknoloji.goarenacase.data.api.Api
import com.kgteknoloji.goarenacase.data.dto.*
import io.reactivex.Observable
import javax.inject.Inject

/**
 * Created by yunuseker on 20.3.2019.
 */
class UserRepository @Inject constructor(private val api: Api,private val sharedPreferences: SharedPreferences) : BaseRepository() {

    fun doLogin(loginBody: LoginBody): Observable<LoginDto> {
        return api.login(loginBody)
    }

    fun getUserProfile():Observable<ProfileDto>{
        return api.getProfile(getUsername())
    }

    fun saveAccessToken(string: String){
     sharedPreferences.edit().putString("token",string).apply()
    }

    fun getAccessToken():String{
        return sharedPreferences.getString("token","")!!
    }

    fun saveUsername(string: String){
     sharedPreferences.edit().putString("username",string).apply()
    }

    fun getUsername():String{
        return sharedPreferences.getString("username","")!!
    }
}