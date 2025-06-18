package com.jason.network.utils

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withContext
import okhttp3.Dispatcher

object CoroutineUtils {

    fun useCoroutine() {

    }

    private suspend fun useRunningBlock() {
        var data = ""
        withContext(Dispatchers.IO) { data = getData() }
        withContext(Dispatchers.Main) {
            launch {

            }
        }


    }


    fun useLaunch() = CoroutineScope(Dispatchers.Main).launch {

    }

    fun getData() = "Test"
}