package com.kgteknoloji.goarenacase.usecase;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/kgteknoloji/goarenacase/usecase/TodoUsecase;", "Lcom/kgteknoloji/goarenacase/base/BaseUsecase;", "todoRepository", "Lcom/kgteknoloji/goarenacase/data/repository/TodoRepository;", "dateFormatter", "Lcom/kgteknoloji/goarenacase/util/DateFormatter;", "(Lcom/kgteknoloji/goarenacase/data/repository/TodoRepository;Lcom/kgteknoloji/goarenacase/util/DateFormatter;)V", "getTodoList", "Lio/reactivex/Observable;", "", "Lcom/kgteknoloji/goarenacase/ui/viewentity/TodoViewEntity;", "app_debug"})
public final class TodoUsecase extends com.kgteknoloji.goarenacase.base.BaseUsecase {
    private final com.kgteknoloji.goarenacase.data.repository.TodoRepository todoRepository = null;
    private final com.kgteknoloji.goarenacase.util.DateFormatter dateFormatter = null;
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<java.util.List<com.kgteknoloji.goarenacase.ui.viewentity.TodoViewEntity>> getTodoList() {
        return null;
    }
    
    @javax.inject.Inject()
    public TodoUsecase(@org.jetbrains.annotations.NotNull()
    com.kgteknoloji.goarenacase.data.repository.TodoRepository todoRepository, @org.jetbrains.annotations.NotNull()
    com.kgteknoloji.goarenacase.util.DateFormatter dateFormatter) {
        super();
    }
}