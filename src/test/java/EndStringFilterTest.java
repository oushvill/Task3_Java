import static org.junit.Assert.*;

public class EndStringFilterTest {
    EndStringFilter filter = new EndStringFilter("Чёрное море");

    @org.junit.Test
    public void testGetPattern() {
        assertEquals(filter.getPattern(), "море");
    }

    @org.junit.Test
    public void testApplyTrue() {
        assertTrue(filter.apply("Чёрное море"));
    }

    @org.junit.Test
    public void testApplyFalse() {
        assertFalse(filter.apply("Чёрное Море"));
    }
}