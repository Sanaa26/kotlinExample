package com.example.kotlinexample

fun main(){

    val iContainer = Container(3)
    iContainer.getValue()
    val sContainer = Container("Hello")
    sContainer.getValue()
}
class Container<T>(var data: T){
    fun setValue(value:  T){
        data = value
    }
    fun getValue(): T{
        return data
    }
}