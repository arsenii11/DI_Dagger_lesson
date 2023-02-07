package com.example.di_dagger_lesson

import com.example.dependencyinjectionstart.example1.Keyboard
import com.example.di_dagger_lesson.DI_Interface.DaggerNewComponent
import javax.inject.Inject

class Activity {

    @Inject
    lateinit var keyboard: Keyboard

    init {
        DaggerNewComponent.create().inject(this)
    }
}