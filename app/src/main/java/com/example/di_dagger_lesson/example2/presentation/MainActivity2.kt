package com.example.di_dagger_lesson.example2.presentation

import android.app.Application
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.example.di_dagger_lesson.R
import com.example.di_dagger_lesson.example1.DI_Interface.DaggerNewComponent.builder
import com.example.di_dagger_lesson.example2.ExampleApp

import javax.inject.Inject


class MainActivity2 : AppCompatActivity() {

    @Inject
    lateinit var vIewModelFactory: VIewModelFactory


    private val viewModel by lazy {
        ViewModelProvider(this,  vIewModelFactory)[ExampleViewModel::class.java ]
    }

    private val viewModel2 by lazy {
        ViewModelProvider(this,  vIewModelFactory)[ExampleViewModel2::class.java ]
    }

    private val component by lazy {
        (application as ExampleApp).component
            .activityComponentFactory()
            .create("MY_ID_2","MY_NAME_2")

    }


    override fun onCreate(savedInstanceState: Bundle?) {
        component.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewModel.method()
        viewModel2.method()
    }
}