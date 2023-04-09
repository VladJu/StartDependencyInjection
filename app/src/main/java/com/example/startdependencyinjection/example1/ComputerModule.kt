package com.example.startdependencyinjection.example1

import dagger.Module
import dagger.Provides

@Module
class ComputerModule {

    // обязательно указывать возвращаемый тип, чтобы даггер знал какую зависимость создает данный объект
    @Provides
    fun provideMonitor() : Monitor{
        return Monitor()
    }

    @Provides
    fun provideKeyboard() : Keyboard{
        return Keyboard()
    }
    @Provides
    fun  provideMouse() : Mouse{
        return Mouse()
    }
    //Например :если бы у компьютера не было аннотации @Inject на конструкторе

    @Provides
    fun provideComputer(
        monitor: Monitor,
        computerTower: ComputerTower,
        keyboard: Keyboard,
        mouse: Mouse
    ) : Computer {
        return Computer(
            monitor, computerTower, keyboard, mouse
        )
    }

    @Provides
    fun provideStorage() : Storage{
        return Storage()
    }

    @Provides
    fun provideComputerTower(
        storage: Storage,
        memory: Memory,
        processor: Processor
    ) : ComputerTower{
        return ComputerTower(storage, memory, processor)
    }

}