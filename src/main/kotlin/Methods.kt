class Methods {

    fun fibonacci(n:Int): Int =
        when (n) {
            0 -> 0
            1, 2 -> 1
            else -> fibonacci(n - 1) + fibonacci(n - 2)
        }

    fun isPalindrome(string: String): Boolean =
        string == string.reversed()

    fun isPrimeNumber(n:Int):Boolean{
        var cont = 0
        for (i in 1..n){
            if (n%i==0)
                cont++
        }
        return (cont == 2)
    }

}