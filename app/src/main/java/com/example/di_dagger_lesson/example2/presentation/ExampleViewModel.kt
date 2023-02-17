package com.example.di_dagger_lesson.example2.presentation

import com.example.di_dagger_lesson.example2.domain.ExampleUseCase
import javax.inject.Inject
import javax.inject.Singleton


class ExampleViewModel @Inject constructor(
    private val useCase: ExampleUseCase
) {

    fun method() {
        useCase()
    }
}
