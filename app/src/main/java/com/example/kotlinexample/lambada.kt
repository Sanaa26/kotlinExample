fun main(){

    val sum = { a: Int, b: Int -> a + b } // Lambda expression

    val result = sum(3, 4) // Invoking the lambda expression

    println(result)








//    val numbers = intArrayOf(55, 32, 45, 98, 82, 11, 9, 39, 50)
//
//    //assign first element of an array to largest and smallest
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
//    //number defined
//    //number defined
//    var number = 1234
//    var reversedNumber = 0
//    var temp = 0
//
//
//    while (number > 0) {
//        //modulus operator used to strip off the last digit
//        temp = number % 10
//
//        //create reversed number
//        reversedNumber = reversedNumber * 10 + temp
//        number /= 10
//    }
//
//    //output
//
//    //output
//    println("Reversed Number is: $reversedNumber")
}