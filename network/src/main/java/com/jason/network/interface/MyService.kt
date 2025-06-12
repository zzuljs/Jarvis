package com.jason.network.`interface`

import com.jason.network.data.User
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.Query

interface MyApiService {
    @GET("users/{id}")
    fun getUserById(@Path("id") userId: Int): Call<User?>?

    @GET("users")
    fun getUsers(
        @Query("page") page: Int,
        @Query("limit") limit: Int
    ): Call<MutableList<User?>?>? // 更多请求类型，例如 @POST, @PUT, @DELETE 等

    @POST("users")
    fun createUser(@Body user: User?): Call<User>?
}