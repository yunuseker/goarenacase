package com.kgteknoloji.goarenacase.databinding;

import android.databinding.Bindable;
import android.databinding.DataBindingComponent;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.kgteknoloji.goarenacase.viewmodel.VMToolbar;

public abstract class ToolbarBinding extends ViewDataBinding {
  @NonNull
  public final Toolbar toolbar;

  @NonNull
  public final ImageView toolbarBtnSearch;

  @Bindable
  protected VMToolbar mViewmodel;

  protected ToolbarBinding(DataBindingComponent _bindingComponent, View _root, int _localFieldCount,
      Toolbar toolbar, ImageView toolbarBtnSearch) {
    super(_bindingComponent, _root, _localFieldCount);
    this.toolbar = toolbar;
    this.toolbarBtnSearch = toolbarBtnSearch;
  }

  public abstract void setViewmodel(@Nullable VMToolbar viewmodel);

  @Nullable
  public VMToolbar getViewmodel() {
    return mViewmodel;
  }

  @NonNull
  public static ToolbarBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ToolbarBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ToolbarBinding>inflate(inflater, com.kgteknoloji.goarenacase.R.layout.toolbar, root, attachToRoot, component);
  }

  @NonNull
  public static ToolbarBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ToolbarBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ToolbarBinding>inflate(inflater, com.kgteknoloji.goarenacase.R.layout.toolbar, null, false, component);
  }

  public static ToolbarBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static ToolbarBinding bind(@NonNull View view, @Nullable DataBindingComponent component) {
    return (ToolbarBinding)bind(component, view, com.kgteknoloji.goarenacase.R.layout.toolbar);
  }
}
