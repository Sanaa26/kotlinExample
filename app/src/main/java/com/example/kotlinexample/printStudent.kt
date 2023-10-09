package com.example.kotlinexample

internal interface Base {
    companion object {
        const val str = "base"
    }
}

internal abstract class Parent {
    var str = "parent"
}

internal class Student {
    var str = "Student"
    fun display() {
        println(str) // Print the value of the str variable in the Student class
    }
}


    fun main(args: Array<String>) {
        val student = Student()
        student.display() // Call the display method to print the value
    }
