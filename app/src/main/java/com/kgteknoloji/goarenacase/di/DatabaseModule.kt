package com.kgteknoloji.goarenacase.di

import android.content.Context
import android.content.SharedPreferences
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by yunuseker on 20.3.2019.
 */
@Module(includes = arrayOf(AppModule::class))
class DatabaseModule{
    @Singleton
    @Provides
    fun providesSharedPreferences(context: Context): SharedPreferences {
        return context.getSharedPreferences("myDB", Context.MODE_PRIVATE)
    }

}