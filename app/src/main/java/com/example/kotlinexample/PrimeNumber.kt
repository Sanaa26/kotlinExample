
    fun main(args: Array<String>) {
        println(isPrime(19)) // true
        println(isPrime(49)) // false
    }

    fun isPrime(n: Int): Boolean {
        if (n == 0 || n == 1) {
            return false
        }
        if (n == 2) {
            return true
        }

        for (i in 2..n / 2) {
            if (n % i == 0) {
                return false
            }
        }
        return true
    }
