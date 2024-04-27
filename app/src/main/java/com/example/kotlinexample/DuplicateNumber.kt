package com.example.kotlinexample
fun main() {
    val a = arrayOf(2, 2, 6, 1, 1, 1, 8, 9, 10, 11, 12)

    val counts = mutableMapOf<Int, Int>()

    // Count occurrences of each number
    a.forEach {
        counts[it] = counts.getOrDefault(it, 0) + 1
    }

    // Print duplicate numbers
    counts.forEach { (num, count) ->
        if (count > 1) {
            println("Duplicate found: $num")
        }
    }
}
