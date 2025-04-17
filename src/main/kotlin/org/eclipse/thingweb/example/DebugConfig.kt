package org.eclipse.thingweb.example

import jakarta.annotation.PostConstruct
import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Component

@Component
class DebugConfig {
    @Value("\${wot.http.port}")
    lateinit var port: String

    @PostConstruct
    fun printConfig() {
        println("DEBUG >>> wot.http.port = $port")
    }
}