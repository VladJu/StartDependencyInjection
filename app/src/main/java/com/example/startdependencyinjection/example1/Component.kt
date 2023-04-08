package com.example.startdependencyinjection.example1

// в Дагере данный класс отвечает за создание зависимостей
class Component {

    private fun getComputer(): Computer {
        val monitor = Monitor()
        val keyboard = Keyboard()
        val mouse = Mouse()
        val computerTower = ComputerTower(
            Storage(),
            Memory(),
            Processor()
        )

        return Computer(monitor, computerTower, keyboard, mouse)
    }

    // в параметре принимает объект того класса куда будем вставлять данные
    // то есть компанет должен у активити обратиться к полю компьютер и присвоить ему какое то значение
    fun inject(activity: Activity) {
        activity.computer = getComputer()
        activity.keyboard = Keyboard()
    }
}