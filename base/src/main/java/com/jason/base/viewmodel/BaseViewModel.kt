package com.jason.base.viewmodel

import androidx.lifecycle.ViewModel
import java.io.Closeable

/**
 * 所有ViewModel的基类
 *
 * @author Jason.Lee
 * */
class BaseViewModel : ViewModel() {
    override fun addCloseable(closeable: Closeable) {
        super.addCloseable(closeable)
    }

    override fun onCleared() {
        super.onCleared()
    }
}