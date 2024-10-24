import static org.junit.Assert.*;
import org.junit.Test;

public class Count8Test {

    @Test
    public void testCount1() {
        // Test cases
        assertEquals(1, Recursion.count8(8));
    }

    @Test
    public void testCount2() {
        // Test cases
        assertEquals(2, Recursion.count8(88));
    }

    @Test
    public void testCount3() {
        // Test cases
        assertEquals(2, Recursion.count8(812123128));
    }

    @Test
    public void testCount4() {
        // Test cases
        assertEquals(5, Recursion.count8(818181818));
    }

    @Test
    public void testCount5() {
        // Test cases
        assertEquals(0, Recursion.count8(0));
    }

    @Test
    public void testCount6() {
        // Test cases
        assertEquals(1, Recursion.countHi("xxhixx"));
    }

    @Test
    public void testCount7() {
        // Test cases
        assertEquals(2, Recursion.countHi("xxhixxhi"));
    }

    @Test
    public void testCount8() {
        // Test cases
        assertEquals(0, Recursion.countHi(null));
    }

}