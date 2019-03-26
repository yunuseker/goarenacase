package com.kgteknoloji.goarenacase.base;

import java.lang.System;

/**
 * * Created by yunuseker on 20.3.2019.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0004J\b\u0010\u0010\u001a\u00020\rH\u0014R\u0014\u0010\u0003\u001a\u00020\u0004X\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0011"}, d2 = {"Lcom/kgteknoloji/goarenacase/base/BaseViewModel;", "Landroid/arch/lifecycle/ViewModel;", "()V", "disposables", "Lio/reactivex/disposables/CompositeDisposable;", "getDisposables", "()Lio/reactivex/disposables/CompositeDisposable;", "errorMessage", "Landroid/arch/lifecycle/MutableLiveData;", "", "getErrorMessage", "()Landroid/arch/lifecycle/MutableLiveData;", "handleError", "", "error", "", "onCleared", "app_debug"})
public class BaseViewModel extends android.arch.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final android.arch.lifecycle.MutableLiveData<java.lang.String> errorMessage = null;
    @org.jetbrains.annotations.NotNull()
    private final io.reactivex.disposables.CompositeDisposable disposables = null;
    
    @org.jetbrains.annotations.NotNull()
    public final android.arch.lifecycle.MutableLiveData<java.lang.String> getErrorMessage() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final io.reactivex.disposables.CompositeDisposable getDisposables() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    protected final void handleError(@org.jetbrains.annotations.NotNull()
    java.lang.Throwable error) {
    }
    
    public BaseViewModel() {
        super();
    }
}