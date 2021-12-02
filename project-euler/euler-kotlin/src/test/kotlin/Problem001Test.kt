import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class Problem001Test {

    @Test
    fun multiplesOf3and5() {
        assertEquals(233168, multiplesOf3and5(1000))
        assertEquals(543, multiplesOf3and5(49))
        assertEquals(89301183, multiplesOf3and5(19564))
        assertEquals(16687353, multiplesOf3and5(8456))
    }

}