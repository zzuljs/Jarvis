package com.jason.base.activity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.lifecycle.ViewModelProvider
import com.jason.base.viewmodel.BaseViewModel


/**
 * 所有Activity的公共基类
 *
 * @author:Jason.Lee
 * */
open class BaseActivity : ComponentActivity() {

    private val viewModel = ViewModelProvider(this)[BaseViewModel::class.java]

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        viewModel.data.observe(this) {

        }

    }
}