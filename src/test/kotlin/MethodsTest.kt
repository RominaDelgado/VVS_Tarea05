import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MethodsTest {
    private val methods = Methods()

    @Test
    fun fibonacciWith0Test(){
        val result = methods.fibonacci(0)
        assertEquals(0,result)
    }

    @Test
    fun fibonacciWith1Test(){
        val result = methods.fibonacci(1)
        assertEquals(1,result)
    }

    @Test
    fun fibonacciWithNumberGreaterThan3Test(){
        val result = methods.fibonacci(6)
        assertEquals(8,result)
    }


}