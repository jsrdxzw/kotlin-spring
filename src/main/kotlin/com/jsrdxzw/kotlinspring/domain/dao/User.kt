package com.jsrdxzw.kotlinspring.domain.dao

import java.time.LocalDateTime
import javax.persistence.*


/**

 *@author xuzhiwei
 *@date 2020-09-07
 */
@Table(name = "mall_user")
data class User(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Int? = null,
        @Column(nullable = false, length = 255)
        val username: String,
        @Column(nullable = false, length = 255)
        val password: String,
        @Column(nullable = true, length = 255)
        val email: String? = null,
        @Column(nullable = false, name = "created_time")
        val createdTime: LocalDateTime? = null,
        @Column(nullable = false, name = "updated_time")
        val updatedTime: LocalDateTime? = null
)
