package com.kgteknoloji.goarenacase.data.repository

import com.kgteknoloji.goarenacase.base.BaseRepository
import com.kgteknoloji.goarenacase.data.api.Api
import com.kgteknoloji.goarenacase.data.dto.TodoDto
import io.reactivex.Observable
import javax.inject.Inject

class TodoRepository @Inject constructor(private val api: Api):BaseRepository(){

    fun getTodoList(): Observable<MutableList<TodoDto>> {
        return api.getTodoList()
    }
}