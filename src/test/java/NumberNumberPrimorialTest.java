import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class NumberNumberPrimorialTest {
    @Test
    public void checkSmallValues() {
        assertEquals(  "30", NumberPrimorial.numPrimorial(3));
        assertEquals( "210", NumberPrimorial.numPrimorial(4));
        assertEquals("2310", NumberPrimorial.numPrimorial(5));
        assertEquals("30030 ", NumberPrimorial.numPrimorial(6));
    }
    @Test
    public void checkLargerValues() {
        assertEquals(  "9699690", NumberPrimorial.numPrimorial(8));
        assertEquals("223092870", NumberPrimorial.numPrimorial(9));
    }
}