package com.example.di_dagger_lesson.example1.DI_Interface

import com.example.dependencyinjectionstart.example1.*
import com.example.di_dagger_lesson.example1.DI_Interface.Classes.Computer

import javax.inject.Inject

class Activity {

    @Inject
    lateinit var computer: Computer


    init {
        DaggerNewComponent.create().inject(this)
    }
}