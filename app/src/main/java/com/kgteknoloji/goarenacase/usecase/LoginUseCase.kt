package com.kgteknoloji.goarenacase.usecase

import com.kgteknoloji.goarenacase.data.dto.LoginBody
import com.kgteknoloji.goarenacase.data.dto.LoginDto
import com.kgteknoloji.goarenacase.data.repository.UserRepository
import io.reactivex.Observable
import javax.inject.Inject

class LoginUseCase @Inject constructor(
    private val userRepository: UserRepository
){

    fun doLogin(loginBody: LoginBody): Observable<LoginDto> {
        userRepository.saveUsername(loginBody.username)
        return userRepository.doLogin(loginBody)
            .doOnNext { userRepository.saveAccessToken(it.idToken) }
    }

}