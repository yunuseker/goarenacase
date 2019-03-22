package com.kgteknoloji.goarenacase.data.api;

import java.lang.System;

/**
 * * Created by yunuseker on 20.3.2019.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\'J\u0014\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0003H\'J\u0018\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00032\b\b\u0001\u0010\f\u001a\u00020\rH\'\u00a8\u0006\u000e"}, d2 = {"Lcom/kgteknoloji/goarenacase/data/api/Api;", "", "getProfile", "Lio/reactivex/Observable;", "Lcom/kgteknoloji/goarenacase/data/dto/ProfileDto;", "username", "", "getTodoList", "", "Lcom/kgteknoloji/goarenacase/data/dto/TodoDto;", "login", "Lcom/kgteknoloji/goarenacase/data/dto/LoginDto;", "loginBody", "Lcom/kgteknoloji/goarenacase/data/dto/LoginBody;", "app_debug"})
public abstract interface Api {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "authenticate")
    public abstract io.reactivex.Observable<com.kgteknoloji.goarenacase.data.dto.LoginDto> login(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.kgteknoloji.goarenacase.data.dto.LoginBody loginBody);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "todos")
    public abstract io.reactivex.Observable<java.util.List<com.kgteknoloji.goarenacase.data.dto.TodoDto>> getTodoList();
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "users/{username}")
    public abstract io.reactivex.Observable<com.kgteknoloji.goarenacase.data.dto.ProfileDto> getProfile(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "username")
    java.lang.String username);
}