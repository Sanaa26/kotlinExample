package com.example.kotlinexample

fun main() {
    val originalString = "Hello, World!"
    val reversedString = reverseString(originalString)
    println("Original String: $originalString")
    println("Reversed String: $reversedString")



}
fun reverseString(input: String): String {
    var reversed = ""
    for (i in input.length - 1 downTo 0) {
        reversed += input[i]
    }
    return reversed
}

fun reverstr(input : String):String{
    var reversed= ""
    for(i in input.length -1 downTo 0){
        reversed+=input[i]
    }
    return reversed
}



