package com.jason.base.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import java.io.Closeable

/**
 * 所有ViewModel的基类
 *
 * @author Jason.Lee
 * */
class BaseViewModel : ViewModel() {

    private val _data = MutableLiveData<String>()

    val data: LiveData<String> = _data

    fun saveData() {
        viewModelScope.launch {

        }
    }

    override fun onCleared() {
        super.onCleared()
    }
}