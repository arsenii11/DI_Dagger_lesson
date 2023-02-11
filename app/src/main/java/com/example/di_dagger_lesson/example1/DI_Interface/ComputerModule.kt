package com.example.di_dagger_lesson.example1.DI_Interface

import com.example.dependencyinjectionstart.example1.ComputerTower
import com.example.dependencyinjectionstart.example1.Keyboard
import com.example.di_dagger_lesson.example1.DI_Interface.Classes.Monitor
import com.example.dependencyinjectionstart.example1.Mouse
import com.example.di_dagger_lesson.example1.DI_Interface.Classes.Computer
import dagger.Module
import dagger.Provides

@Module
class ComputerModule {

    @Provides
    fun provideMonitor(): Monitor {
        return Monitor()
    }

    @Provides
    fun provideComputer(
        monitor: Monitor,
        computerTower: ComputerTower,
        keyboard: Keyboard,
        mouse: Mouse
    ): Computer {
        return Computer(monitor, computerTower, keyboard, mouse)
    }
}