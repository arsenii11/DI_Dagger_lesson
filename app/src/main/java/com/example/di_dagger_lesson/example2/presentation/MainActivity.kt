package com.example.di_dagger_lesson.example2.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.di_dagger_lesson.R
import com.example.di_dagger_lesson.example2.DI.DaggerApplicationComponent
import javax.inject.Inject


class MainActivity : AppCompatActivity() {

  @Inject
  lateinit var viewModel: ExampleViewModel

  private val component = DaggerApplicationComponent.create()

    override fun onCreate(savedInstanceState: Bundle?) {
        component.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewModel.method()
    }
}