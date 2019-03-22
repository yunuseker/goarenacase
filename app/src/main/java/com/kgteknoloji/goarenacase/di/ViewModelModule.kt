package com.kgteknoloji.goarenacase.di

import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProvider
import com.kgteknoloji.goarenacase.viewmodel.*
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

/**
 * Created by yunuseker on 20.3.2019.
 */
@Module
abstract class ViewModelModule{
    @Binds
    @IntoMap
    @ViewModelKey(VMLoginAct::class)
    internal abstract fun vmLoginAct(viewModel: VMLoginAct):ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(VMMainAct::class)
    internal abstract fun vmMain(vmMain: VMMainAct): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(VMProfileFrg::class)
    internal abstract fun vmProfileFrg(vmProfileFrg: VMProfileFrg): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(VMTodoFrg::class)
    internal abstract fun vmTodoFrg(vmTodoFrg: VMTodoFrg): ViewModel

    @Binds
    internal abstract fun bindViewModelFactory(factory: ViewModelFactory):ViewModelProvider.Factory
}