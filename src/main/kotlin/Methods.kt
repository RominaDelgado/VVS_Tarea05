class Methods {

    fun fibonacci(n:Int): Int =
        when (n) {
            0 -> 0
            1, 2 -> 1
            else -> fibonacci(n - 1) + fibonacci(n - 2)
        }

}