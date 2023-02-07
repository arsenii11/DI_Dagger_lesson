package com.example.di_dagger_lesson

import com.example.dependencyinjectionstart.example1.*
import com.example.di_dagger_lesson.DI_Interface.DaggerNewComponent
import javax.inject.Inject

class Activity {

    @Inject
    lateinit var keyboard: Keyboard

    @Inject
    lateinit var mouse: Mouse

    @Inject
    lateinit var monitor: Monitor


    init {
        DaggerNewComponent.create().inject(this)
    }
}