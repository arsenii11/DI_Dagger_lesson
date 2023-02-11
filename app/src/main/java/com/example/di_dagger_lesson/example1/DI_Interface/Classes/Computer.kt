package com.example.di_dagger_lesson.example1.DI_Interface.Classes

import com.example.dependencyinjectionstart.example1.ComputerTower
import com.example.dependencyinjectionstart.example1.Keyboard
import com.example.dependencyinjectionstart.example1.Mouse

class Computer(
    val monitor: Monitor,
    val computerTower: ComputerTower,
    val keyboard: Keyboard,
    val mouse: Mouse
)
