package com.kgteknoloji.goarenacase.viewmodel;

import java.lang.System;

/**
 * * Created by yunuseker on 20.3.2019.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\b\u001a\u00020\fR \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/kgteknoloji/goarenacase/viewmodel/VMProfileFrg;", "Lcom/kgteknoloji/goarenacase/base/BaseViewModel;", "userUsecase", "Lcom/kgteknoloji/goarenacase/usecase/UserUsecase;", "(Lcom/kgteknoloji/goarenacase/usecase/UserUsecase;)V", "profileData", "Landroid/arch/lifecycle/MutableLiveData;", "Lcom/kgteknoloji/goarenacase/ui/viewentity/ProfileViewEntity;", "getProfileData", "()Landroid/arch/lifecycle/MutableLiveData;", "setProfileData", "(Landroid/arch/lifecycle/MutableLiveData;)V", "", "app_debug"})
public final class VMProfileFrg extends com.kgteknoloji.goarenacase.base.BaseViewModel {
    @org.jetbrains.annotations.NotNull()
    private android.arch.lifecycle.MutableLiveData<com.kgteknoloji.goarenacase.ui.viewentity.ProfileViewEntity> profileData;
    private final com.kgteknoloji.goarenacase.usecase.UserUsecase userUsecase = null;
    
    @org.jetbrains.annotations.NotNull()
    public final android.arch.lifecycle.MutableLiveData<com.kgteknoloji.goarenacase.ui.viewentity.ProfileViewEntity> getProfileData() {
        return null;
    }
    
    public final void setProfileData(@org.jetbrains.annotations.NotNull()
    android.arch.lifecycle.MutableLiveData<com.kgteknoloji.goarenacase.ui.viewentity.ProfileViewEntity> p0) {
    }
    
    public final void getProfileData() {
    }
    
    @javax.inject.Inject()
    public VMProfileFrg(@org.jetbrains.annotations.NotNull()
    com.kgteknoloji.goarenacase.usecase.UserUsecase userUsecase) {
        super();
    }
}