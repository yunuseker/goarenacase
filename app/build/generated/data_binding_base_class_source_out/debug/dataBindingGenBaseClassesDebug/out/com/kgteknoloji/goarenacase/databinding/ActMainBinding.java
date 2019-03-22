package com.kgteknoloji.goarenacase.databinding;

import android.databinding.DataBindingComponent;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

public abstract class ActMainBinding extends ViewDataBinding {
  @NonNull
  public final FrameLayout container;

  protected ActMainBinding(DataBindingComponent _bindingComponent, View _root, int _localFieldCount,
      FrameLayout container) {
    super(_bindingComponent, _root, _localFieldCount);
    this.container = container;
  }

  @NonNull
  public static ActMainBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActMainBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ActMainBinding>inflate(inflater, com.kgteknoloji.goarenacase.R.layout.act_main, root, attachToRoot, component);
  }

  @NonNull
  public static ActMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ActMainBinding>inflate(inflater, com.kgteknoloji.goarenacase.R.layout.act_main, null, false, component);
  }

  public static ActMainBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static ActMainBinding bind(@NonNull View view, @Nullable DataBindingComponent component) {
    return (ActMainBinding)bind(component, view, com.kgteknoloji.goarenacase.R.layout.act_main);
  }
}
