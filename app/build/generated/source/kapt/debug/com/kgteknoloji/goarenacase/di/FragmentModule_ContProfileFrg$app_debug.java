package com.kgteknoloji.goarenacase.di;

import android.support.v4.app.Fragment;
import com.kgteknoloji.goarenacase.ui.ProfileFrg;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;

@Module(subcomponents = FragmentModule_ContProfileFrg$app_debug.ProfileFrgSubcomponent.class)
public abstract class FragmentModule_ContProfileFrg$app_debug {
  private FragmentModule_ContProfileFrg$app_debug() {}

  @Binds
  @IntoMap
  @FragmentKey(ProfileFrg.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      ProfileFrgSubcomponent.Builder builder);

  @Subcomponent
  public interface ProfileFrgSubcomponent extends AndroidInjector<ProfileFrg> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<ProfileFrg> {}
  }
}
