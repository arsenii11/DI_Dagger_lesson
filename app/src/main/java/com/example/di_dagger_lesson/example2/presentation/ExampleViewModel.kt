package com.example.di_dagger_lesson.example2.presentation

import android.util.Log
import androidx.lifecycle.ViewModel
import com.example.di_dagger_lesson.example2.DI.IdQualifier
import com.example.di_dagger_lesson.example2.DI.NameQualifier
import com.example.di_dagger_lesson.example2.domain.ExampleUseCase
import javax.inject.Inject
import javax.inject.Named
import javax.inject.Singleton


class ExampleViewModel @Inject constructor(
    private val useCase: ExampleUseCase,
    @IdQualifier private val id: String,
    @NameQualifier private val name: String
) :ViewModel(){

    fun method() {
        useCase()
        Log.d("ExampleViewModel", "$this $id $name")
    }
}
