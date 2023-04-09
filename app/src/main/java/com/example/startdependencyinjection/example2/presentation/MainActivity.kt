package com.example.startdependencyinjection.example2.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.startdependencyinjection.R
import com.example.startdependencyinjection.example2.di.DaggerApplicationComponent
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var viewModel: ExampleViewModel

    private val component=DaggerApplicationComponent.create()

    override fun onCreate(savedInstanceState: Bundle?) {
        //инжектиться обычно тут для того чтобы у нас точно были проинициализированы все необходимые
        // поля когда Активти будет создана
        component.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewModel.method()
    }
}