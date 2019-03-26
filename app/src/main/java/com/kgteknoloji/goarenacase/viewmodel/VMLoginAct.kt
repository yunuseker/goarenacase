package com.kgteknoloji.goarenacase.viewmodel

import android.arch.lifecycle.MutableLiveData
import com.kgteknoloji.goarenacase.base.BaseViewModel
import com.kgteknoloji.goarenacase.data.dto.LoginBody
import com.kgteknoloji.goarenacase.usecase.LoginUseCase
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject

class VMLoginAct @Inject constructor(
    private val loginUseCase: LoginUseCase
) : BaseViewModel() {
    val username= MutableLiveData<String>().apply{ value="admin" }
    val password= MutableLiveData<String>().apply{ value="admin" }
    var loginSuccess: MutableLiveData<Boolean> = MutableLiveData()
    val loginFail: MutableLiveData<Boolean> = MutableLiveData()
    val progressStatus: MutableLiveData<Boolean> = MutableLiveData()

    fun doLogin() {
        progressStatus.value = true
        val loginBody= createLoginBody(username.value!!,password.value!!)
        val disposable = loginUseCase.doLogin(loginBody)
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

    private fun createLoginBody(username: String, password: String): LoginBody {
        return LoginBody(password, false, username)
    }

}