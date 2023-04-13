package com.example.startdependencyinjection.example2.di

import javax.inject.Scope

//этой аннотацией будет помечать классы необходиме нам и будет понятно сколько живет данный класс
@Scope
@Retention(AnnotationRetention.RUNTIME)
annotation class ApplicationScope
