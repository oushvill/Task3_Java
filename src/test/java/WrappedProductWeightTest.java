import static org.junit.Assert.*;

public class WrappedProductWeightTest {
    ProductWeight product =new ProductWeight("Апельсин", "Сочный, спелый", 10);
    WrappedProductWeight packagedProduct = new WrappedProductWeight(new ProductPackage(5, "Мешок"), 10, product);

    @org.junit.Test
    public void testGetProduct() {
        assertEquals(packagedProduct.getProduct(),product);
    }

    @org.junit.Test
    public void testGetWeight() {
        assertEquals(packagedProduct.getWeight(), 10);
    }

    @org.junit.Test
    public void testGetNetto() {
        assertEquals(packagedProduct.getNetto(), 10);
    }

    @org.junit.Test
    public void testGetBrutto() {
        assertEquals(packagedProduct.getBrutto(), 15);
    }
}

