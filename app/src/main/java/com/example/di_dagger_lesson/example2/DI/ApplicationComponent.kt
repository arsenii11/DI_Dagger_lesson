package com.example.di_dagger_lesson.example2.DI

import com.example.di_dagger_lesson.example2.presentation.MainActivity
import dagger.Component

@Component(modules = [DataModule::class,DomainModule::class,ContextModule::class])
interface ApplicationComponent {

    fun inject(activity: MainActivity)
}