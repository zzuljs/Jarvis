package com.jason.jarvis

import android.os.Bundle
import androidx.activity.ComponentActivity
import com.alibaba.android.arouter.facade.annotation.Autowired
import com.alibaba.android.arouter.facade.annotation.Route
import com.alibaba.android.arouter.launcher.ARouter
import com.jason.base.activity.BaseActivity

@Route(path = ". /app/SecondActivity")
class SecondActivity : BaseActivity() {

    @Autowired
    private lateinit var mUserData: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        ARouter.getInstance().inject(this)
    }
}