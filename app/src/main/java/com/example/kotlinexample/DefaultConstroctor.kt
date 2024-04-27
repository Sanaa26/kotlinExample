

fun main(){

    val obj = Calculator()
    println(obj.add(2,4))
    println(obj.multilpay(3,3))
}

class Calculator{
    lateinit var name: String
    fun add(a: Int, b:Int) : Int{
        return a+b
    }
    fun multilpay(a: Int, b:Int): Int{
        return a*b
    }
}