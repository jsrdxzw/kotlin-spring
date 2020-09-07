package com.jsrdxzw.kotlinspring.repository

import com.jsrdxzw.kotlinspring.domain.dao.User
import org.springframework.data.jpa.repository.JpaRepository

/**

 *@author xuzhiwei
 *@date 2020-09-07
 */
interface UserRepository : JpaRepository<User, Int> {
    fun findByUsernameAndPassword(username: String, password: String): User?
}
