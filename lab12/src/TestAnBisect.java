import static org.junit.Assert.*;

import org.junit.*;

public class TestAnBisect {
    @Test
    public void testCommon() {
        assertFalse(AnBisect.esteAnBisect(203));
        assertFalse(AnBisect.esteAnBisect(99));
        assertFalse(AnBisect.esteAnBisect(100));
        assertFalse(AnBisect.esteAnBisect(200));
        assertFalse(AnBisect.esteAnBisect(500));
        assertFalse(AnBisect.esteAnBisect(1000));
        assertFalse(AnBisect.esteAnBisect(2018));
    }

    @Test
    public void testLeap() {
        assertTrue(AnBisect.esteAnBisect(4));
        assertTrue(AnBisect.esteAnBisect(400));
        assertTrue(AnBisect.esteAnBisect(1600));
    }
}
