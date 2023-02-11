package com.example.di_dagger_lesson.example2.domain

import com.example.di_dagger_lesson.example2.domain.ExampleRepository
import javax.inject.Inject

class ExampleUseCase @Inject constructor(
    private val repository: ExampleRepository
) {

    operator fun invoke() {
        repository.method()
    }
}
