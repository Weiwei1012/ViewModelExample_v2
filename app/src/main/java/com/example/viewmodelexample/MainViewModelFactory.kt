package com.example.viewmodelexample

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

//val is necessary
class MainViewModelFactory(private val lastValue: Int): ViewModelProvider.Factory {
        override fun <T : ViewModel?> create(modelClass: Class<T>): T {
            return MainViewModel(lastValue) as T
        }
}