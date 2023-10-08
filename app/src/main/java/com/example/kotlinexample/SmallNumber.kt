
    fun main() {
        val numbers = intArrayOf(10, 5, 23, 99, 45, 78, 12, 88, 34)
        var min = numbers[0]
        var max = numbers[0]// Assume the first element is the minimum

        val num = intArrayOf(10,3,4,90,199,567)
        var minimum = num[0]
        // Iterate through the array to find the smallest number

        for(i in 1 until num.size) {
            if (num[i]< minimum){
                minimum = num[i] // update min if a smmaller number is found
            }
        }

        for (i in 1 until numbers.size) {
            if (numbers[i] < min) {
                min = numbers[i] // Update min if a smaller number is found
            }
        }


        for (i in 1 until numbers.size) {
            if (numbers[i] > max) {
                max = numbers[i] // Update max if a larger number is found
            }
        }

        val nums = intArrayOf(1,2,4,56,7)

        var maxs = nums[0]

        for(i in 1 until nums.size) {
            if (nums[i] > maxs) {
                maxs = nums[i]
            }
        }
        println("the large numbers in the array is $max")
        println("The smallest number in the array is: $min")
        println("the small number $minimum")

}