package com.jsrdxzw.kotlinspring.extension

import com.jsrdxzw.kotlinspring.constant.Constant
import org.springframework.util.DigestUtils

/**
 *@author xuzhiwei
 *@date 2020-09-07
 */
fun String.toMD5(): String {
    val value = "$this/${Constant.SALT}"
    return DigestUtils.md5DigestAsHex(value.toByteArray())
}

fun main() {
    println("123".toMD5())
}
