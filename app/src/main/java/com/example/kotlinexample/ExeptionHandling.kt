fun main(){
    val arr = arrayOf(1,2,3,4,5,6)

    try {
        println(arr[7])
    }
    catch (ex:NullPointerException){
        println("Nul Pointer Exception")
    }
    catch (e: Exception){
        println("Please check array index")
    }
    finally {
        println("I will execute no matter what")
    }
    println("This will not run")
}