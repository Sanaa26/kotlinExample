fun main(){

    val lambada = "hello"
    println(lambada)


    //Initialize array
    val arr = intArrayOf(1, 2, 3, 4, 2, 7, 8, 8, 3)

    println("Duplicate elements in given array: ")
    //Searches for duplicate element
    //Searches for duplicate element
    for (i in arr.indices) {
        for (j in i + 1 until arr.size) {
            if (arr[i] == arr[j]) println(arr[j])
        }
    }

    val numbers = intArrayOf(55, 32, 45, 98, 82, 11, 9, 39, 50)

    //assign first element of an array to largest and smallest

    //assign first element of an array to largest and smallest
    var smallest = numbers[0]
    var largetst = numbers[0]

    for (i in 1 until numbers.size) {
        if (numbers[i] > largetst) largetst = numbers[i] else if (numbers[i] < smallest) smallest =
            numbers[i]
    }

    println("Largest Number is : $largetst")
    println("Smallest Number is : $smallest")

    //number defined
    //number defined
    var number = 1234
    var reversedNumber = 0
    var temp = 0

    while (number > 0) {
        //modulus operator used to strip off the last digit
        temp = number % 10

        //create reversed number
        reversedNumber = reversedNumber * 10 + temp
        number /= 10
    }

    //output

    //output
    println("Reversed Number is: $reversedNumber")
}