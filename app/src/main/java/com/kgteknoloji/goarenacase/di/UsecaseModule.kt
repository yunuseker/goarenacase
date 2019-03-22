package com.kgteknoloji.goarenacase.di

import com.kgteknoloji.goarenacase.data.repository.TodoRepository
import com.kgteknoloji.goarenacase.data.repository.UserRepository
import com.kgteknoloji.goarenacase.usecase.TodoUsecase
import com.kgteknoloji.goarenacase.usecase.UserUsecase
import com.kgteknoloji.goarenacase.util.DateFormatter
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by yunuseker on 20.3.2019.
 */
@Module(includes = arrayOf(RepositoryModule::class, FormatterModule::class))
class UsecaseModule {

    @Provides
    @Singleton
    fun provideUserUsecase(userRepository: UserRepository): UserUsecase {
        return UserUsecase(userRepository)
    }

    @Provides
    @Singleton
    fun provideTodoUsecase(todoRepository: TodoRepository,dateFormatter: DateFormatter): TodoUsecase {
        return TodoUsecase(todoRepository,dateFormatter)
    }
}
