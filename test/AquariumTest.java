import org.junit.Test;

import static org.junit.Assert.*;

public class AquariumTest {
    /**
     * This returns the current size of the aquarium
     * @return this aquarium's size
     */
    @Test
    public static void getSize() {
        Aquarium testA = new Aquarium();
        assertEquals(100, testA.getSize());
    }
    @Test
    public static void getPercentSize() {
        Aquarium testA = new Aquarium();
        assertEquals(100, testA.getPercentSize());
    }
    @Test
    public static void getBorder() {
        Aquarium testA = new Aquarium();
        assertEquals(100 - 100, testA.getBorder());
    }
}