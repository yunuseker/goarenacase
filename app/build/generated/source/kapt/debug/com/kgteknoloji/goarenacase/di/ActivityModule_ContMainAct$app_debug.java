package com.kgteknoloji.goarenacase.di;

import android.app.Activity;
import com.kgteknoloji.goarenacase.ui.MainAct;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;

@Module(subcomponents = ActivityModule_ContMainAct$app_debug.MainActSubcomponent.class)
public abstract class ActivityModule_ContMainAct$app_debug {
  private ActivityModule_ContMainAct$app_debug() {}

  @Binds
  @IntoMap
  @ActivityKey(MainAct.class)
  abstract AndroidInjector.Factory<? extends Activity> bindAndroidInjectorFactory(
      MainActSubcomponent.Builder builder);

  @Subcomponent(modules = ViewModelModule.class)
  public interface MainActSubcomponent extends AndroidInjector<MainAct> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<MainAct> {}
  }
}
