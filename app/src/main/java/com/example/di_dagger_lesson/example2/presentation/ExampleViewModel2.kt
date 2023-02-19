package com.example.di_dagger_lesson.example2.presentation

import android.util.Log
import android.view.View
import androidx.lifecycle.ViewModel
import com.example.di_dagger_lesson.example2.domain.ExampleRepository
import javax.inject.Inject

class ExampleViewModel2 @Inject constructor(
    private val repository: ExampleRepository
) : ViewModel() {

    fun method() {
        repository.method()
        Log.d("ExampleViewModel", "$this")
    }

}