package com.example.di_dagger_lesson.example2.DI

import com.example.di_dagger_lesson.example2.presentation.MainActivity
import com.example.di_dagger_lesson.example2.presentation.MainActivity2
import dagger.BindsInstance
import dagger.Subcomponent


@Subcomponent(
    modules = [ViewModelModule::class]
)
interface ActivityComponent {

    fun inject(activity: MainActivity)

    fun inject(activity: MainActivity2)

    @Subcomponent.Factory
    interface Factory {

        fun create(
            @BindsInstance id: String
        ): ActivityComponent

    }
}