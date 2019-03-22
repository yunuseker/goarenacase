package com.kgteknoloji.goarenacase.di;

import java.lang.System;

/**
 * * Created by yunuseker on 20.3.2019.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H!\u00a2\u0006\u0002\b\u0007J\u0015\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH!\u00a2\u0006\u0002\b\fJ\u0015\u0010\r\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000eH!\u00a2\u0006\u0002\b\u000fJ\u0015\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u0011H!\u00a2\u0006\u0002\b\u0012J\u0015\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0014H!\u00a2\u0006\u0002\b\u0015\u00a8\u0006\u0016"}, d2 = {"Lcom/kgteknoloji/goarenacase/di/ViewModelModule;", "", "()V", "bindViewModelFactory", "Landroid/arch/lifecycle/ViewModelProvider$Factory;", "factory", "Lcom/kgteknoloji/goarenacase/viewmodel/ViewModelFactory;", "bindViewModelFactory$app_debug", "vmLoginAct", "Landroid/arch/lifecycle/ViewModel;", "viewModel", "Lcom/kgteknoloji/goarenacase/viewmodel/VMLoginAct;", "vmLoginAct$app_debug", "vmMain", "Lcom/kgteknoloji/goarenacase/viewmodel/VMMainAct;", "vmMain$app_debug", "vmProfileFrg", "Lcom/kgteknoloji/goarenacase/viewmodel/VMProfileFrg;", "vmProfileFrg$app_debug", "vmTodoFrg", "Lcom/kgteknoloji/goarenacase/viewmodel/VMTodoFrg;", "vmTodoFrg$app_debug", "app_debug"})
@dagger.Module()
public abstract class ViewModelModule {
    
    @org.jetbrains.annotations.NotNull()
    @ViewModelKey(value = com.kgteknoloji.goarenacase.viewmodel.VMLoginAct.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract android.arch.lifecycle.ViewModel vmLoginAct$app_debug(@org.jetbrains.annotations.NotNull()
    com.kgteknoloji.goarenacase.viewmodel.VMLoginAct viewModel);
    
    @org.jetbrains.annotations.NotNull()
    @ViewModelKey(value = com.kgteknoloji.goarenacase.viewmodel.VMMainAct.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract android.arch.lifecycle.ViewModel vmMain$app_debug(@org.jetbrains.annotations.NotNull()
    com.kgteknoloji.goarenacase.viewmodel.VMMainAct vmMain);
    
    @org.jetbrains.annotations.NotNull()
    @ViewModelKey(value = com.kgteknoloji.goarenacase.viewmodel.VMProfileFrg.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract android.arch.lifecycle.ViewModel vmProfileFrg$app_debug(@org.jetbrains.annotations.NotNull()
    com.kgteknoloji.goarenacase.viewmodel.VMProfileFrg vmProfileFrg);
    
    @org.jetbrains.annotations.NotNull()
    @ViewModelKey(value = com.kgteknoloji.goarenacase.viewmodel.VMTodoFrg.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract android.arch.lifecycle.ViewModel vmTodoFrg$app_debug(@org.jetbrains.annotations.NotNull()
    com.kgteknoloji.goarenacase.viewmodel.VMTodoFrg vmTodoFrg);
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    public abstract android.arch.lifecycle.ViewModelProvider.Factory bindViewModelFactory$app_debug(@org.jetbrains.annotations.NotNull()
    com.kgteknoloji.goarenacase.viewmodel.ViewModelFactory factory);
    
    public ViewModelModule() {
        super();
    }
}