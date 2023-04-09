package com.example.startdependencyinjection.example2.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.startdependencyinjection.R
import com.example.startdependencyinjection.example1.Activity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val activity = Activity()
        activity.computer.toString()
    }
}