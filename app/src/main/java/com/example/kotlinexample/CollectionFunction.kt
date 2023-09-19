fun main(){

    val num = listOf(1,2,3,4,5,6,7,8,)

//    println(isOdd(3))
//    println(isOdd(4))

    val list = num.filter { it % 2 != 0 } //filter use with lambada
    println(list)

    val userlist = listOf(
        User(1,"A"),
        User(2,"B"),
        User(3,"C")
    )
    println(userlist.filter  { it.id == 2})
    println(list)


//    val list = num.filter(::isOdd)  // Using function refrence ka use kra hai
//    println(list)
}

data class User(val id: Int, val name: String)
//fun isOdd(a: Int): Boolean{
//    return a % 2 != 0
//}