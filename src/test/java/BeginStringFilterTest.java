import static org.junit.Assert.*;

public class BeginStringFilterTest {
    BeginStringFilter filter = new BeginStringFilter("Облако");

    @org.junit.Test
    public void testGetPattern() {
        assertEquals(filter.getPattern(), "Облако");
    }

    @org.junit.Test
    public void testApplyTrue() {
        assertTrue(filter.apply("Облако бывает черное"));
    }

    @org.junit.Test
    public void testApplyFalse() {
        assertFalse(filter.apply("Облака бывает черное"));
    }
}