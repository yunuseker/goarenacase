package com.kgteknoloji.goarenacase.databinding;

import android.databinding.Bindable;
import android.databinding.DataBindingComponent;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.Guideline;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import com.kgteknoloji.goarenacase.viewmodel.VMLoginAct;

public abstract class ActLoginBinding extends ViewDataBinding {
  @NonNull
  public final Button btnLogin;

  @NonNull
  public final Guideline guidelineTop;

  @NonNull
  public final ProgressBar prgLogin;

  @NonNull
  public final EditText tvPassword;

  @NonNull
  public final EditText tvUsername;

  @Bindable
  protected VMLoginAct mViewmodel;

  protected ActLoginBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, Button btnLogin, Guideline guidelineTop, ProgressBar prgLogin,
      EditText tvPassword, EditText tvUsername) {
    super(_bindingComponent, _root, _localFieldCount);
    this.btnLogin = btnLogin;
    this.guidelineTop = guidelineTop;
    this.prgLogin = prgLogin;
    this.tvPassword = tvPassword;
    this.tvUsername = tvUsername;
  }

  public abstract void setViewmodel(@Nullable VMLoginAct viewmodel);

  @Nullable
  public VMLoginAct getViewmodel() {
    return mViewmodel;
  }

  @NonNull
  public static ActLoginBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActLoginBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ActLoginBinding>inflate(inflater, com.kgteknoloji.goarenacase.R.layout.act_login, root, attachToRoot, component);
  }

  @NonNull
  public static ActLoginBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActLoginBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ActLoginBinding>inflate(inflater, com.kgteknoloji.goarenacase.R.layout.act_login, null, false, component);
  }

  public static ActLoginBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static ActLoginBinding bind(@NonNull View view, @Nullable DataBindingComponent component) {
    return (ActLoginBinding)bind(component, view, com.kgteknoloji.goarenacase.R.layout.act_login);
  }
}
