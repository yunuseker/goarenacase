package com.kgteknoloji.goarenacase.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\t\u001a\u00020\u000bR\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/kgteknoloji/goarenacase/viewmodel/VMTodoFrg;", "Lcom/kgteknoloji/goarenacase/base/BaseViewModel;", "todoUsecase", "Lcom/kgteknoloji/goarenacase/usecase/TodoUsecase;", "(Lcom/kgteknoloji/goarenacase/usecase/TodoUsecase;)V", "todoList", "Landroid/arch/lifecycle/MutableLiveData;", "", "Lcom/kgteknoloji/goarenacase/ui/viewentity/TodoViewEntity;", "getTodoList", "()Landroid/arch/lifecycle/MutableLiveData;", "", "app_debug"})
public final class VMTodoFrg extends com.kgteknoloji.goarenacase.base.BaseViewModel {
    @org.jetbrains.annotations.NotNull()
    private final android.arch.lifecycle.MutableLiveData<java.util.List<com.kgteknoloji.goarenacase.ui.viewentity.TodoViewEntity>> todoList = null;
    private final com.kgteknoloji.goarenacase.usecase.TodoUsecase todoUsecase = null;
    
    @org.jetbrains.annotations.NotNull()
    public final android.arch.lifecycle.MutableLiveData<java.util.List<com.kgteknoloji.goarenacase.ui.viewentity.TodoViewEntity>> getTodoList() {
        return null;
    }
    
    public final void getTodoList() {
    }
    
    @javax.inject.Inject()
    public VMTodoFrg(@org.jetbrains.annotations.NotNull()
    com.kgteknoloji.goarenacase.usecase.TodoUsecase todoUsecase) {
        super();
    }
}