package com.example.di_dagger_lesson.DI_Interface

import com.example.dependencyinjectionstart.example1.Monitor
import dagger.Module
import dagger.Provides

@Module
class ComputerModule  {

    @Provides
    fun provideMonitor():Monitor{
        return Monitor()
    }
}