package com.jason.network.log

import kotlinx.coroutines.ThreadContextElement
import kotlin.coroutines.CoroutineContext

class LogCoroutineContext(val tag: String) : CoroutineContext.Element,
    ThreadContextElement<String> {


    companion object Key : CoroutineContext.Key<LogCoroutineContext>

    override val key: CoroutineContext.Key<*> get() = Key

    override fun restoreThreadContext(
        context: CoroutineContext,
        oldState: String
    ) {
        println("⏹ [$tag] Coroutine ended on thread: ${Thread.currentThread().name}")
    }

    override fun updateThreadContext(context: CoroutineContext): String {
        println("▶️ [$tag] Coroutine started on thread: ${Thread.currentThread().name}")
        return Thread.currentThread().name // 保存旧的上下文（可以不处理）
    }
}