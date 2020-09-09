package com.jsrdxzw.kotlinspring.example

/**

 *@author xuzhiwei
 *@date 2020-09-08
 */
class CountingSet<T>(private val innerSet: MutableCollection<T> = HashSet()) : MutableCollection<T> by innerSet {
    var objectAdded = 0

    override fun add(element: T): Boolean {
        objectAdded++
        return innerSet.add(element)
    }

    override fun addAll(elements: Collection<T>): Boolean {
        objectAdded += elements.size
        return innerSet.addAll(elements)
    }
}


fun main() {
    val p1 = Person("Clice", "Johnson")
    val p2 = Person("Bob", "Johnson")
    println(p1 < p2)
}

fun showProcess(process: Int) {
    val percent = process.coerceIn(0, 100)
    println("percent is $percent")
}

fun addValidNumbers(numbers: List<Int?>) {
    val validNumbers = numbers.filterNotNull()
    println(validNumbers.sum())
    val array = arrayOf(1, 2, 3)
}

data class Point(val x: Int, val y: Int) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Point) return false
        return other.x == x && other.y == y
    }
}

data class Person(val firstName: String, val lastName: String) : Comparable<Person> {
    override fun compareTo(other: Person): Int {
        return compareValuesBy(this, other, Person::lastName, Person::firstName)
    }
}
