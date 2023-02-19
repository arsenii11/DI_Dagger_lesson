package com.example.di_dagger_lesson.example2.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.di_dagger_lesson.example2.domain.ExampleUseCase
import javax.inject.Inject

class VIewModelFactory @Inject constructor(
private val exampleUseCase: ExampleUseCase
):ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if(modelClass == ExampleViewModel::class.java){
            return ExampleViewModel(exampleUseCase) as T
        }
        throw RuntimeException("Unknown view model class $modelClass")
    }
}