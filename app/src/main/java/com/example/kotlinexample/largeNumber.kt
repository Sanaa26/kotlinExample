fun main(){
    val numbers = intArrayOf(55, 32, 45, 98, 82, 11, 9, 39, 50)

    //assign first element of an array to largest and smallest
    var smallest = numbers[0]
    var largetst = numbers[0]

    for (i in 1 until numbers.size) {
        if (numbers[i] > largetst) largetst = numbers[i] else if (numbers[i] < smallest) smallest =
            numbers[i]
    }

    println("Largest Number is : $largetst")
    println("Smallest Number is : $smallest")



}