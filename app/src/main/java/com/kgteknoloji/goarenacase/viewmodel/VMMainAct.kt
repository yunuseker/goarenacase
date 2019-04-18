package com.kgteknoloji.goarenacase.viewmodel

import android.arch.lifecycle.MutableLiveData
import com.kgteknoloji.goarenacase.base.BaseViewModel
import com.kgteknoloji.goarenacase.usecase.GetProfileUseCase
import javax.inject.Inject

class VMMainAct @Inject constructor(
    private val getProfileUseCase: GetProfileUseCase
):BaseViewModel(){
    val headerTitle= MutableLiveData<String>()
    val headerSubTitle= MutableLiveData<String>()
    val profileImageUrl= MutableLiveData<String>()

    fun showProfileInfo(){
        val disposable= getProfileUseCase.getProfile()
            .subscribe {
                headerTitle.postValue(it.name)
                headerSubTitle.postValue(it.email)
                profileImageUrl.postValue(it.imageUrl)
            }
        disposables.add(disposable)
    }

}