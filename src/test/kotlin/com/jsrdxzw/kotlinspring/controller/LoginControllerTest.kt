package com.jsrdxzw.kotlinspring.controller

import com.jsrdxzw.kotlinspring.domain.bo.UserLogin
import com.jsrdxzw.kotlinspring.domain.bo.UserRegister
import com.jsrdxzw.kotlinspring.extension.toJSONString
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.http.MediaType
import org.springframework.test.context.junit.jupiter.SpringExtension
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.*

/**

 *@author xuzhiwei
 *@date 2020-09-07
 */
@ExtendWith(SpringExtension::class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
class LoginControllerTest {

    @Autowired
    private lateinit var mockMvc: MockMvc

    @Test
    fun test_user_register() {
        mockMvc.perform(
                post("/user/register")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(
                                UserRegister(
                                        username = username,
                                        password = password,
                                        email = email).toJSONString()
                        )
        )
                .andExpect(status().isOk)
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$.username", `is`(username)))
    }

    @Test
    fun test_user_login() {
        mockMvc.perform(
                post("/user/login")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(
                                UserLogin(
                                        username = username,
                                        password = password).toJSONString()
                        )
        )
                .andExpect(status().isOk)
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$.username", `is`(username)))
    }

    private companion object {
        private const val username = "xzw"
        private const val password = "123"
        private const val email = "111@163.com"
    }
}
