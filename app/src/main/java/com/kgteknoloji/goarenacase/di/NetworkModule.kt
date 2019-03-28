package com.kgteknoloji.goarenacase.di

import android.content.SharedPreferences
import com.google.gson.Gson
import com.kgteknoloji.goarenacase.BuildConfig
import com.kgteknoloji.goarenacase.data.api.Api
import com.kgteknoloji.goarenacase.data.repository.UserRepository
import dagger.Module
import dagger.Provides
import io.reactivex.schedulers.Schedulers
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit
import javax.inject.Singleton

/**
 * Created by yunuseker on 20.3.2019.
 */
@Module(includes = arrayOf(AppModule::class))
class NetworkModule {

    @Singleton
    @Provides
    fun provideGson(): Gson {
        return Gson()
    }

    @Singleton
    @Provides
    fun provideOkHttpBuilder(sharedPreferences: SharedPreferences): OkHttpClient {
        val okHttpBuilder = OkHttpClient.Builder()
        val loggingInterceptor = HttpLoggingInterceptor()
        loggingInterceptor.level = HttpLoggingInterceptor.Level.BODY
        okHttpBuilder
            .addInterceptor { chain ->
                val origin = chain.request()
                val request = origin.newBuilder()
                    .addHeader("Authorization", "Bearer " + sharedPreferences.getString("token",""))
                    .build()
                chain.proceed(request)
            }
            .addInterceptor(loggingInterceptor)
            .connectTimeout(30, TimeUnit.SECONDS)
            .writeTimeout(30, TimeUnit.SECONDS)
            .readTimeout(30, TimeUnit.SECONDS)
        return okHttpBuilder.build()
    }

    @Singleton
    @Provides
    fun provideApiService(okHttpClient: OkHttpClient, gson: Gson): Api {
        val retrofitBuilder = Retrofit.Builder()
            .baseUrl("http://35.247.127.111:8080/api/")
            .client(okHttpClient)
            .addCallAdapterFactory(RxJava2CallAdapterFactory.createWithScheduler(Schedulers.io()))
            .addConverterFactory(GsonConverterFactory.create(gson))
        return retrofitBuilder.build().create(Api::class.java)
    }
}