package com.example.di_dagger_lesson.example2.DI

import com.example.di_dagger_lesson.example2.data.datasource.ExampleLocalDataSource
import com.example.di_dagger_lesson.example2.data.datasource.ExampleLocalDataSourceImpl
import com.example.di_dagger_lesson.example2.data.datasource.ExampleRemoteDataSource
import com.example.di_dagger_lesson.example2.data.datasource.ExampleRemoteDataSourceImpl
import dagger.Module
import dagger.Provides

@Module
class DataModule {

    @Provides
    fun provideLocalDataSource(impl: ExampleLocalDataSourceImpl):ExampleLocalDataSource{
        return impl
    }

    @Provides
    fun provideRemoteDataSource(impl: ExampleRemoteDataSourceImpl):ExampleRemoteDataSource{
        return impl
    }
}