package com.jason.jarvis

import android.os.Bundle
import androidx.activity.ComponentActivity
import com.alibaba.android.arouter.facade.annotation.Route
import com.jason.base.activity.BaseActivity

@Route(path = ". /app/SecondActivity")
class SecondActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }
}