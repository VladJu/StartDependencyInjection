package com.example.startdependencyinjection.example2.di

import android.content.Context
import com.example.startdependencyinjection.example2.presentation.MainActivity
import dagger.BindsInstance
import dagger.Component

@Component(modules = [DataModule::class, DomainModule::class])
interface ApplicationComponent {

    fun inject(activity: MainActivity)

    @Component.Factory
    interface ApplicationComponentFactory {
        //Разница в том, что в Builder для каждого объекта нам надо создавать отдельный метод
        //который возвращает  Кастомыный Билдер
        //То в случае в фабрикой  мы можем все параметры передавать в метод create()

        fun create(
            @BindsInstance context: Context,
            @BindsInstance timeMillis: Long
        ) : ApplicationComponent
    }
}