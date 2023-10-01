package com.vantablack.msbook.health

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.get

@WebMvcTest
class HealthControllerTest(@Autowired val mockMvc: MockMvc) {

    @Test
    fun `Should return OK when trigger health check endpoint`() {
        mockMvc.get("/ping").andExpect {
            status { isOk() }
        }
    }
}