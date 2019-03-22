package com.kgteknoloji.goarenacase.data.defination;

import java.lang.System;

@android.support.annotation.StringDef(value = {"FROM_SERVICE", "UNKNOWN", "UNKNOWN_HOST", "SOCKET_TIMEOUT", "SERVICE"})
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0087\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000\u00a8\u0006\u0003"}, d2 = {"Lcom/kgteknoloji/goarenacase/data/defination/ErrorType;", "", "Companion", "app_debug"})
@java.lang.annotation.Retention(value = java.lang.annotation.RetentionPolicy.SOURCE)
@kotlin.annotation.Retention(value = kotlin.annotation.AnnotationRetention.SOURCE)
public abstract @interface ErrorType {
    public static final com.kgteknoloji.goarenacase.data.defination.ErrorType.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FROM_SERVICE = "FROM_SERVICE";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String UNKNOWN = "UNKNOWN";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String UNKNOWN_HOST = "UNKNOWN_HOST";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SOCKET_TIMEOUT = "SOCKET_TIMEOUT";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SERVICE = "SERVICE";
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/kgteknoloji/goarenacase/data/defination/ErrorType$Companion;", "", "()V", "FROM_SERVICE", "", "SERVICE", "SOCKET_TIMEOUT", "UNKNOWN", "UNKNOWN_HOST", "app_debug"})
    public static final class Companion {
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String FROM_SERVICE = "FROM_SERVICE";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String UNKNOWN = "UNKNOWN";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String UNKNOWN_HOST = "UNKNOWN_HOST";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String SOCKET_TIMEOUT = "SOCKET_TIMEOUT";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String SERVICE = "SERVICE";
        
        private Companion() {
            super();
        }
    }
}