package com.kgteknoloji.goarenacase.di;

import android.app.Activity;
import com.kgteknoloji.goarenacase.ui.LoginAct;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;

@Module(subcomponents = ActivityModule_ContLoginAct$app_debug.LoginActSubcomponent.class)
public abstract class ActivityModule_ContLoginAct$app_debug {
  private ActivityModule_ContLoginAct$app_debug() {}

  @Binds
  @IntoMap
  @ActivityKey(LoginAct.class)
  abstract AndroidInjector.Factory<? extends Activity> bindAndroidInjectorFactory(
      LoginActSubcomponent.Builder builder);

  @Subcomponent(modules = ViewModelModule.class)
  public interface LoginActSubcomponent extends AndroidInjector<LoginAct> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<LoginAct> {}
  }
}
