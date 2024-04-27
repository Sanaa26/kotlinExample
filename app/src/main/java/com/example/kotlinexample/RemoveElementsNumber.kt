package com.example.kotlinexample

fun  main(){

    val lists = listOf(1,2,3,4,5,2,1,1,1)
    val uniqueList = removeElements(lists)
    println(uniqueList)
}
fun removeElements(list: List<Int>): List<Int>{
    val uniqueList = mutableListOf<Int>()
    for (item in list){
        if (!uniqueList.contains(item)){
            uniqueList.add(item)
        }
    }
    return uniqueList

}