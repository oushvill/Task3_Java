import static org.junit.Assert.*;

public class ProductBatchTest {
    ProductPackage productPackage = new ProductPackage(1, "Коробка");

    WrappedProductWeight[] weightProducts = {
            new WrappedProductWeight(productPackage, 10, new ProductWeight("Киви", "Эквадорский", 8))
    };

    WrappedProductPiece[] pieceProducts = {
            new WrappedProductPiece(productPackage, 10, new ProductPiece("Квас", "Ржаной", 2))
    };

    ProductBatch productBatchWeights = new ProductBatch("Партия весовых товаров", weightProducts);
    ProductBatch productBatchPieces = new ProductBatch("Партия штучных товаров", pieceProducts);

    @org.junit.Test
    public void testGetDescriptionW() {
        assertEquals(productBatchWeights.getDescription(), "Партия весовых товаров");
    }
    @org.junit.Test
    public void testGetDescriptionP() {
        assertEquals(productBatchPieces.getDescription(), "Партия штучных товаров");
    }

    @org.junit.Test
    public void testGetWeight() {
        assertEquals(productBatchWeights.getWeight(), 11, 0);
    }
}