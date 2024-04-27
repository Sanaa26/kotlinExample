fun main() {
    val array = intArrayOf(5, 2, 8, 9, 1, 7)
    val secondLargest = findSecondLargest(array)
    println("Second largest number is: $secondLargest")
}

fun findSecondLargest(array: IntArray): Int {
    var max = Int.MIN_VALUE
    var secondMax = Int.MIN_VALUE

    for (num in array) {
        if (num > max) {
            secondMax = max
            max = num
        } else if (num > secondMax && num != max) {
            secondMax = num
        }
    }

    return secondMax
}
