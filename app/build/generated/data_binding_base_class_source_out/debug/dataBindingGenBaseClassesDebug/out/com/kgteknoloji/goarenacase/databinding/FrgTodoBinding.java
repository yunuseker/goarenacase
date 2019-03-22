package com.kgteknoloji.goarenacase.databinding;

import android.databinding.Bindable;
import android.databinding.DataBindingComponent;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.kgteknoloji.goarenacase.viewmodel.VMTodoFrg;

public abstract class FrgTodoBinding extends ViewDataBinding {
  @NonNull
  public final ImageView btnProfile;

  @NonNull
  public final RecyclerView rvTodos;

  @NonNull
  public final Toolbar toolbar;

  @Bindable
  protected VMTodoFrg mViewmodel;

  protected FrgTodoBinding(DataBindingComponent _bindingComponent, View _root, int _localFieldCount,
      ImageView btnProfile, RecyclerView rvTodos, Toolbar toolbar) {
    super(_bindingComponent, _root, _localFieldCount);
    this.btnProfile = btnProfile;
    this.rvTodos = rvTodos;
    this.toolbar = toolbar;
  }

  public abstract void setViewmodel(@Nullable VMTodoFrg viewmodel);

  @Nullable
  public VMTodoFrg getViewmodel() {
    return mViewmodel;
  }

  @NonNull
  public static FrgTodoBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FrgTodoBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FrgTodoBinding>inflate(inflater, com.kgteknoloji.goarenacase.R.layout.frg_todo, root, attachToRoot, component);
  }

  @NonNull
  public static FrgTodoBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FrgTodoBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FrgTodoBinding>inflate(inflater, com.kgteknoloji.goarenacase.R.layout.frg_todo, null, false, component);
  }

  public static FrgTodoBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static FrgTodoBinding bind(@NonNull View view, @Nullable DataBindingComponent component) {
    return (FrgTodoBinding)bind(component, view, com.kgteknoloji.goarenacase.R.layout.frg_todo);
  }
}
