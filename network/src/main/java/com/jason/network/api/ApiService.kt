package com.jason.network.api

import com.jason.network.config.OkHttpConfig
import com.jason.network.`interface`.MyApiService
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


object ApiClient {
    private const val BASE_URL = "https://api.example.com/" // 替换为你的 API 基础 URL

    private var retrofit: Retrofit? = null

    val apiService: MyApiService?
        get() {
            if (retrofit == null) {
                retrofit = Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .client(OkHttpConfig.client) // 将 OkHttpClient 配置给 Retrofit
                    .addConverterFactory(GsonConverterFactory.create()) // 添加 JSON 转换器
                    .build()
            }
            return retrofit!!.create<MyApiService?>(MyApiService::class.java)
        }
}