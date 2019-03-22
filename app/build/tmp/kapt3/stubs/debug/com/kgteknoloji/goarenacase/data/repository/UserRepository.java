package com.kgteknoloji.goarenacase.data.repository;

import java.lang.System;

/**
 * * Created by yunuseker on 20.3.2019.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bJ\u0006\u0010\f\u001a\u00020\rJ\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\bJ\u0006\u0010\u0010\u001a\u00020\rJ\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\rJ\u000e\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/kgteknoloji/goarenacase/data/repository/UserRepository;", "Lcom/kgteknoloji/goarenacase/base/BaseRepository;", "api", "Lcom/kgteknoloji/goarenacase/data/api/Api;", "sharedPreferences", "Landroid/content/SharedPreferences;", "(Lcom/kgteknoloji/goarenacase/data/api/Api;Landroid/content/SharedPreferences;)V", "doLogin", "Lio/reactivex/Observable;", "Lcom/kgteknoloji/goarenacase/data/dto/LoginDto;", "loginBody", "Lcom/kgteknoloji/goarenacase/data/dto/LoginBody;", "getAccessToken", "", "getUserProfile", "Lcom/kgteknoloji/goarenacase/data/dto/ProfileDto;", "getUsername", "saveAccessToken", "", "string", "saveUsername", "app_debug"})
public final class UserRepository extends com.kgteknoloji.goarenacase.base.BaseRepository {
    private final com.kgteknoloji.goarenacase.data.api.Api api = null;
    private final android.content.SharedPreferences sharedPreferences = null;
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<com.kgteknoloji.goarenacase.data.dto.LoginDto> doLogin(@org.jetbrains.annotations.NotNull()
    com.kgteknoloji.goarenacase.data.dto.LoginBody loginBody) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<com.kgteknoloji.goarenacase.data.dto.ProfileDto> getUserProfile() {
        return null;
    }
    
    public final void saveAccessToken(@org.jetbrains.annotations.NotNull()
    java.lang.String string) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAccessToken() {
        return null;
    }
    
    public final void saveUsername(@org.jetbrains.annotations.NotNull()
    java.lang.String string) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUsername() {
        return null;
    }
    
    @javax.inject.Inject()
    public UserRepository(@org.jetbrains.annotations.NotNull()
    com.kgteknoloji.goarenacase.data.api.Api api, @org.jetbrains.annotations.NotNull()
    android.content.SharedPreferences sharedPreferences) {
        super();
    }
}