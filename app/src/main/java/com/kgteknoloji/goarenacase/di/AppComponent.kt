package com.kgteknoloji.goarenacase.di

import android.app.Application
import com.kgteknoloji.goarenacase.App
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import javax.inject.Singleton

/**
 * Created by yunuseker on 20.3.2019.
 */
@Singleton
@Component(
        modules = arrayOf(
                AndroidInjectionModule::class,
                AppModule::class,
                FragmentModule::class,
                ActivityModule::class,
                ViewModelModule::class,
                UsecaseModule::class,
                RepositoryModule::class,
                FormatterModule::class
        )
)
interface AppComponent {
    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: Application): Builder

        fun build(): AppComponent
    }

    fun inject(app: App)
}