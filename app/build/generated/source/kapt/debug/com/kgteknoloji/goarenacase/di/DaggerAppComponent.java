// Generated by Dagger (https://google.github.io/dagger).
package com.kgteknoloji.goarenacase.di;

import android.app.Activity;
import android.app.Application;
import android.arch.lifecycle.ViewModel;
import android.content.Context;
import android.content.SharedPreferences;
import android.support.v4.app.Fragment;
import com.google.gson.Gson;
import com.kgteknoloji.goarenacase.App;
import com.kgteknoloji.goarenacase.App_MembersInjector;
import com.kgteknoloji.goarenacase.base.BaseActivity_MembersInjector;
import com.kgteknoloji.goarenacase.base.BaseFragment_MembersInjector;
import com.kgteknoloji.goarenacase.data.api.Api;
import com.kgteknoloji.goarenacase.data.repository.TodoRepository;
import com.kgteknoloji.goarenacase.data.repository.UserRepository;
import com.kgteknoloji.goarenacase.ui.LoginAct;
import com.kgteknoloji.goarenacase.ui.MainAct;
import com.kgteknoloji.goarenacase.ui.ProfileFrg;
import com.kgteknoloji.goarenacase.ui.TodoFrg;
import com.kgteknoloji.goarenacase.usecase.TodoUsecase;
import com.kgteknoloji.goarenacase.usecase.UserUsecase;
import com.kgteknoloji.goarenacase.util.DateFormatter;
import com.kgteknoloji.goarenacase.viewmodel.VMLoginAct;
import com.kgteknoloji.goarenacase.viewmodel.VMLoginAct_Factory;
import com.kgteknoloji.goarenacase.viewmodel.VMMainAct;
import com.kgteknoloji.goarenacase.viewmodel.VMMainAct_Factory;
import com.kgteknoloji.goarenacase.viewmodel.VMProfileFrg;
import com.kgteknoloji.goarenacase.viewmodel.VMProfileFrg_Factory;
import com.kgteknoloji.goarenacase.viewmodel.VMTodoFrg;
import com.kgteknoloji.goarenacase.viewmodel.VMTodoFrg_Factory;
import com.kgteknoloji.goarenacase.viewmodel.ViewModelFactory;
import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.DispatchingAndroidInjector_Factory;
import dagger.internal.DoubleCheck;
import dagger.internal.InstanceFactory;
import dagger.internal.MapBuilder;
import dagger.internal.Preconditions;
import java.util.Map;
import javax.inject.Provider;
import okhttp3.OkHttpClient;

public final class DaggerAppComponent implements AppComponent {
  private Provider<ActivityModule_ContLoginAct$app_debug.LoginActSubcomponent.Builder>
      loginActSubcomponentBuilderProvider;

  private Provider<ActivityModule_ContMainAct$app_debug.MainActSubcomponent.Builder>
      mainActSubcomponentBuilderProvider;

  private Provider<Application> applicationProvider;

  private Provider<Context> provideContextProvider;

  private Provider<SharedPreferences> providesSharedPreferencesProvider;

  private Provider<OkHttpClient> provideOkHttpBuilderProvider;

  private Provider<Gson> provideGsonProvider;

  private Provider<Api> provideApiServiceProvider;

  private Provider<UserRepository> provideUserRepositoryProvider;

  private Provider<UserUsecase> provideUserUsecaseProvider;

  private Provider<TodoRepository> provideTodoRepositoryProvider;

  private Provider<DateFormatter> provideDateFormatterProvider;

  private Provider<TodoUsecase> provideTodoUsecaseProvider;

  private Provider<FragmentModule_ContProfileFrg$app_debug.ProfileFrgSubcomponent.Builder>
      profileFrgSubcomponentBuilderProvider;

  private Provider<FragmentModule_ContTodoFrg$app_debug.TodoFrgSubcomponent.Builder>
      todoFrgSubcomponentBuilderProvider;

  private DaggerAppComponent(Builder builder) {
    initialize(builder);
  }

  public static AppComponent.Builder builder() {
    return new Builder();
  }

  private Map<Class<? extends Activity>, Provider<AndroidInjector.Factory<? extends Activity>>>
      getMapOfClassOfAndProviderOfFactoryOf() {
    return MapBuilder
        .<Class<? extends Activity>, Provider<AndroidInjector.Factory<? extends Activity>>>
            newMapBuilder(2)
        .put(LoginAct.class, (Provider) loginActSubcomponentBuilderProvider)
        .put(MainAct.class, (Provider) mainActSubcomponentBuilderProvider)
        .build();
  }

  private DispatchingAndroidInjector<Activity> getDispatchingAndroidInjectorOfActivity() {
    return DispatchingAndroidInjector_Factory.newDispatchingAndroidInjector(
        getMapOfClassOfAndProviderOfFactoryOf());
  }

  @SuppressWarnings("unchecked")
  private void initialize(final Builder builder) {
    this.loginActSubcomponentBuilderProvider =
        new Provider<ActivityModule_ContLoginAct$app_debug.LoginActSubcomponent.Builder>() {
          @Override
          public ActivityModule_ContLoginAct$app_debug.LoginActSubcomponent.Builder get() {
            return new LoginActSubcomponentBuilder();
          }
        };
    this.mainActSubcomponentBuilderProvider =
        new Provider<ActivityModule_ContMainAct$app_debug.MainActSubcomponent.Builder>() {
          @Override
          public ActivityModule_ContMainAct$app_debug.MainActSubcomponent.Builder get() {
            return new MainActSubcomponentBuilder();
          }
        };
    this.applicationProvider = InstanceFactory.create(builder.application);
    this.provideContextProvider =
        DoubleCheck.provider(
            AppModule_ProvideContextFactory.create(builder.appModule, applicationProvider));
    this.providesSharedPreferencesProvider =
        DoubleCheck.provider(
            DatabaseModule_ProvidesSharedPreferencesFactory.create(
                builder.databaseModule, provideContextProvider));
    this.provideOkHttpBuilderProvider =
        DoubleCheck.provider(
            NetworkModule_ProvideOkHttpBuilderFactory.create(
                builder.networkModule, providesSharedPreferencesProvider));
    this.provideGsonProvider =
        DoubleCheck.provider(NetworkModule_ProvideGsonFactory.create(builder.networkModule));
    this.provideApiServiceProvider =
        DoubleCheck.provider(
            NetworkModule_ProvideApiServiceFactory.create(
                builder.networkModule, provideOkHttpBuilderProvider, provideGsonProvider));
    this.provideUserRepositoryProvider =
        DoubleCheck.provider(
            RepositoryModule_ProvideUserRepositoryFactory.create(
                builder.repositoryModule,
                provideApiServiceProvider,
                providesSharedPreferencesProvider));
    this.provideUserUsecaseProvider =
        DoubleCheck.provider(
            UsecaseModule_ProvideUserUsecaseFactory.create(
                builder.usecaseModule, provideUserRepositoryProvider));
    this.provideTodoRepositoryProvider =
        DoubleCheck.provider(
            RepositoryModule_ProvideTodoRepositoryFactory.create(
                builder.repositoryModule, provideApiServiceProvider));
    this.provideDateFormatterProvider =
        DoubleCheck.provider(
            FormatterModule_ProvideDateFormatterFactory.create(builder.formatterModule));
    this.provideTodoUsecaseProvider =
        DoubleCheck.provider(
            UsecaseModule_ProvideTodoUsecaseFactory.create(
                builder.usecaseModule,
                provideTodoRepositoryProvider,
                provideDateFormatterProvider));
    this.profileFrgSubcomponentBuilderProvider =
        new Provider<FragmentModule_ContProfileFrg$app_debug.ProfileFrgSubcomponent.Builder>() {
          @Override
          public FragmentModule_ContProfileFrg$app_debug.ProfileFrgSubcomponent.Builder get() {
            return new ProfileFrgSubcomponentBuilder();
          }
        };
    this.todoFrgSubcomponentBuilderProvider =
        new Provider<FragmentModule_ContTodoFrg$app_debug.TodoFrgSubcomponent.Builder>() {
          @Override
          public FragmentModule_ContTodoFrg$app_debug.TodoFrgSubcomponent.Builder get() {
            return new TodoFrgSubcomponentBuilder();
          }
        };
  }

  @Override
  public void inject(App app) {
    injectApp(app);
  }

  private App injectApp(App instance) {
    App_MembersInjector.injectActivityDispatchingAndroidInjector(
        instance, getDispatchingAndroidInjectorOfActivity());
    return instance;
  }

  private static final class Builder implements AppComponent.Builder {
    private AppModule appModule;

    private DatabaseModule databaseModule;

    private NetworkModule networkModule;

    private RepositoryModule repositoryModule;

    private UsecaseModule usecaseModule;

    private FormatterModule formatterModule;

    private Application application;

    @Override
    public AppComponent build() {
      if (appModule == null) {
        this.appModule = new AppModule();
      }
      if (databaseModule == null) {
        this.databaseModule = new DatabaseModule();
      }
      if (networkModule == null) {
        this.networkModule = new NetworkModule();
      }
      if (repositoryModule == null) {
        this.repositoryModule = new RepositoryModule();
      }
      if (usecaseModule == null) {
        this.usecaseModule = new UsecaseModule();
      }
      if (formatterModule == null) {
        this.formatterModule = new FormatterModule();
      }
      if (application == null) {
        throw new IllegalStateException(Application.class.getCanonicalName() + " must be set");
      }
      return new DaggerAppComponent(this);
    }

    @Override
    public Builder application(Application application) {
      this.application = Preconditions.checkNotNull(application);
      return this;
    }
  }

  private final class LoginActSubcomponentBuilder
      extends ActivityModule_ContLoginAct$app_debug.LoginActSubcomponent.Builder {
    private LoginAct seedInstance;

    @Override
    public ActivityModule_ContLoginAct$app_debug.LoginActSubcomponent build() {
      if (seedInstance == null) {
        throw new IllegalStateException(LoginAct.class.getCanonicalName() + " must be set");
      }
      return new LoginActSubcomponentImpl(this);
    }

    @Override
    public void seedInstance(LoginAct arg0) {
      this.seedInstance = Preconditions.checkNotNull(arg0);
    }
  }

  private final class LoginActSubcomponentImpl
      implements ActivityModule_ContLoginAct$app_debug.LoginActSubcomponent {
    private VMLoginAct_Factory vMLoginActProvider;

    private VMProfileFrg_Factory vMProfileFrgProvider;

    private VMTodoFrg_Factory vMTodoFrgProvider;

    private LoginActSubcomponentImpl(LoginActSubcomponentBuilder builder) {
      initialize(builder);
    }

    private Map<Class<? extends ViewModel>, Provider<ViewModel>>
        getMapOfClassOfAndProviderOfViewModel() {
      return MapBuilder.<Class<? extends ViewModel>, Provider<ViewModel>>newMapBuilder(4)
          .put(VMLoginAct.class, (Provider) vMLoginActProvider)
          .put(VMMainAct.class, (Provider) VMMainAct_Factory.create())
          .put(VMProfileFrg.class, (Provider) vMProfileFrgProvider)
          .put(VMTodoFrg.class, (Provider) vMTodoFrgProvider)
          .build();
    }

    private ViewModelFactory getViewModelFactory() {
      return new ViewModelFactory(getMapOfClassOfAndProviderOfViewModel());
    }

    private Map<Class<? extends Fragment>, Provider<AndroidInjector.Factory<? extends Fragment>>>
        getMapOfClassOfAndProviderOfFactoryOf() {
      return MapBuilder
          .<Class<? extends Fragment>, Provider<AndroidInjector.Factory<? extends Fragment>>>
              newMapBuilder(2)
          .put(
              ProfileFrg.class,
              (Provider) DaggerAppComponent.this.profileFrgSubcomponentBuilderProvider)
          .put(TodoFrg.class, (Provider) DaggerAppComponent.this.todoFrgSubcomponentBuilderProvider)
          .build();
    }

    private DispatchingAndroidInjector<Fragment> getDispatchingAndroidInjectorOfFragment() {
      return DispatchingAndroidInjector_Factory.newDispatchingAndroidInjector(
          getMapOfClassOfAndProviderOfFactoryOf());
    }

    @SuppressWarnings("unchecked")
    private void initialize(final LoginActSubcomponentBuilder builder) {
      this.vMLoginActProvider =
          VMLoginAct_Factory.create(DaggerAppComponent.this.provideUserUsecaseProvider);
      this.vMProfileFrgProvider =
          VMProfileFrg_Factory.create(DaggerAppComponent.this.provideUserUsecaseProvider);
      this.vMTodoFrgProvider =
          VMTodoFrg_Factory.create(DaggerAppComponent.this.provideTodoUsecaseProvider);
    }

    @Override
    public void inject(LoginAct arg0) {
      injectLoginAct(arg0);
    }

    private LoginAct injectLoginAct(LoginAct instance) {
      BaseActivity_MembersInjector.injectViewModelFactory(instance, getViewModelFactory());
      BaseActivity_MembersInjector.injectDispatchingAndroidInjector(
          instance, getDispatchingAndroidInjectorOfFragment());
      return instance;
    }
  }

  private final class MainActSubcomponentBuilder
      extends ActivityModule_ContMainAct$app_debug.MainActSubcomponent.Builder {
    private MainAct seedInstance;

    @Override
    public ActivityModule_ContMainAct$app_debug.MainActSubcomponent build() {
      if (seedInstance == null) {
        throw new IllegalStateException(MainAct.class.getCanonicalName() + " must be set");
      }
      return new MainActSubcomponentImpl(this);
    }

    @Override
    public void seedInstance(MainAct arg0) {
      this.seedInstance = Preconditions.checkNotNull(arg0);
    }
  }

  private final class MainActSubcomponentImpl
      implements ActivityModule_ContMainAct$app_debug.MainActSubcomponent {
    private VMLoginAct_Factory vMLoginActProvider;

    private VMProfileFrg_Factory vMProfileFrgProvider;

    private VMTodoFrg_Factory vMTodoFrgProvider;

    private MainActSubcomponentImpl(MainActSubcomponentBuilder builder) {
      initialize(builder);
    }

    private Map<Class<? extends ViewModel>, Provider<ViewModel>>
        getMapOfClassOfAndProviderOfViewModel() {
      return MapBuilder.<Class<? extends ViewModel>, Provider<ViewModel>>newMapBuilder(4)
          .put(VMLoginAct.class, (Provider) vMLoginActProvider)
          .put(VMMainAct.class, (Provider) VMMainAct_Factory.create())
          .put(VMProfileFrg.class, (Provider) vMProfileFrgProvider)
          .put(VMTodoFrg.class, (Provider) vMTodoFrgProvider)
          .build();
    }

    private ViewModelFactory getViewModelFactory() {
      return new ViewModelFactory(getMapOfClassOfAndProviderOfViewModel());
    }

    private Map<Class<? extends Fragment>, Provider<AndroidInjector.Factory<? extends Fragment>>>
        getMapOfClassOfAndProviderOfFactoryOf() {
      return MapBuilder
          .<Class<? extends Fragment>, Provider<AndroidInjector.Factory<? extends Fragment>>>
              newMapBuilder(2)
          .put(
              ProfileFrg.class,
              (Provider) DaggerAppComponent.this.profileFrgSubcomponentBuilderProvider)
          .put(TodoFrg.class, (Provider) DaggerAppComponent.this.todoFrgSubcomponentBuilderProvider)
          .build();
    }

    private DispatchingAndroidInjector<Fragment> getDispatchingAndroidInjectorOfFragment() {
      return DispatchingAndroidInjector_Factory.newDispatchingAndroidInjector(
          getMapOfClassOfAndProviderOfFactoryOf());
    }

    @SuppressWarnings("unchecked")
    private void initialize(final MainActSubcomponentBuilder builder) {
      this.vMLoginActProvider =
          VMLoginAct_Factory.create(DaggerAppComponent.this.provideUserUsecaseProvider);
      this.vMProfileFrgProvider =
          VMProfileFrg_Factory.create(DaggerAppComponent.this.provideUserUsecaseProvider);
      this.vMTodoFrgProvider =
          VMTodoFrg_Factory.create(DaggerAppComponent.this.provideTodoUsecaseProvider);
    }

    @Override
    public void inject(MainAct arg0) {
      injectMainAct(arg0);
    }

    private MainAct injectMainAct(MainAct instance) {
      BaseActivity_MembersInjector.injectViewModelFactory(instance, getViewModelFactory());
      BaseActivity_MembersInjector.injectDispatchingAndroidInjector(
          instance, getDispatchingAndroidInjectorOfFragment());
      return instance;
    }
  }

  private final class ProfileFrgSubcomponentBuilder
      extends FragmentModule_ContProfileFrg$app_debug.ProfileFrgSubcomponent.Builder {
    private ProfileFrg seedInstance;

    @Override
    public FragmentModule_ContProfileFrg$app_debug.ProfileFrgSubcomponent build() {
      if (seedInstance == null) {
        throw new IllegalStateException(ProfileFrg.class.getCanonicalName() + " must be set");
      }
      return new ProfileFrgSubcomponentImpl(this);
    }

    @Override
    public void seedInstance(ProfileFrg arg0) {
      this.seedInstance = Preconditions.checkNotNull(arg0);
    }
  }

  private final class ProfileFrgSubcomponentImpl
      implements FragmentModule_ContProfileFrg$app_debug.ProfileFrgSubcomponent {
    private VMLoginAct_Factory vMLoginActProvider;

    private VMProfileFrg_Factory vMProfileFrgProvider;

    private VMTodoFrg_Factory vMTodoFrgProvider;

    private ProfileFrgSubcomponentImpl(ProfileFrgSubcomponentBuilder builder) {
      initialize(builder);
    }

    private Map<Class<? extends ViewModel>, Provider<ViewModel>>
        getMapOfClassOfAndProviderOfViewModel() {
      return MapBuilder.<Class<? extends ViewModel>, Provider<ViewModel>>newMapBuilder(4)
          .put(VMLoginAct.class, (Provider) vMLoginActProvider)
          .put(VMMainAct.class, (Provider) VMMainAct_Factory.create())
          .put(VMProfileFrg.class, (Provider) vMProfileFrgProvider)
          .put(VMTodoFrg.class, (Provider) vMTodoFrgProvider)
          .build();
    }

    private ViewModelFactory getViewModelFactory() {
      return new ViewModelFactory(getMapOfClassOfAndProviderOfViewModel());
    }

    @SuppressWarnings("unchecked")
    private void initialize(final ProfileFrgSubcomponentBuilder builder) {
      this.vMLoginActProvider =
          VMLoginAct_Factory.create(DaggerAppComponent.this.provideUserUsecaseProvider);
      this.vMProfileFrgProvider =
          VMProfileFrg_Factory.create(DaggerAppComponent.this.provideUserUsecaseProvider);
      this.vMTodoFrgProvider =
          VMTodoFrg_Factory.create(DaggerAppComponent.this.provideTodoUsecaseProvider);
    }

    @Override
    public void inject(ProfileFrg arg0) {
      injectProfileFrg(arg0);
    }

    private ProfileFrg injectProfileFrg(ProfileFrg instance) {
      BaseFragment_MembersInjector.injectViewModelFactory(instance, getViewModelFactory());
      return instance;
    }
  }

  private final class TodoFrgSubcomponentBuilder
      extends FragmentModule_ContTodoFrg$app_debug.TodoFrgSubcomponent.Builder {
    private TodoFrg seedInstance;

    @Override
    public FragmentModule_ContTodoFrg$app_debug.TodoFrgSubcomponent build() {
      if (seedInstance == null) {
        throw new IllegalStateException(TodoFrg.class.getCanonicalName() + " must be set");
      }
      return new TodoFrgSubcomponentImpl(this);
    }

    @Override
    public void seedInstance(TodoFrg arg0) {
      this.seedInstance = Preconditions.checkNotNull(arg0);
    }
  }

  private final class TodoFrgSubcomponentImpl
      implements FragmentModule_ContTodoFrg$app_debug.TodoFrgSubcomponent {
    private VMLoginAct_Factory vMLoginActProvider;

    private VMProfileFrg_Factory vMProfileFrgProvider;

    private VMTodoFrg_Factory vMTodoFrgProvider;

    private TodoFrgSubcomponentImpl(TodoFrgSubcomponentBuilder builder) {
      initialize(builder);
    }

    private Map<Class<? extends ViewModel>, Provider<ViewModel>>
        getMapOfClassOfAndProviderOfViewModel() {
      return MapBuilder.<Class<? extends ViewModel>, Provider<ViewModel>>newMapBuilder(4)
          .put(VMLoginAct.class, (Provider) vMLoginActProvider)
          .put(VMMainAct.class, (Provider) VMMainAct_Factory.create())
          .put(VMProfileFrg.class, (Provider) vMProfileFrgProvider)
          .put(VMTodoFrg.class, (Provider) vMTodoFrgProvider)
          .build();
    }

    private ViewModelFactory getViewModelFactory() {
      return new ViewModelFactory(getMapOfClassOfAndProviderOfViewModel());
    }

    @SuppressWarnings("unchecked")
    private void initialize(final TodoFrgSubcomponentBuilder builder) {
      this.vMLoginActProvider =
          VMLoginAct_Factory.create(DaggerAppComponent.this.provideUserUsecaseProvider);
      this.vMProfileFrgProvider =
          VMProfileFrg_Factory.create(DaggerAppComponent.this.provideUserUsecaseProvider);
      this.vMTodoFrgProvider =
          VMTodoFrg_Factory.create(DaggerAppComponent.this.provideTodoUsecaseProvider);
    }

    @Override
    public void inject(TodoFrg arg0) {
      injectTodoFrg(arg0);
    }

    private TodoFrg injectTodoFrg(TodoFrg instance) {
      BaseFragment_MembersInjector.injectViewModelFactory(instance, getViewModelFactory());
      return instance;
    }
  }
}
