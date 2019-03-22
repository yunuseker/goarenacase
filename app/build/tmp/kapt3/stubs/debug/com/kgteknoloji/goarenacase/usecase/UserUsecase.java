package com.kgteknoloji.goarenacase.usecase;

import java.lang.System;

/**
 * * Created by yunuseker on 20.3.2019.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tJ\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/kgteknoloji/goarenacase/usecase/UserUsecase;", "Lcom/kgteknoloji/goarenacase/base/BaseUsecase;", "userRepository", "Lcom/kgteknoloji/goarenacase/data/repository/UserRepository;", "(Lcom/kgteknoloji/goarenacase/data/repository/UserRepository;)V", "doLogin", "Lio/reactivex/Observable;", "Lcom/kgteknoloji/goarenacase/data/dto/LoginDto;", "loginBody", "Lcom/kgteknoloji/goarenacase/data/dto/LoginBody;", "getProfile", "Lcom/kgteknoloji/goarenacase/ui/viewentity/ProfileViewEntity;", "app_debug"})
public final class UserUsecase extends com.kgteknoloji.goarenacase.base.BaseUsecase {
    private final com.kgteknoloji.goarenacase.data.repository.UserRepository userRepository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<com.kgteknoloji.goarenacase.data.dto.LoginDto> doLogin(@org.jetbrains.annotations.NotNull()
    com.kgteknoloji.goarenacase.data.dto.LoginBody loginBody) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<com.kgteknoloji.goarenacase.ui.viewentity.ProfileViewEntity> getProfile() {
        return null;
    }
    
    @javax.inject.Inject()
    public UserUsecase(@org.jetbrains.annotations.NotNull()
    com.kgteknoloji.goarenacase.data.repository.UserRepository userRepository) {
        super();
    }
}