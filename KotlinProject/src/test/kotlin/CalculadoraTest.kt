import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

/**
 * Unit test are equal to Java. Then use same Junit library
 */
internal class CalculadoraTest {

    @Test
    fun soma() {
        val calculadora = Calculadora()
        assertEquals(25, calculadora.soma(10, 15));
    }
}