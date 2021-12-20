import static org.junit.Assert.*;

public class ServiceProductsTest {
    private ProductBatch batch1;
    private ProductBatch batch2;

    @org.junit.Before
    public void testBatch() {

        batch1 = new ProductBatch("Партия AlpenGold",
                new WrappedProductWeight(new ProductPackage(2, "Упаковка"), 95,
                        new ProductWeight("Шоколад", "Белый с кокосом", 95)),
                new WrappedProductWeight(new ProductPackage(2, "Упаковка"), 95,
                        new ProductWeight("Шоколад с орехом", "Темный", 95)));


        batch2 = new ProductBatch("Партия Milka",
                new WrappedProductPiece(new ProductPackage(2, "Упаковка"), 10,
                        new ProductPiece("Молочный Шоколад", "с орехом", 80)),
                new WrappedProductPiece(new ProductPackage(2, "Упаковка"), 10,
                        new ProductPiece("Шоколад", "Молочный с изюмом", 80)));
    }

    @org.junit.Test
    public void countByFilterTest1() {
        assertEquals(ServiceProducts.countByFilter(batch1, new BeginStringFilter("Шоколад")), 2);
        assertEquals(ServiceProducts.countByFilter(batch1, new IncludeStringFilter("с орехом")), 1);
        assertEquals(ServiceProducts.countByFilter(batch1, new EndStringFilter(" ")), 0);
    }

    @org.junit.Test
    public void countByFilterTest2() {
        assertEquals(ServiceProducts.countByFilter(batch2, new BeginStringFilter("Шоколад")), 1);
        assertEquals(ServiceProducts.countByFilter(batch2, new IncludeStringFilter("Молочный Шоколад")), 1);
        assertEquals(ServiceProducts.countByFilter(batch2, new EndStringFilter(" ")), 0);
    }

}