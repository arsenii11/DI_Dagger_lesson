package com.example.di_dagger_lesson.example2.DI

import com.example.di_dagger_lesson.example2.data.datasource.*
import dagger.Binds
import dagger.Module

@Module
interface DataModule {

    @ApplicationScope
    @Binds
    fun bindLocalDataSource(impl: ExampleLocalDataSourceImpl): ExampleLocalDataSource

    @ProdQualifier
    @ApplicationScope
    @Binds
    fun bindRemoteDataSource(impl: ExampleRemoteDataSourceImpl): ExampleRemoteDataSource

    @TestQualifier
    @ApplicationScope
    @Binds
    fun bindTestRemoteDataSource(impl: ExampleTestDataSourceImpl): ExampleRemoteDataSource

}