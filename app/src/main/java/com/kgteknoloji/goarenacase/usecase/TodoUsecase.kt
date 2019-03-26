package com.kgteknoloji.goarenacase.usecase

import com.kgteknoloji.goarenacase.data.repository.TodoRepository
import com.kgteknoloji.goarenacase.ui.viewentity.TodoViewEntity
import com.kgteknoloji.goarenacase.util.DateFormatter
import io.reactivex.Observable
import javax.inject.Inject

class TodoUsecase @Inject constructor(
    private val todoRepository: TodoRepository,
    private val dateFormatter: DateFormatter
) {

    fun getTodoList(): Observable<MutableList<TodoViewEntity>> {
        return todoRepository.getTodoList()
            .flatMapIterable { it }
            .map {
                TodoViewEntity(
                    dateFormatter.convertDate(it.createdDate ?: ""),
                    it.done,
                    it.status,
                    it.text
                )
            }
            .toList()
            .toObservable()
    }
}