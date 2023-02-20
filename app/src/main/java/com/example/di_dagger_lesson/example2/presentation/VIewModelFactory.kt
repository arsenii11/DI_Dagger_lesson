package com.example.di_dagger_lesson.example2.presentation

import android.view.View
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.di_dagger_lesson.example2.domain.ExampleRepository
import com.example.di_dagger_lesson.example2.domain.ExampleUseCase
import javax.inject.Inject

class VIewModelFactory @Inject constructor(
private val viewModels: @JvmSuppressWildcards Map<String, ViewModel>
):ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass:  Class<T>): T {

        return viewModels[modelClass.simpleName] as T
/*        throw RuntimeException("Unknown view model class $modelClass")*/
    }
}