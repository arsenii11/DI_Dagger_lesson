package com.example.di_dagger_lesson.DI_Interface

import com.example.di_dagger_lesson.Activity
import dagger.Component

@Component(modules = [ComputerModule::class])
interface NewComponent {

    fun inject(activity: Activity)
}
