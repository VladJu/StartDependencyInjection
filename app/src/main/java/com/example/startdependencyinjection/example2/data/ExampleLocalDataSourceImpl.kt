package com.example.startdependencyinjection.example2.data

import com.example.startdependencyinjection.example2.data.ExampleDatabase
import com.example.startdependencyinjection.example2.data.ExampleLocalDataSource

class ExampleLocalDataSourceImpl(
    private val database: ExampleDatabase
) : ExampleLocalDataSource {

    override fun method() {

    }
}
