import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class Problem002Test {

    @Test
    fun fibonacciEvenSum() {
        assertEquals(44, fibonacciEvenSum(10))
        assertEquals(3382, fibonacciEvenSum(18))
        assertEquals(60696, fibonacciEvenSum(23))
        assertEquals(350704366, fibonacciEvenSum(43))
    }

}