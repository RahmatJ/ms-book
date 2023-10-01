package com.vantablack.msbook.health

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HealthController {

    @GetMapping("/ping")
    fun healthCheck(): String {
        return "pong!"
    }
}