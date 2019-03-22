package com.kgteknoloji.goarenacase.base;

import java.lang.System;

/**
 * * Created by yunuseker on 20.3.2019.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u00020\u00052\u00020\u0006B\u0005\u00a2\u0006\u0002\u0010\u0007J\u001e\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\u00162\u0006\u0010,\u001a\u00020\u00102\u0006\u0010-\u001a\u00020.J\u0012\u0010/\u001a\u00020*2\b\u00100\u001a\u0004\u0018\u000101H\u0014J\u0010\u00102\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u000103H\u0016R\u001c\u0010\b\u001a\u00028\u0000X\u0084.\u00a2\u0006\u0010\n\u0002\u0010\r\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR$\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0012\u0010\u0015\u001a\u00020\u0016X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0019\u001a\u00028\u0001X\u0084.\u00a2\u0006\u0010\n\u0002\u0010\u001e\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u0018\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00010 X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b!\u0010\"R\u001e\u0010#\u001a\u00020$8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b\'\u0010(\u00a8\u00064"}, d2 = {"Lcom/kgteknoloji/goarenacase/base/BaseActivity;", "DB", "Landroid/databinding/ViewDataBinding;", "VM", "Lcom/kgteknoloji/goarenacase/base/BaseViewModel;", "Landroid/support/v7/app/AppCompatActivity;", "Ldagger/android/support/HasSupportFragmentInjector;", "()V", "binding", "getBinding", "()Landroid/databinding/ViewDataBinding;", "setBinding", "(Landroid/databinding/ViewDataBinding;)V", "Landroid/databinding/ViewDataBinding;", "dispatchingAndroidInjector", "Ldagger/android/DispatchingAndroidInjector;", "Landroid/support/v4/app/Fragment;", "getDispatchingAndroidInjector", "()Ldagger/android/DispatchingAndroidInjector;", "setDispatchingAndroidInjector", "(Ldagger/android/DispatchingAndroidInjector;)V", "getLayoutRes", "", "getGetLayoutRes", "()I", "viewModel", "getViewModel", "()Lcom/kgteknoloji/goarenacase/base/BaseViewModel;", "setViewModel", "(Lcom/kgteknoloji/goarenacase/base/BaseViewModel;)V", "Lcom/kgteknoloji/goarenacase/base/BaseViewModel;", "viewModelClass", "Ljava/lang/Class;", "getViewModelClass", "()Ljava/lang/Class;", "viewModelFactory", "Landroid/arch/lifecycle/ViewModelProvider$Factory;", "getViewModelFactory", "()Landroid/arch/lifecycle/ViewModelProvider$Factory;", "setViewModelFactory", "(Landroid/arch/lifecycle/ViewModelProvider$Factory;)V", "loadFragment", "", "contanerId", "fragment", "addToBackStack", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "supportFragmentInjector", "Ldagger/android/AndroidInjector;", "app_debug"})
public abstract class BaseActivity<DB extends android.databinding.ViewDataBinding, VM extends com.kgteknoloji.goarenacase.base.BaseViewModel> extends android.support.v7.app.AppCompatActivity implements dagger.android.support.HasSupportFragmentInjector {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public android.arch.lifecycle.ViewModelProvider.Factory viewModelFactory;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public dagger.android.DispatchingAndroidInjector<android.support.v4.app.Fragment> dispatchingAndroidInjector;
    @org.jetbrains.annotations.NotNull()
    protected DB binding;
    @org.jetbrains.annotations.NotNull()
    protected VM viewModel;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final android.arch.lifecycle.ViewModelProvider.Factory getViewModelFactory() {
        return null;
    }
    
    public final void setViewModelFactory(@org.jetbrains.annotations.NotNull()
    android.arch.lifecycle.ViewModelProvider.Factory p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final dagger.android.DispatchingAndroidInjector<android.support.v4.app.Fragment> getDispatchingAndroidInjector() {
        return null;
    }
    
    public final void setDispatchingAndroidInjector(@org.jetbrains.annotations.NotNull()
    dagger.android.DispatchingAndroidInjector<android.support.v4.app.Fragment> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final DB getBinding() {
        return null;
    }
    
    protected final void setBinding(@org.jetbrains.annotations.NotNull()
    DB p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final VM getViewModel() {
        return null;
    }
    
    protected final void setViewModel(@org.jetbrains.annotations.NotNull()
    VM p0) {
    }
    
    public abstract int getGetLayoutRes();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.Class<VM> getViewModelClass();
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public dagger.android.AndroidInjector<android.support.v4.app.Fragment> supportFragmentInjector() {
        return null;
    }
    
    public final void loadFragment(int contanerId, @org.jetbrains.annotations.NotNull()
    android.support.v4.app.Fragment fragment, boolean addToBackStack) {
    }
    
    public BaseActivity() {
        super();
    }
}