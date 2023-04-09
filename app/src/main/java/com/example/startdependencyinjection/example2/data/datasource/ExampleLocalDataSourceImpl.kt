package com.example.startdependencyinjection.example2.data.datasource

import com.example.startdependencyinjection.example2.data.database.ExampleDatabase
import com.example.startdependencyinjection.example2.data.datasource.ExampleLocalDataSource
import javax.inject.Inject

class ExampleLocalDataSourceImpl @Inject constructor(
    private val database: ExampleDatabase
) : ExampleLocalDataSource {

    override fun method() {
        database.method()
    }
}
