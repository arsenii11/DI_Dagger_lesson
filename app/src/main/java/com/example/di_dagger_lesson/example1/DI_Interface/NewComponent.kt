package com.example.di_dagger_lesson.example1.DI_Interface

import dagger.Component

@Component(modules = [ComputerModule::class])
interface NewComponent {

    fun inject(activity: Activity)
}
