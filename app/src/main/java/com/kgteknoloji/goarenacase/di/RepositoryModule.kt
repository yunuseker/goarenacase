package com.kgteknoloji.goarenacase.di

import android.content.SharedPreferences
import com.kgteknoloji.goarenacase.data.api.Api
import com.kgteknoloji.goarenacase.data.repository.TodoRepository
import com.kgteknoloji.goarenacase.data.repository.UserRepository
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by yunuseker on 20.3.2019.
 */
@Module(includes = arrayOf(DatabaseModule::class, NetworkModule::class))
class RepositoryModule {

    @Provides
    @Singleton
    fun provideUserRepository(api: Api, sharedPreferences: SharedPreferences): UserRepository {
        return UserRepository(api,sharedPreferences)
    }

    @Provides
    @Singleton
    fun provideTodoRepository(api: Api): TodoRepository {
        return TodoRepository(api)
    }

}