// Generated by Dagger (https://google.github.io/dagger).
package com.kgteknoloji.goarenacase.di;

import com.google.gson.Gson;
import com.kgteknoloji.goarenacase.data.api.Api;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import okhttp3.OkHttpClient;

public final class NetworkModule_ProvideApiServiceFactory implements Factory<Api> {
  private final NetworkModule module;

  private final Provider<OkHttpClient> okHttpClientProvider;

  private final Provider<Gson> gsonProvider;

  public NetworkModule_ProvideApiServiceFactory(
      NetworkModule module,
      Provider<OkHttpClient> okHttpClientProvider,
      Provider<Gson> gsonProvider) {
    this.module = module;
    this.okHttpClientProvider = okHttpClientProvider;
    this.gsonProvider = gsonProvider;
  }

  @Override
  public Api get() {
    return provideInstance(module, okHttpClientProvider, gsonProvider);
  }

  public static Api provideInstance(
      NetworkModule module,
      Provider<OkHttpClient> okHttpClientProvider,
      Provider<Gson> gsonProvider) {
    return proxyProvideApiService(module, okHttpClientProvider.get(), gsonProvider.get());
  }

  public static NetworkModule_ProvideApiServiceFactory create(
      NetworkModule module,
      Provider<OkHttpClient> okHttpClientProvider,
      Provider<Gson> gsonProvider) {
    return new NetworkModule_ProvideApiServiceFactory(module, okHttpClientProvider, gsonProvider);
  }

  public static Api proxyProvideApiService(
      NetworkModule instance, OkHttpClient okHttpClient, Gson gson) {
    return Preconditions.checkNotNull(
        instance.provideApiService(okHttpClient, gson),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
