package com.kgteknoloji.goarenacase.di;

import java.lang.System;

/**
 * * Created by yunuseker on 20.3.2019.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\u0007"}, d2 = {"Lcom/kgteknoloji/goarenacase/di/DatabaseModule;", "", "()V", "providesSharedPreferences", "Landroid/content/SharedPreferences;", "context", "Landroid/content/Context;", "app_debug"})
@dagger.Module(includes = {com.kgteknoloji.goarenacase.di.AppModule.class})
public final class DatabaseModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final android.content.SharedPreferences providesSharedPreferences(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    public DatabaseModule() {
        super();
    }
}