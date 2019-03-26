package com.kgteknoloji.goarenacase.viewmodel

import android.arch.lifecycle.MutableLiveData
import com.kgteknoloji.goarenacase.base.BaseViewModel
import com.kgteknoloji.goarenacase.ui.viewentity.ProfileViewEntity
import com.kgteknoloji.goarenacase.usecase.GetProfileUseCase
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject

/**
 * Created by yunuseker on 20.3.2019.
 */
class VMProfileFrg @Inject constructor(
    private val getProfileUseCase: GetProfileUseCase
) : BaseViewModel() {
    var profileData = MutableLiveData<ProfileViewEntity>()

    fun getProfileData() {
        val disposable = getProfileUseCase.getProfile().subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe({
                    profileData.value = it
                }, {
                    handleError(it)
                })
        disposables.add(disposable)
    }
}