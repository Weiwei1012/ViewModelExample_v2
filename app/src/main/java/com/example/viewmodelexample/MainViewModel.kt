package com.example.viewmodelexample

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel

//class MainViewModel: ViewModel() {
class MainViewModel(lastValue: Int) : ViewModel() {
    //version 2: var counter = 0
    //version 3: var counter = MutableLiveData<Int>()
    private val _counter = MutableLiveData<Int>()

    val counter: LiveData<Int>
        get() = _counter

   init {
       _counter.value = lastValue
   }

    fun plusOne() {
        val count = counter.value ?: 0
        _counter.value = count + 1
    }

    fun reset() {
        _counter.value = 0
    }

}