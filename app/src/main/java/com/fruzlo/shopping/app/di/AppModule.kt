package com.fruzlo.shopping.app.di

import android.content.Context
import android.content.Context.MODE_PRIVATE
import android.content.SharedPreferences
import com.fruzlo.shopping.app.feature_shop.data.remote.Api
import com.fruzlo.shopping.app.feature_shop.data.repository.RepositoryImpl
import com.fruzlo.shopping.app.feature_shop.domain.repository.Repository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideApi(): Api {
        return Retrofit.Builder()
            .baseUrl("https://tutorials.mianasad.com/ecommerce")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(Api::class.java)
    }

    @Provides
    @Singleton
    fun provideRepository(api: Api): Repository {
        return RepositoryImpl(api)
    }

    @Provides
    @Singleton
    fun provideAddedProductsSf(@ApplicationContext context : Context): SharedPreferences {
       return context.getSharedPreferences("my_sf", MODE_PRIVATE)
    }

}