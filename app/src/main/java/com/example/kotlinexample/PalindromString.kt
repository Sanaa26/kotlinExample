fun isPalindrome(input: String): Boolean {
    val cleanInput = input.replace(Regex("[^A-Za-z0-9]"), "").toLowerCase()
    return cleanInput == cleanInput.reversed()
}


fun isPalindromes(str: String): Boolean{
    val length = str.length
    for (i in 0 until length /2){
        if (str[i] != str[length - i -1]){
            return false
        }
    }
    return true
}




fun main() {
    val testString1 = "121"
    val testString2 = "Kotlin is awesome"
    val input = "radar"

    if ( isPalindromes(input)) {
        println("$input is a palindrome")
    } else {
        println("$input is not a palindrome")
    }

    println("$testString1 is a palindrome: ${isPalindrome(testString1)}")
    println("$testString2 is a palindrome: ${isPalindrome(testString2)}")
}
