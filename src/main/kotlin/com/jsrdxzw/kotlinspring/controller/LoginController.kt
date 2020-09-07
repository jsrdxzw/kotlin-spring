package com.jsrdxzw.kotlinspring.controller

import com.jsrdxzw.kotlinspring.domain.bo.UserLogin
import com.jsrdxzw.kotlinspring.domain.bo.UserRegister
import com.jsrdxzw.kotlinspring.service.LoginService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**

 *@author xuzhiwei
 *@date 2020-09-07
 */
@RestController
@RequestMapping("/user")
class LoginController {

    @Autowired
    private lateinit var userLoginService: LoginService

    @PostMapping("/login")
    fun login(@RequestBody userLogin: UserLogin) = userLoginService.login(userLogin)

    @PostMapping("/register")
    fun register(@RequestBody userRegister: UserRegister) = userLoginService.register(userRegister)
}
