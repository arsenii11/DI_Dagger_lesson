package com.example.di_dagger_lesson.example2.DI

import android.content.Context
import com.example.di_dagger_lesson.example2.presentation.MainActivity
import com.example.di_dagger_lesson.example2.presentation.MainActivity2
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@ApplicationScope
@Component(modules = [DataModule::class, DomainModule::class])
interface ApplicationComponent {


    fun activityComponentFactory(): ActivityComponent.Factory

    @Component.Factory
    interface ApplicationComponentFactory {

        fun create(
            @BindsInstance context: Context,
            @BindsInstance timeMillis: Long
        ): ApplicationComponent
    }
}