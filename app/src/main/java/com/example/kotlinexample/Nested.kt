package com.example.kotlinexample

fun main(){

    val obj = Outer()
    obj.i

    val nested = Outer.Nested()
    nested.test()
}

class Outer{

    var i = 0
    class Nested{
        fun test(){
            println(" I am nested class ")
        }
    }
}