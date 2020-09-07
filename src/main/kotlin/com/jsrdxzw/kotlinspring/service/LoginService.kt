package com.jsrdxzw.kotlinspring.service

import com.jsrdxzw.kotlinspring.domain.bo.UserLogin
import com.jsrdxzw.kotlinspring.domain.bo.UserRegister
import com.jsrdxzw.kotlinspring.domain.vo.UserLoginVo

/**

 *@author xuzhiwei
 *@date 2020-09-07
 */
interface LoginService {
    fun login(userLogin: UserLogin): UserLoginVo
    fun register(userRegister: UserRegister): UserLoginVo
}
