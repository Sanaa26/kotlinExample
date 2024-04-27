package com.example.kotlinexample


fun printNumbers(n: Int) {
    if (n <= 100) {
        println(n)
        printNumbers(n + 1)
    }
}


fun main(args: Array<String>) {
    printNumbers(1)
}

//fun main(args: Array<String>){
//    printNumber(1)
//}
//fun printNumber(n : Int){
//    if(n<= 100){
//        println(n)
//        printNumber(n+1)
//    }
//}
