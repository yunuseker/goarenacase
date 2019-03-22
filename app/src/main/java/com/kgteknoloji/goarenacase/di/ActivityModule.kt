package com.kgteknoloji.goarenacase.di

import com.kgteknoloji.goarenacase.ui.LoginAct
import com.kgteknoloji.goarenacase.ui.MainAct
import com.kgteknoloji.goarenacase.ui.ProfileFrg
import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 * Created by yunuseker on 20.3.2019.
 */
@Module
abstract class ActivityModule {

    @ContributesAndroidInjector(modules = arrayOf(ViewModelModule::class))
    internal abstract fun contLoginAct(): LoginAct

    @ContributesAndroidInjector(modules = arrayOf(ViewModelModule::class))
    internal abstract fun contMainAct(): MainAct
}