package com.example.kotlinexample

fun main() {

    println(isPrime(19)) // true
    println(isPrime(49))
    //number defined
    //number defined
    var number = 1234

    var reversedNumber = 0
    var temp = 0

    while (number > 0) {
        //modulus operator used to strip off the last digit
        temp = number % 10

        //create reversed number
        reversedNumber = reversedNumber * 10 + temp
        number /= 10
    }


    //output
    println("Reversed Number is: $reversedNumber")



    val str = "hello"
    println(reverse(str))


    var a = 10
    var b = 20
    println("a is $a and b is $b")
    a += b
    b = a - b
    a -= b
    println("After swapping, a is $a and b is $b")

}
fun reverse(`in`: String?): String {
    requireNotNull(`in`) { "Null is not valid input" }
    val out = StringBuilder()
    val chars = `in`.toCharArray()
    for (i in chars.indices.reversed()) out.append(chars[i])
    return out.toString()
}

fun isPrime(n: Int): Boolean {
    if (n == 0 || n == 1) {
        return false
    }
    if (n == 2) {
        return true
    }
    for (i in 2..n / 2) {
        if (n % i == 0) {
            return false
        }
    }
    return true
}




