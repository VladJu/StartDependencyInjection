package com.example.startdependencyinjection.example2.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.startdependencyinjection.example2.di.ApplicationScope
import javax.inject.Inject
import javax.inject.Provider

@ApplicationScope
class ViewModelFactory @Inject constructor(
    private val viewModelsProviders: @JvmSuppressWildcards Map<Class<out ViewModel>, Provider<ViewModel>>
) : ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        //тут из Мапки по имени класса поулчаем VM и возвращать ее
        //при вызвое get()- каждый раз будет create new example VM
        // Providers - будет 1 и тот же но при вызвое get() будет возвращать новое значение
        return viewModelsProviders[modelClass]?.get() as T
    }
}