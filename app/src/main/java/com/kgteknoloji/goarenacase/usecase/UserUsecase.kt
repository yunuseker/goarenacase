package com.kgteknoloji.goarenacase.usecase

import com.kgteknoloji.goarenacase.base.BaseUsecase
import com.kgteknoloji.goarenacase.data.dto.LoginBody
import com.kgteknoloji.goarenacase.data.dto.LoginDto
import com.kgteknoloji.goarenacase.data.repository.UserRepository
import com.kgteknoloji.goarenacase.ui.viewentity.ProfileViewEntity
import io.reactivex.Observable
import javax.inject.Inject

/**
 * Created by yunuseker on 20.3.2019.
 */
class UserUsecase @Inject constructor(private val userRepository: UserRepository) : BaseUsecase() {

    fun doLogin(loginBody: LoginBody): Observable<LoginDto> {
        userRepository.saveUsername(loginBody.username)
        return userRepository.doLogin(loginBody)
                .doOnNext { userRepository.saveAccessToken(it.idToken) }
    }

    fun getProfile(): Observable<ProfileViewEntity> {
        return userRepository.getUserProfile()
                .map {
                    ProfileViewEntity(
                            it.email,
                            it.imageUrl,
                            it.firstName + " " + it.lastName
                    )
                }
    }
}