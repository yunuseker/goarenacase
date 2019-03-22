package com.kgteknoloji.goarenacase.di

import com.kgteknoloji.goarenacase.util.DateFormatter
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by yunuseker on 20.3.2019.
 */
@Module
class FormatterModule {

    @Singleton
    @Provides
    fun provideDateFormatter(): DateFormatter {
        return DateFormatter()
    }
}
