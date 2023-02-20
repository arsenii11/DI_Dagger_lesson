package com.example.di_dagger_lesson.example2.presentation

import android.view.View
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.di_dagger_lesson.example2.DI.ApplicationScope
import com.example.di_dagger_lesson.example2.DI.ViewModelKey
import com.example.di_dagger_lesson.example2.domain.ExampleRepository
import com.example.di_dagger_lesson.example2.domain.ExampleUseCase
import javax.inject.Inject
import javax.inject.Provider



class VIewModelFactory @Inject constructor(
private val viewModelProviders: @JvmSuppressWildcards Map<Class<out ViewModel> , Provider<ViewModel>>
):ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass:  Class<T>): T {

        return viewModelProviders[modelClass]?.get() as T
    }
}