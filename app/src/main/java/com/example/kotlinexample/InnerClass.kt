

fun main(){
 val obj = Outer()
    obj.i

    val innerobj = Outer().OuterOne()
    innerobj.test()
}

class Outer{
    var i = 0

    inner class OuterOne{
        fun test(){
            println(" I am inner class $i")
        }
    }
}