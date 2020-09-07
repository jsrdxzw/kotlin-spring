package com.jsrdxzw.kotlinspring.service.impl

import com.jsrdxzw.kotlinspring.domain.bo.UserLogin
import com.jsrdxzw.kotlinspring.domain.bo.UserRegister
import com.jsrdxzw.kotlinspring.domain.dao.User
import com.jsrdxzw.kotlinspring.domain.vo.UserLoginVo
import com.jsrdxzw.kotlinspring.extension.toMD5
import com.jsrdxzw.kotlinspring.repository.UserRepository
import com.jsrdxzw.kotlinspring.service.LoginService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class LoginServiceImpl : LoginService {

    @Autowired
    private lateinit var userRepository: UserRepository

    override fun login(userLogin: UserLogin): UserLoginVo {
        val user = userRepository.findByUsernameAndPassword(userLogin.username, userLogin.password.toMD5())
        return user?.let {
            UserLoginVo(username = it.username)
        } ?: throw RuntimeException("用户名或密码错误")
    }

    override fun register(userRegister: UserRegister): UserLoginVo {
        val user = userRepository.save(
                User(username = userRegister.username,password = userRegister.password)
        )
        return UserLoginVo(username = user.username)
    }
}
