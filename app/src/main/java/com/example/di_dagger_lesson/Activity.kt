package com.example.di_dagger_lesson

import com.example.dependencyinjectionstart.example1.*
import com.example.di_dagger_lesson.Classes.Computer
import com.example.di_dagger_lesson.DI_Interface.DaggerNewComponent
import javax.inject.Inject

class Activity {

    @Inject
    lateinit var computer: Computer


    init {
        DaggerNewComponent.create().inject(this)
    }
}