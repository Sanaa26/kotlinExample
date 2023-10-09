package com.example.kotlinexample

fun main(){
    val emp: Employee = Employee()
    emp.age = 19
    emp.name = "Sean"

    emp.let{
        it.age = 31
        it.name= "van"
    }

    with(emp){
        age = 30
        name = "Ross"
    }
    emp.run{
        age = 21
        name= "Joey"
    }
}

data class Employee(var age: Int = 18, var name: String = "joahn")