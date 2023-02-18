package com.example.di_dagger_lesson.example2.data.network

import android.content.Context
import android.util.Log
import com.example.di_dagger_lesson.R
import com.example.di_dagger_lesson.example2.DI.ApplicationScope
import javax.inject.Inject
import javax.inject.Singleton


@ApplicationScope
class ExampleApiService @Inject constructor(
    private val context: Context,
    private val timeMillis: Long
){

    fun method() {
        Log.d(LOG_TAG, "ExampleApiService ${context.getString(R.string.app_name)} $this $timeMillis")
    }

    companion object {

        private const val LOG_TAG = "EXAMPLE_TEST"
    }
}
