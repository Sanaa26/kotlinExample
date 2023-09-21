fun main(){

    val user : UserDetail by lazy{ UserDetail("Sana","28")}
    println(user.toString())
}


class UserDetail(val name: String, val age: String){

    init{
        println("This name is $name")
        println("This age is $age")
    }
}