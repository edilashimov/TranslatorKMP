package com.plcoding.translator_kmm.translate.data.remote
import io.ktor.client.*

expect class HTTPClientFactory {
    fun create(): HttpClient
}