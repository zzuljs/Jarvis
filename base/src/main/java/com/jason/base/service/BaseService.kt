package com.jason.base.service

import android.app.Service
import android.content.Intent
import android.os.Binder
import android.os.IBinder

class BaseService : Service() {

    val binder = BaseBinder()

    inner class BaseBinder : Binder() {
        val service: Service?
            get() = this@BaseService  // 返回 Service 实例
    }

    override fun onBind(intent: Intent?): IBinder? {
        return binder
    }

    override fun onStartCommand(
        intent: Intent?,
        flags: Int,
        startId: Int
    ): Int {
        return super.onStartCommand(intent, flags, startId)
    }
}