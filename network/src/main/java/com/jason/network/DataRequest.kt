package com.jason.network

import okhttp3.Call
import okhttp3.Callback
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.Request.Builder
import okhttp3.Response
import org.jetbrains.annotations.TestOnly
import java.io.IOException
import java.util.concurrent.TimeUnit


object DataRequest {

    fun useLoad() {
        load(URL.APP_PRE_DATA_URL, object : Callback {
            override fun onFailure(call: Call, e: IOException) {

            }

            override fun onResponse(call: Call, response: Response) {
                if (response.isSuccessful) {
                    val responseBody = response.body?.string()
                } else {

                }
            }
        })
    }

    fun load(url: String, callback: Callback) {

        try {
            val client: OkHttpClient = OkHttpClient.Builder()
                .connectTimeout(10, TimeUnit.SECONDS) // 设置连接超时
                .readTimeout(30, TimeUnit.SECONDS) // 设置读取超时
                .build()

            val request: Request = Builder()
                .url(url) // 设置请求URL
                .header("Authorization", "Bearer your_token") // 添加请求头
                .get() // 设置GET请求方法
                .build()

            val call = client.newCall(request).enqueue(callback)

        } catch (e: Exception) {

        }
    }
}