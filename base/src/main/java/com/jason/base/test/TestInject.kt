package com.jason.base.test

import com.alibaba.android.arouter.facade.annotation.Autowired
import com.alibaba.android.arouter.facade.annotation.Route
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Inject
import javax.inject.Singleton

@Route(path = "base/TestInject")
class TestInject {

    @Autowired
    private var testAutoWired: Any? = null

    private var testObject: Any? = null
    private fun useMyRepo() {

    }
}


@Singleton
class MyRepo @Inject constructor(
    private val api: ApiService
) {
    fun doSomething() = api.getApiUrl()

}

class ApiService @Inject constructor() {
    fun getApiUrl() = "https://www.example.com"
}

@Module
@InstallIn(SingletonComponent::class)
class NetWorkModule {

    @Provides
    @Singleton
    fun getNetWorkManager() = NetWorkModule()
}