package com.example.kotlinexample

fun String.removeChar(charToRemove: Char): String {
    return this.filter { it != charToRemove }
}

fun main() {
    val inputString = "Hello, world!"
    val charToRemove = 'o'
    val resultString = inputString.removeChar(charToRemove)
    println(resultString) // Output: Hell, wrld!
}
fun removeCharFromString(input: String, charToRemove: Char): String {
    val stringBuilder = StringBuilder()
    for (char in input) {
        if (char != charToRemove) {
            stringBuilder.append(char)
        }
    }
    return stringBuilder.toString()
}

//
//fun main() {
//    val inputString = "Hello, world!"
//    val charToRemove = 'o'
//    val resultString = removeCharFromString(inputString, charToRemove)
//    println(resultString) // Output: Hell, wrld!
//}
