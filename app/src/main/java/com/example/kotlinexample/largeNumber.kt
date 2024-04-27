//fun main(){
//    val numbers = intArrayOf(55, 32, 45, 98, 82, 11, 9, 39, 50)
//
//    //assign first element of an array to largest and smallest
//    var smallest = numbers[0]
//    var largetst = numbers[0]
//
//    for (i in 1 until numbers.size) {
//        if (numbers[i] > largetst) largetst = numbers[i] else if (numbers[i] < smallest) smallest =
//            numbers[i]
//    }
//
//    println("Largest Number is : $largetst")
//    println("Smallest Number is : $smallest")
//
//}
    fun main() {
       // Assume the first element is the maximum

        val num = intArrayOf(1,2,3,4,5,6,8,89)
        var maximum = num[0]

        for (i in 1 until num.size){
            if (num[i]> maximum){
                maximum = num[i]
            }
        }
    val n = arrayOf(1,2,3,4,5)
    var max= n[0]
    for(i in 1 until n.size){
        if (n[i]>max){
            max= n[i]
        }
    }




        // Iterate through the array to find the largest number

        println("the large numbers in the array is $maximum")



    }
