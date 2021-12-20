import static org.junit.Assert.*;

public class IncludeStringFilterTest {
    IncludeStringFilter filter = new IncludeStringFilter("Дорога");

    @org.junit.Test
    public void testGetPattern() {
        assertEquals(filter.getPattern(), "Дорога");
    }

    @org.junit.Test
    public void testApplyTrue() {
        assertTrue(filter.apply("Дорога к черному морю"));
    }

    @org.junit.Test
    public void testApplyFalse() {
        assertFalse(filter.apply("Дороги к черному морю"));

    }
}