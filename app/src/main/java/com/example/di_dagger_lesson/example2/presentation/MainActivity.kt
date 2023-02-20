package com.example.di_dagger_lesson.example2.presentation

import android.app.Application
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import com.example.di_dagger_lesson.R
import com.example.di_dagger_lesson.example1.DI_Interface.DaggerNewComponent.builder
import com.example.di_dagger_lesson.example2.DI.DaggerApplicationComponent
import com.example.di_dagger_lesson.example2.ExampleApp

import javax.inject.Inject


class MainActivity : AppCompatActivity() {

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
            .create("MY_ID","MY_NAME")

    }


    override fun onCreate(savedInstanceState: Bundle?) {
        component.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewModel.method()
        viewModel2.method()
        findViewById<TextView>(R.id.tv_hello_world).setOnClickListener{
            Intent(this, MainActivity2::class.java).apply {
                startActivity(this)
            }
        }
    }
}