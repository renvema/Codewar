import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class ReturnFirstMmultiplesNTest {
    @Test
    public void tests() {
        assertArrayEquals(new int[] {5, 10, 15}, ReturnFirstMmultiplesN.multiples(3, 5));
    }
}
