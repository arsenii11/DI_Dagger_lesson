package com.example.di_dagger_lesson.example2.data.datasource

import android.util.Log
import com.example.di_dagger_lesson.example2.data.network.ExampleApiService
import javax.inject.Inject

class ExampleTestDataSourceImpl @Inject constructor(
) :ExampleRemoteDataSource{

    override fun method() {
        Log.d("TestRemoteDataSource", "test ")
    }

}