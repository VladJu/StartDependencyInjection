package com.example.startdependencyinjection.example2.presentation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.startdependencyinjection.R
import com.example.startdependencyinjection.example2.ExampleApp
import javax.inject.Inject

class MainActivity : AppCompatActivity() {


    private val component by lazy {
        //получаем ссылку на приложение и обращ к компоненту
        (application as ExampleApp).component
    }

    @Inject
    lateinit var viewModel: ExampleViewModel


    override fun onCreate(savedInstanceState: Bundle?) {
        component.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewModel.method()
    }
}