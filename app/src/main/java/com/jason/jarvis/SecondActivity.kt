package com.jason.jarvis

import android.os.Bundle
import androidx.activity.ComponentActivity
import com.alibaba.android.arouter.facade.annotation.Route

@Route(path = ". /app/SecondActivity")
class SecondActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }
}