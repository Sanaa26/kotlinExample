package com.example.kotlinexample

fun main(){
    println("Hello word".stringFormatFunction())
}
fun String.stringFormatFunction() : String{
    return "------------------\n$this\n--------------"
}