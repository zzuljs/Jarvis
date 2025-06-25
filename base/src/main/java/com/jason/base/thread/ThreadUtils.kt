package com.jason.base.thread

import android.content.Context
import android.os.Handler
import androidx.annotation.UiThread
import java.util.concurrent.Executor
import java.util.concurrent.Executors

object ThreadUtils {

    private val MAX_SIZE = 10

    private var sHandler: Handler? = null

    private var sThreadPool: Executor? = null


    @UiThread
    fun init(context: Context) {
        sHandler = Handler(context.mainLooper)
        sThreadPool = Executors.newFixedThreadPool(MAX_SIZE)
    }

    fun runOnMainThread(runnable: Runnable) {
        sHandler?.post(runnable)
    }

    fun runOnMainThread(runnable: Runnable, time: Long) {
        sHandler?.postDelayed(runnable, time)
    }

    fun runOnWorkThread(runnable: Runnable) {
        sThreadPool?.execute(runnable)
    }
}