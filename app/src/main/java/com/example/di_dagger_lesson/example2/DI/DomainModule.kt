package com.example.di_dagger_lesson.example2.DI

import com.example.di_dagger_lesson.example2.data.repository.ExampleRepositoryImpl
import com.example.di_dagger_lesson.example2.domain.ExampleRepository
import dagger.Binds
import dagger.Module

@Module
interface DomainModule {

    @Binds
    fun bindRepository(impl: ExampleRepositoryImpl):ExampleRepository
}