package com.example.startdependencyinjection.example2

import android.app.Application
import com.example.startdependencyinjection.example2.di.DaggerApplicationComponent

class ExampleApp : Application(){

     val component by lazy {
        DaggerApplicationComponent.factory()
            .create(this, System.currentTimeMillis())
    }
}