package com.kgteknoloji.goarenacase.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0006\u0010\u0017\u001a\u00020\u0018R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\t\"\u0004\b\f\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\tR\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\tR\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\t\u00a8\u0006\u0019"}, d2 = {"Lcom/kgteknoloji/goarenacase/viewmodel/VMLoginAct;", "Lcom/kgteknoloji/goarenacase/base/BaseViewModel;", "loginUseCase", "Lcom/kgteknoloji/goarenacase/usecase/LoginUseCase;", "(Lcom/kgteknoloji/goarenacase/usecase/LoginUseCase;)V", "loginFail", "Landroid/arch/lifecycle/MutableLiveData;", "", "getLoginFail", "()Landroid/arch/lifecycle/MutableLiveData;", "loginSuccess", "getLoginSuccess", "setLoginSuccess", "(Landroid/arch/lifecycle/MutableLiveData;)V", "password", "", "getPassword", "progressStatus", "getProgressStatus", "username", "getUsername", "createLoginBody", "Lcom/kgteknoloji/goarenacase/data/dto/LoginBody;", "doLogin", "", "app_debug"})
public final class VMLoginAct extends com.kgteknoloji.goarenacase.base.BaseViewModel {
    @org.jetbrains.annotations.NotNull()
    private final android.arch.lifecycle.MutableLiveData<java.lang.String> username = null;
    @org.jetbrains.annotations.NotNull()
    private final android.arch.lifecycle.MutableLiveData<java.lang.String> password = null;
    @org.jetbrains.annotations.NotNull()
    private android.arch.lifecycle.MutableLiveData<java.lang.Boolean> loginSuccess;
    @org.jetbrains.annotations.NotNull()
    private final android.arch.lifecycle.MutableLiveData<java.lang.Boolean> loginFail = null;
    @org.jetbrains.annotations.NotNull()
    private final android.arch.lifecycle.MutableLiveData<java.lang.Boolean> progressStatus = null;
    private final com.kgteknoloji.goarenacase.usecase.LoginUseCase loginUseCase = null;
    
    @org.jetbrains.annotations.NotNull()
    public final android.arch.lifecycle.MutableLiveData<java.lang.String> getUsername() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.arch.lifecycle.MutableLiveData<java.lang.String> getPassword() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.arch.lifecycle.MutableLiveData<java.lang.Boolean> getLoginSuccess() {
        return null;
    }
    
    public final void setLoginSuccess(@org.jetbrains.annotations.NotNull()
    android.arch.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.arch.lifecycle.MutableLiveData<java.lang.Boolean> getLoginFail() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.arch.lifecycle.MutableLiveData<java.lang.Boolean> getProgressStatus() {
        return null;
    }
    
    public final void doLogin() {
    }
    
    private final com.kgteknoloji.goarenacase.data.dto.LoginBody createLoginBody(java.lang.String username, java.lang.String password) {
        return null;
    }
    
    @javax.inject.Inject()
    public VMLoginAct(@org.jetbrains.annotations.NotNull()
    com.kgteknoloji.goarenacase.usecase.LoginUseCase loginUseCase) {
        super();
    }
}