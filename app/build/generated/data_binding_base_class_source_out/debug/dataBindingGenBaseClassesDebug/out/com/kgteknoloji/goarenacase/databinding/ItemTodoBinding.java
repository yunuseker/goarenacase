package com.kgteknoloji.goarenacase.databinding;

import android.databinding.Bindable;
import android.databinding.DataBindingComponent;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.kgteknoloji.goarenacase.ui.viewentity.TodoViewEntity;

public abstract class ItemTodoBinding extends ViewDataBinding {
  @NonNull
  public final TextView tvDate;

  @NonNull
  public final TextView tvStatus;

  @NonNull
  public final TextView tvTitle;

  @Bindable
  protected TodoViewEntity mData;

  protected ItemTodoBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, TextView tvDate, TextView tvStatus, TextView tvTitle) {
    super(_bindingComponent, _root, _localFieldCount);
    this.tvDate = tvDate;
    this.tvStatus = tvStatus;
    this.tvTitle = tvTitle;
  }

  public abstract void setData(@Nullable TodoViewEntity data);

  @Nullable
  public TodoViewEntity getData() {
    return mData;
  }

  @NonNull
  public static ItemTodoBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ItemTodoBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ItemTodoBinding>inflate(inflater, com.kgteknoloji.goarenacase.R.layout.item_todo, root, attachToRoot, component);
  }

  @NonNull
  public static ItemTodoBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ItemTodoBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ItemTodoBinding>inflate(inflater, com.kgteknoloji.goarenacase.R.layout.item_todo, null, false, component);
  }

  public static ItemTodoBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static ItemTodoBinding bind(@NonNull View view, @Nullable DataBindingComponent component) {
    return (ItemTodoBinding)bind(component, view, com.kgteknoloji.goarenacase.R.layout.item_todo);
  }
}
