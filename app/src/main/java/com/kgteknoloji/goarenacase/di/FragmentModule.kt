package com.kgteknoloji.goarenacase.di

import com.kgteknoloji.goarenacase.ui.FaqFrg
import com.kgteknoloji.goarenacase.ui.ProfileFrg
import com.kgteknoloji.goarenacase.ui.TodoFrg
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class FragmentModule {
    @ContributesAndroidInjector
    internal abstract fun contProfileFrg(): ProfileFrg

    @ContributesAndroidInjector
    internal abstract fun contTodoFrg(): TodoFrg

    @ContributesAndroidInjector
    internal abstract fun contFaqFrg(): FaqFrg

}