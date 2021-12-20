import org.testng.annotations.Test;

import static org.junit.Assert.*;

public class WrappedProductPieceTest {
    ProductPiece product =new ProductPiece("Апельсин", "Сочный, спелый", 10);
    WrappedProductPiece packagedProduct = new WrappedProductPiece(new ProductPackage(5, "Мешок"), 10, product);

    @org.junit.Test
    public void testGetProduct() {
        assertEquals(packagedProduct.getProduct(),product);
    }

    @org.junit.Test
    public void testGetCount() {
        assertEquals(packagedProduct.getCount(), 10);
    }

    @org.junit.Test
    public void testGetNetto() {
        assertEquals(packagedProduct.getNetto(), 100);
    }

    @org.junit.Test
    public void testGetBrutto() {
        assertEquals(packagedProduct.getBrutto(), 105);
    }
}

