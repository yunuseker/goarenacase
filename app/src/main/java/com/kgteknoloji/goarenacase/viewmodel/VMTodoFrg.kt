package com.kgteknoloji.goarenacase.viewmodel

import android.arch.lifecycle.MutableLiveData
import com.kgteknoloji.goarenacase.base.BaseViewModel
import com.kgteknoloji.goarenacase.ui.viewentity.TodoViewEntity
import com.kgteknoloji.goarenacase.usecase.TodoUsecase
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject

class VMTodoFrg @Inject constructor(private val todoUsecase: TodoUsecase) : BaseViewModel() {
    val todoList = MutableLiveData<MutableList<TodoViewEntity>>()

    fun getTodoList() {
        val disposable = todoUsecase.getTodoList()
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({
                todoList.postValue(it)
            }, {
                handleError(it)
            })
        disposables.add(disposable)
    }

}