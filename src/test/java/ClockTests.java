import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class ClockTests {
    @Test
    public void test1(){

        assertEquals(Clock.Past(0,1,1),61000);
    }


}
