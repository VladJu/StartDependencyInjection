package com.example.startdependencyinjection.example2.data.datasource

import android.util.Log
import javax.inject.Inject

class TestRemoteDataSourceImpl @Inject constructor() : ExampleRemoteDataSource {
    override fun method() {
        Log.d("TestRemoteDataSource","TEST")
    }
}