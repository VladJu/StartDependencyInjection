package com.example.startdependencyinjection.example2.di

import com.example.startdependencyinjection.example2.presentation.MainActivity
import com.example.startdependencyinjection.example2.presentation.MainActivity2
import dagger.BindsInstance
import dagger.Subcomponent
import javax.inject.Named

@Subcomponent(
    //он будет создавать VM -> подключаем модуль с VM
    modules = [ViewModelModule::class]
)
interface ActivityComponent {

    fun inject(activity: MainActivity)

    fun inject(activity: MainActivity2)

    //тут в граф надо закинуть id

    @Subcomponent.Factory
    interface Factory {
        fun create(
            @BindsInstance @IdQualifier id: String,
            @BindsInstance @NameQualifier name: String
        ): ActivityComponent
    }
}