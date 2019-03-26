package com.kgteknoloji.goarenacase.di;

import java.lang.System;

/**
 * * Created by yunuseker on 20.3.2019.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007\u00a8\u0006\u000f"}, d2 = {"Lcom/kgteknoloji/goarenacase/di/UsecaseModule;", "", "()V", "provideGetProfileUseCase", "Lcom/kgteknoloji/goarenacase/usecase/GetProfileUseCase;", "userRepository", "Lcom/kgteknoloji/goarenacase/data/repository/UserRepository;", "provideLoginUseCase", "Lcom/kgteknoloji/goarenacase/usecase/LoginUseCase;", "provideTodoUsecase", "Lcom/kgteknoloji/goarenacase/usecase/TodoUsecase;", "todoRepository", "Lcom/kgteknoloji/goarenacase/data/repository/TodoRepository;", "dateFormatter", "Lcom/kgteknoloji/goarenacase/util/DateFormatter;", "app_debug"})
@dagger.Module(includes = {com.kgteknoloji.goarenacase.di.RepositoryModule.class, com.kgteknoloji.goarenacase.di.FormatterModule.class})
public final class UsecaseModule {
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.kgteknoloji.goarenacase.usecase.GetProfileUseCase provideGetProfileUseCase(@org.jetbrains.annotations.NotNull()
    com.kgteknoloji.goarenacase.data.repository.UserRepository userRepository) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.kgteknoloji.goarenacase.usecase.LoginUseCase provideLoginUseCase(@org.jetbrains.annotations.NotNull()
    com.kgteknoloji.goarenacase.data.repository.UserRepository userRepository) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.kgteknoloji.goarenacase.usecase.TodoUsecase provideTodoUsecase(@org.jetbrains.annotations.NotNull()
    com.kgteknoloji.goarenacase.data.repository.TodoRepository todoRepository, @org.jetbrains.annotations.NotNull()
    com.kgteknoloji.goarenacase.util.DateFormatter dateFormatter) {
        return null;
    }
    
    public UsecaseModule() {
        super();
    }
}