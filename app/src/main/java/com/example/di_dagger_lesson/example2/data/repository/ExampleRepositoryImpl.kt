package com.example.di_dagger_lesson.example2.data.repository

import com.example.di_dagger_lesson.example2.DI.ProdQualifier
import com.example.di_dagger_lesson.example2.DI.TestQualifier
import com.example.di_dagger_lesson.example2.data.datasource.ExampleLocalDataSource
import com.example.di_dagger_lesson.example2.data.datasource.ExampleRemoteDataSource
import com.example.di_dagger_lesson.example2.data.mapper.ExampleMapper
import com.example.di_dagger_lesson.example2.domain.ExampleRepository
import javax.inject.Inject

class ExampleRepositoryImpl @Inject constructor(
    private val localDataSource: ExampleLocalDataSource,
    @ProdQualifier private val remoteDataSource: ExampleRemoteDataSource,
    private val mapper: ExampleMapper
) : ExampleRepository {

    override fun method() {
        mapper.map()
        localDataSource.method()
        remoteDataSource.method()
    }
}
