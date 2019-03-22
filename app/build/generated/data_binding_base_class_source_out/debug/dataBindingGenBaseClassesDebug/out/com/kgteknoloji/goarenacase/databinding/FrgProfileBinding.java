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
import android.widget.TextView;
import com.kgteknoloji.goarenacase.viewmodel.VMProfileFrg;

public abstract class FrgProfileBinding extends ViewDataBinding {
  @NonNull
  public final ImageView btnBack;

  @NonNull
  public final Toolbar toolbar;

  @NonNull
  public final TextView tvEmail;

  @NonNull
  public final TextView tvUsername;

  @Bindable
  protected VMProfileFrg mViewmodel;

  protected FrgProfileBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, ImageView btnBack, Toolbar toolbar, TextView tvEmail,
      TextView tvUsername) {
    super(_bindingComponent, _root, _localFieldCount);
    this.btnBack = btnBack;
    this.toolbar = toolbar;
    this.tvEmail = tvEmail;
    this.tvUsername = tvUsername;
  }

  public abstract void setViewmodel(@Nullable VMProfileFrg viewmodel);

  @Nullable
  public VMProfileFrg getViewmodel() {
    return mViewmodel;
  }

  @NonNull
  public static FrgProfileBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FrgProfileBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FrgProfileBinding>inflate(inflater, com.kgteknoloji.goarenacase.R.layout.frg_profile, root, attachToRoot, component);
  }

  @NonNull
  public static FrgProfileBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FrgProfileBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FrgProfileBinding>inflate(inflater, com.kgteknoloji.goarenacase.R.layout.frg_profile, null, false, component);
  }

  public static FrgProfileBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static FrgProfileBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (FrgProfileBinding)bind(component, view, com.kgteknoloji.goarenacase.R.layout.frg_profile);
  }
}
