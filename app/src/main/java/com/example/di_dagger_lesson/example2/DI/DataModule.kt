package com.example.di_dagger_lesson.example2.DI

import com.example.di_dagger_lesson.example2.data.datasource.ExampleLocalDataSource
import com.example.di_dagger_lesson.example2.data.datasource.ExampleLocalDataSourceImpl
import com.example.di_dagger_lesson.example2.data.datasource.ExampleRemoteDataSource
import com.example.di_dagger_lesson.example2.data.datasource.ExampleRemoteDataSourceImpl
import dagger.Binds
import dagger.Module

@Module
interface DataModule {

    @Binds
    fun bindLocalDataSource(impl: ExampleLocalDataSourceImpl): ExampleLocalDataSource

    @Binds
    fun bindRemoteDataSource(impl: ExampleRemoteDataSourceImpl): ExampleRemoteDataSource

}