package com.example.startdependencyinjection.example2.di

import com.example.startdependencyinjection.example2.data.repository.ExampleRepositoryImpl
import com.example.startdependencyinjection.example2.domain.ExampleRepository
import dagger.Binds
import dagger.Module

@Module
interface DomainModule {
    @Binds
    fun bindRepository(impl: ExampleRepositoryImpl): ExampleRepository
}