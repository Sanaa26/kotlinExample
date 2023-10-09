fun main(){

    val user : UserDetail by lazy{ UserDetail("Sana","28")}
    println(user.toString())

    val user1: UserNumber by lazy{ UserNumber("Abhi", 29)}
    println(user1.toString())



}


class UserDetail(val name: String, val age: String){

    init{
        println("This name is $name")
        println("This age is $age")
    }
}


class UserNumber(val name:String, val  age: Int){

    init{
        println("This name is$name")
        println("This age is $age")

    }
}