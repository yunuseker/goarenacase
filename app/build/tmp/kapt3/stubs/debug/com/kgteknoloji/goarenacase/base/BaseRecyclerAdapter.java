package com.kgteknoloji.goarenacase.base;

import java.lang.System;

/**
 * * Created by yunuseker on 20.3.2019.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u00030\u0002B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\t\u001a\u00020\u0005H\u0016J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0005H\u0016J\u001e\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u000b\u001a\u00020\u0005H\u0016J\u001e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0005H\u0016J\u0016\u0010\u0013\u001a\u00020\r2\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0015R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/kgteknoloji/goarenacase/base/BaseRecyclerAdapter;", "DATA", "Landroid/support/v7/widget/RecyclerView$Adapter;", "Lcom/kgteknoloji/goarenacase/base/BaseRecyclerViewHolder;", "singleLayout", "", "(I)V", "list", "", "getItemCount", "getItemViewType", "position", "onBindViewHolder", "", "baseRecyclerViewHolder", "onCreateViewHolder", "viewGroup", "Landroid/view/ViewGroup;", "viewType", "setData", "data", "", "app_debug"})
public final class BaseRecyclerAdapter<DATA extends java.lang.Object> extends android.support.v7.widget.RecyclerView.Adapter<com.kgteknoloji.goarenacase.base.BaseRecyclerViewHolder<DATA>> {
    private java.util.List<DATA> list;
    private final int singleLayout = 0;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.kgteknoloji.goarenacase.base.BaseRecyclerViewHolder<DATA> onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup viewGroup, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.kgteknoloji.goarenacase.base.BaseRecyclerViewHolder<DATA> baseRecyclerViewHolder, int position) {
    }
    
    @java.lang.Override()
    public int getItemViewType(int position) {
        return 0;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public final void setData(@org.jetbrains.annotations.Nullable()
    java.util.List<? extends DATA> data) {
    }
    
    public BaseRecyclerAdapter(int singleLayout) {
        super();
    }
}