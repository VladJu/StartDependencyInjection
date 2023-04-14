package com.example.startdependencyinjection.example2.di

import androidx.lifecycle.ViewModel
import com.example.startdependencyinjection.example2.presentation.ExampleViewModel
import com.example.startdependencyinjection.example2.presentation.ExampleViewModel2
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import dagger.multibindings.StringKey

@Module
interface ViewModelModule {
    //Нужна данная @IntoMap иначае даггер не будет знать какую реализацию использовать
    //Запрашиваем VM в виде коллекции, он возьмет все реализации сложит в одну коллекцию и передаст
    //ее в конструктор ViewModelFactory

    @IntoMap
    @StringKey("ExampleViewModel")
    @Binds
    fun bindExampleViewModel(impl : ExampleViewModel) : ViewModel

    @IntoMap
    @StringKey("ExampleViewModel2")
    @Binds
    fun bindExampleViewModel2(impl : ExampleViewModel2) : ViewModel

}