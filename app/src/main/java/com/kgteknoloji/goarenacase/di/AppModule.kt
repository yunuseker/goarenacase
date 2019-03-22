package com.kgteknoloji.goarenacase.di

import android.app.Application
import android.content.Context
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by yunuseker on 20.3.2019.
 */
@Module
class AppModule{

    @Provides
    @Singleton
    fun provideContext(application: Application):Context{
        return application.applicationContext
    }
}