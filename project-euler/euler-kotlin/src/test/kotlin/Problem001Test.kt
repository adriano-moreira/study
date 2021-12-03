import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class Problem001Test {

    @Test
    fun multiplesOf3and5v1() {
        assertEquals(233168, multiplesOf3and5v1(1000))
        assertEquals(543, multiplesOf3and5v1(49))
        assertEquals(89301183, multiplesOf3and5v1(19564))
        assertEquals(16687353, multiplesOf3and5v1(8456))
    }

    @Test
    fun multiplesOf3and5v2() {
        assertEquals(233168, multiplesOf3and5v2(1000))
        assertEquals(543, multiplesOf3and5v2(49))
        assertEquals(89301183, multiplesOf3and5v2(19564))
        assertEquals(16687353, multiplesOf3and5v2(8456))
    }

}