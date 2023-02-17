package com.example.di_dagger_lesson.example2

import android.app.Application
import com.example.di_dagger_lesson.example2.DI.DaggerApplicationComponent

class ExampleApp:Application() {
    val component by lazy {
        DaggerApplicationComponent.factory()
            .create(this, System.currentTimeMillis())
    }
}