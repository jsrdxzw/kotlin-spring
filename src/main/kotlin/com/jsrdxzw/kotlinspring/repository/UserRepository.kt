package com.jsrdxzw.kotlinspring.repository

import com.jsrdxzw.kotlinspring.domain.dao.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

/**

 *@author xuzhiwei
 *@date 2020-09-07
 */
@Repository
interface UserRepository : JpaRepository<User, Int> {
    fun findByUsernameAndPassword(username: String, password: String): User?
}
