package com.example.kotlinexample

fun main() {

    val inputString = "ABAACA"
    val charToCount = 'A'

    var i = 0
    for (char in inputString) {
        if (char == charToCount) {
            i++
        }
    }

    println("The character '$charToCount' appears $i times in the string.")



}

