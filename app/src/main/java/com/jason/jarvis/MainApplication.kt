package com.jason.jarvis

import android.app.Application
import com.alibaba.android.arouter.BuildConfig
import com.alibaba.android.arouter.launcher.ARouter

class MainApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        if (BuildConfig.DEBUG){
            ARouter.debuggable()
        }

        ARouter.init(this)
    }
}