package com.jason.network.utils

import android.util.Log
import com.jason.network.api.ApiClient.apiService
import com.jason.network.data.User
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


object RetrofitUtils {

    private val TAG = javaClass.name

    fun useRetrofit() {

        // 获取单个用户
        val userCall: Call<User?>? = apiService!!.getUserById(1)
        userCall?.enqueue(object : Callback<User?> {
            override fun onResponse(call: Call<User?>, response: Response<User?>) {
                if (response.isSuccessful && response.body() != null) {
                    val user: User? = response.body()
                    Log.d(TAG, "User fetched: " + user?.name)
                } else {
                    Log.e(TAG, "Error fetching user: " + response.code())
                }
            }

            override fun onFailure(
                p0: Call<User?>,
                p1: Throwable
            ) {

            }
        })


        // 获取用户列表
        val usersCall: Call<MutableList<User?>?>? = apiService!!.getUsers(1, 10)
        usersCall?.enqueue(object : Callback<MutableList<User?>?>{
            override fun onResponse(
                call: Call<MutableList<User?>?>,
                response: Response<MutableList<User?>?>
            ) {
                if (response.isSuccessful && response.body() != null) {
                    val users: MutableList<User?>? = response.body()
                    Log.d(TAG, "Users fetched: " + users?.size)
                } else {
                    Log.e(TAG, "Error fetching users: " + response.code())
                }
            }

            override fun onFailure(
                p0: Call<MutableList<User?>?>,
                p1: Throwable
            ) {

            }
        })
    }
}