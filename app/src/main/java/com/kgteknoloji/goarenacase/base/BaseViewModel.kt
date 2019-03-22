package com.kgteknoloji.goarenacase.base

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import com.google.gson.Gson
import com.kgteknoloji.goarenacase.data.defination.ErrorType
import com.kgteknoloji.goarenacase.data.dto.BaseError
import io.reactivex.disposables.CompositeDisposable
import retrofit2.HttpException
import java.io.IOException
import java.net.SocketTimeoutException
import java.net.UnknownHostException

/**
 * Created by yunuseker on 20.3.2019.
 */
open class BaseViewModel : ViewModel() {
    val errorMessage = MutableLiveData<String>()
    protected val disposables = CompositeDisposable()

    override fun onCleared() {
        disposables.dispose()
        super.onCleared()
    }

    /**
     * use enum instead of static string message
     */
    protected fun handleError(error: Throwable) {
        if (error is HttpException) {
            val errorBody: String
            val baseError: BaseError?
            try {
                errorBody = (error as HttpException).response().errorBody()!!.string()
                baseError = Gson().fromJson<BaseError>(errorBody, BaseError::class.java)

                errorMessage.postValue(baseError?.errorMessage)
            } catch (e: IOException) {
                errorMessage.value = "Bilinmeyen bir hata ile karşılaşıldı"
            }

        } else if (error is UnknownHostException) {
            errorMessage.postValue("")

        } else if (error is SocketTimeoutException) {
            errorMessage.postValue("Bağlantı zaman aşımına uğradı.")

        } else {
            errorMessage.postValue("Bilinmeyen bir hata ile karşılaşıldı")
        }
    }
}