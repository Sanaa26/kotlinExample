fun main(){
    val printerString= "Hello"
    val printerFunction: (String)-> Unit = {str-> println(str)}
    val numbers = listOf(1, 2, 3, 4, 5)

    val evenNumbers = numbers.filter { it % 2 == 0 }
    val squaredNumbers = numbers.map { it * it }

    println(evenNumbers)
    println(squaredNumbers)


    val double = multiplier(2)
    val triple = multiplier(3)

    println(double(5)) // Output: 10
    println(triple(5)) // Output: 15
}

fun multiplier(factor: Int): (Int) -> Int {
    return { number -> factor * number }
}

fun highOrderFunction(string:String,printer: (String)->Unit){
    printer(string)
}
