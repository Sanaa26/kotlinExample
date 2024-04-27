fun factorial(n: Int): Long {
    return if (n == 0 || n == 1) {
        1
    } else {
        n * factorial(n - 1)
    }
}


fun factorials(n:Int):Long{
    return if(n==0 || n==1) {
        1
    } else{
        n* factorials(n-1)
    }
}
fun main() {
    val number = 5
    val result = factorial(number)
    val  results = factorials(number)
    println("factorial of $number is: $results")
    println("Factorial of $number is: $result")
}
