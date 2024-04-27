fun reverseNumber(number: Int): Int {
    var n = number
    var reversed = 0

    while (n != 0) {
        val digit = n % 10
        reversed = reversed * 10 + digit
        n /= 10
    }

    return reversed
}




fun main() {   
    val number = 12345
    val reversedNumber = reverseNumber(number)
    println("Reversed number: $reversedNumber")
}


