package com.jsrdxzw.kotlinspring.extension

import com.fasterxml.jackson.databind.ObjectMapper

/**

 *@author xuzhiwei
 *@date 2020-09-08
 */
val mapper = ObjectMapper()
fun <T> T.toJSONString(): String {
    return mapper.writeValueAsString(this)
}
