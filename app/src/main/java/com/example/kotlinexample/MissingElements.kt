fun main() {
    val list = arrayOf(1, 2, 3, 6, 7)

    // Define the range of elements you want to check for (e.g., 1 to 7)
    val range = 1..7

    // Find the missing elements
    val missingElements = range.minus(list)

    // Print the missing elements
    println("Missing elements: ${missingElements}")
}



