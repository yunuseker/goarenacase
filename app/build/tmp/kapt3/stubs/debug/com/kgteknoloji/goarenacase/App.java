package com.kgteknoloji.goarenacase;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\fH\u0016J\b\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0002R$\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n\u00a8\u0006\u0010"}, d2 = {"Lcom/kgteknoloji/goarenacase/App;", "Landroid/app/Application;", "Ldagger/android/HasActivityInjector;", "()V", "activityDispatchingAndroidInjector", "Ldagger/android/DispatchingAndroidInjector;", "Landroid/app/Activity;", "getActivityDispatchingAndroidInjector", "()Ldagger/android/DispatchingAndroidInjector;", "setActivityDispatchingAndroidInjector", "(Ldagger/android/DispatchingAndroidInjector;)V", "activityInjector", "Ldagger/android/AndroidInjector;", "onCreate", "", "setupDagger", "app_debug"})
public final class App extends android.app.Application implements dagger.android.HasActivityInjector {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public dagger.android.DispatchingAndroidInjector<android.app.Activity> activityDispatchingAndroidInjector;
    
    @org.jetbrains.annotations.NotNull()
    public final dagger.android.DispatchingAndroidInjector<android.app.Activity> getActivityDispatchingAndroidInjector() {
        return null;
    }
    
    public final void setActivityDispatchingAndroidInjector(@org.jetbrains.annotations.NotNull()
    dagger.android.DispatchingAndroidInjector<android.app.Activity> p0) {
    }
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public dagger.android.AndroidInjector<android.app.Activity> activityInjector() {
        return null;
    }
    
    private final void setupDagger() {
    }
    
    public App() {
        super();
    }
}