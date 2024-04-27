package com.example.kotlinexample

fun  main() {
    var a = 10
    var b = 20
    println("a is $a and b is $b")
    a += b
    b = a - b
    a -= b
    println("After swapping, a is $a and b is $b")
}