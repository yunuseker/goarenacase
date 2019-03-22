package com.kgteknoloji.goarenacase.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\r\u0010\u0003\u001a\u00020\u0004H!\u00a2\u0006\u0002\b\u0005J\r\u0010\u0006\u001a\u00020\u0007H!\u00a2\u0006\u0002\b\b\u00a8\u0006\t"}, d2 = {"Lcom/kgteknoloji/goarenacase/di/FragmentModule;", "", "()V", "contProfileFrg", "Lcom/kgteknoloji/goarenacase/ui/ProfileFrg;", "contProfileFrg$app_debug", "contTodoFrg", "Lcom/kgteknoloji/goarenacase/ui/TodoFrg;", "contTodoFrg$app_debug", "app_debug"})
@dagger.Module()
public abstract class FragmentModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.kgteknoloji.goarenacase.ui.ProfileFrg contProfileFrg$app_debug();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.kgteknoloji.goarenacase.ui.TodoFrg contTodoFrg$app_debug();
    
    public FragmentModule() {
        super();
    }
}