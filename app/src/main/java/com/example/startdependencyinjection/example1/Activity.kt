package com.example.startdependencyinjection.example1

import javax.inject.Inject

class Activity {



    val keyboard: Keyboard = DaggerNewComponent.create().getKeyboard()

    val monitor: Monitor = DaggerNewComponent.create().getMonitor()

    val mouse: Mouse = DaggerNewComponent.create().getMouse()

//    init {
//        DaggerNewComponent.create().inject(this)
//    }

}