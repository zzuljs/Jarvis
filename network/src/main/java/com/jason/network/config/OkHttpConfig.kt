package com.jason.network.config

import okhttp3.Authenticator
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.Response
import okhttp3.Route
import okhttp3.logging.HttpLoggingInterceptor
import java.util.concurrent.TimeUnit


object OkHttpConfig {
    val client: OkHttpClient
        get() {
            // 创建日志拦截器，用于打印网络请求和响应的详细信息
            val loggingInterceptor = HttpLoggingInterceptor()
            loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY) // 设置日志级别

            val httpClientBuilder = OkHttpClient.Builder()
            httpClientBuilder.addInterceptor(loggingInterceptor) // 添加日志拦截器
                .connectTimeout(10, TimeUnit.SECONDS)
                .readTimeout(10, TimeUnit.SECONDS)

            return httpClientBuilder.build()
        }
}