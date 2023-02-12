package com.example.di_dagger_lesson.example2.DI

import com.example.di_dagger_lesson.example2.data.repository.ExampleRepositoryImpl
import com.example.di_dagger_lesson.example2.domain.ExampleRepository
import dagger.Module
import dagger.Provides

@Module
class DomainModule {

    @Provides
    fun provideRepository(impl: ExampleRepositoryImpl):ExampleRepository{
        return impl
    }
}