package com.example.startdependencyinjection.example2.di

import androidx.lifecycle.ViewModel
import dagger.MapKey
import kotlin.reflect.KClass

@MapKey
@Retention(AnnotationRetention.RUNTIME)
//Внутри класса добавляем поле, которое будет указывать в качестве значения
//указывваем сам класс и делаем ограничения, чтобы в качестве значения можно было передать класс VM
annotation class ViewModelKey(val value : KClass<out ViewModel>)
