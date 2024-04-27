@file:JvmName("DuplicateNumberKt")

fun main() {

    //Initialize array
    val nums = arrayOf(1, 2, 3, 4, 5, 1)


    println("Duplicate elements in given array: ")
    //Searches for duplicate element
    //Searches for duplicate element
    for (i in nums.indices) {
        for (j in i + 1 until nums.size) {
            if (nums[i] == nums[j]) println(nums[j])
        }
    }


}