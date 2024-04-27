package com.example.kotlinexample

fun main() {
    val array = arrayOf(1, 2, 7, 6, 4, 9, 12)
    val reversedArray = array.reversedArray()
    println("Original Array: ${array.joinToString()}")
    println("Reversed Array: ${reversedArray.joinToString()}")
}

//fun reverseArray(array: Array<Int>) {
//    var start = 0
//    var end = array.size - 1
//
//    while (start < end) {
//        // Swap elements at start and end indices
//        val temp = array[start]
//        array[start] = array[end]
//        array[end] = temp
//
//        // Move indices towards the middle
//        start++
//        end--
//    }
//}
//
//fun main() {
//    val array = arrayOf(1, 2, 7, 6, 4, 9, 12)
//    println("Original Array: ${array.joinToString()}")
//
//    reverseArray(array)
//
//    println("Reversed Array: ${array.joinToString()}")
//}

