package com.example.kotlinexample


fun main(){
 calculator{
     loop(1000000)
 }
}

inline fun calculator(fn: () -> Unit){
    val start = System.currentTimeMillis()
    fn()
    val end = System.currentTimeMillis()
    println("Time take  ${end -start} ms")
}
fun loop(n: Long) {
    for (i in 1..n) {
    }
}