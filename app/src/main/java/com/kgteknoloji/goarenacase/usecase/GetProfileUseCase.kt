package com.kgteknoloji.goarenacase.usecase

import com.kgteknoloji.goarenacase.data.repository.UserRepository
import com.kgteknoloji.goarenacase.ui.viewentity.ProfileViewEntity
import io.reactivex.Observable
import javax.inject.Inject

class GetProfileUseCase @Inject constructor(
    private val userRepository: UserRepository
){

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