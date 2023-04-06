package com.example.startdependencyinjection.example2.domain

import com.example.startdependencyinjection.example2.domain.ExampleRepository

class ExampleUseCase(
    private val repository: ExampleRepository
) {

    operator fun invoke() {

    }
}
