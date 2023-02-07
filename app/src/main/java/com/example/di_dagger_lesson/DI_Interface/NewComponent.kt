package com.example.di_dagger_lesson.DI_Interface

import com.example.di_dagger_lesson.Activity
import dagger.Component

@Component
interface NewComponent {

    fun inject(activity: Activity)
}
