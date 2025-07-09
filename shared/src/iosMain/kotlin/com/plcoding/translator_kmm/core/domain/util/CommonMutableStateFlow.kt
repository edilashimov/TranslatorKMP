package com.plcoding.translator_kmm.core.domain.util

import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

actual class CommonMutableStateFlow<T> actual constructor(
    private val flow: MutableStateFlow<T>

): CommonStateFlow<T>(flow), MutableStateFlow<T> {
    override val subscriptionCount: StateFlow<Int>
        get() = flow.subscriptionCount

    override var value: T
        get() = TODO("Not yet implemented")
        set(value) {}

    override fun compareAndSet(expect: T, update: T): Boolean {
        return flow.compareAndSet(expect, update)
    }
    override suspend fun emit(value: T) {
        flow.emit(value)
    }

    @ExperimentalCoroutinesApi
    override fun resetReplayCache() {
        flow.resetReplayCache()
    }

    override fun tryEmit(value: T): Boolean {
       return flow.tryEmit(value)
    }

}