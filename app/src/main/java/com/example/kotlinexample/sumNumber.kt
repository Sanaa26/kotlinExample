package com.example.kotlinexample

fun sumArray(array: IntArray): Int {
    return array.fold(0) { sum, element -> sum + element }
}

fun main() {


    val array = intArrayOf(1, 2, 3, 4, 5)
    val result = sumArray(array)
    println("Sum: $result")
}