package com.kgteknoloji.goarenacase.di;

import android.support.v4.app.Fragment;
import com.kgteknoloji.goarenacase.ui.TodoFrg;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;

@Module(subcomponents = FragmentModule_ContTodoFrg$app_debug.TodoFrgSubcomponent.class)
public abstract class FragmentModule_ContTodoFrg$app_debug {
  private FragmentModule_ContTodoFrg$app_debug() {}

  @Binds
  @IntoMap
  @FragmentKey(TodoFrg.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      TodoFrgSubcomponent.Builder builder);

  @Subcomponent
  public interface TodoFrgSubcomponent extends AndroidInjector<TodoFrg> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<TodoFrg> {}
  }
}
