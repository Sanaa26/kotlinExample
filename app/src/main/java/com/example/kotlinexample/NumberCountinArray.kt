fun main() {
    // Define your array
    val myArray = intArrayOf(1, 2, 3)

    // Count occurrences of the value 4
    val count = myArray.count { it == 4 }

    // Print the result
    println("The number of occurrences of 4 in the array is: $count")
}
