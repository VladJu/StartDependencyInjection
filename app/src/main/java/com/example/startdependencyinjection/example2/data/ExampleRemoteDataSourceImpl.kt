
package com.example.startdependencyinjection.example2.data

import com.example.startdependencyinjection.example2.data.ExampleApiService
import com.example.startdependencyinjection.example2.data.ExampleRemoteDataSource

class ExampleRemoteDataSourceImpl(
    private val apiService: ExampleApiService
) : ExampleRemoteDataSource {

    override fun method() {

    }
}
