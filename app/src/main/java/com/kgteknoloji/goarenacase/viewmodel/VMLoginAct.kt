package com.kgteknoloji.goarenacase.viewmodel

import android.arch.lifecycle.MutableLiveData
import com.kgteknoloji.goarenacase.base.BaseViewModel
import com.kgteknoloji.goarenacase.data.dto.LoginBody
import com.kgteknoloji.goarenacase.usecase.UserUsecase
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject

class VMLoginAct @Inject constructor(private val userUsecase: UserUsecase) : BaseViewModel() {
    var username: MutableLiveData<String> = MutableLiveData()
    var password: MutableLiveData<String> = MutableLiveData()
    var loginSuccess: MutableLiveData<Boolean> = MutableLiveData()
    val loginFail: MutableLiveData<Boolean> = MutableLiveData()
    val progressStatus: MutableLiveData<Boolean> = MutableLiveData()

    fun doLogin() {
        username.value="admin"
        password.value="admin"
        progressStatus.value = true
        val disposable = userUsecase.doLogin(LoginBody(password.value!!, false, username.value!!))
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(
                {
                    progressStatus.value = false
                    loginSuccess.value = true
                },
                {
                    progressStatus.value = false
                    handleError(it)
                })

        disposables.add(disposable)
    }

}