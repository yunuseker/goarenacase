package com.kgteknoloji.goarenacase.di;

import java.lang.System;

/**
 * * Created by yunuseker on 20.3.2019.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\nH\u0007\u00a8\u0006\u000b"}, d2 = {"Lcom/kgteknoloji/goarenacase/di/RepositoryModule;", "", "()V", "provideTodoRepository", "Lcom/kgteknoloji/goarenacase/data/repository/TodoRepository;", "api", "Lcom/kgteknoloji/goarenacase/data/api/Api;", "provideUserRepository", "Lcom/kgteknoloji/goarenacase/data/repository/UserRepository;", "sharedPreferences", "Landroid/content/SharedPreferences;", "app_debug"})
@dagger.Module(includes = {com.kgteknoloji.goarenacase.di.DatabaseModule.class, com.kgteknoloji.goarenacase.di.NetworkModule.class})
public final class RepositoryModule {
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.kgteknoloji.goarenacase.data.repository.UserRepository provideUserRepository(@org.jetbrains.annotations.NotNull()
    com.kgteknoloji.goarenacase.data.api.Api api, @org.jetbrains.annotations.NotNull()
    android.content.SharedPreferences sharedPreferences) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.kgteknoloji.goarenacase.data.repository.TodoRepository provideTodoRepository(@org.jetbrains.annotations.NotNull()
    com.kgteknoloji.goarenacase.data.api.Api api) {
        return null;
    }
    
    public RepositoryModule() {
        super();
    }
}