public class ProductPieceTest {
    @org.junit.Test
    public void ProductPieceTestName() {
        try {
            ProductPiece test1 = new ProductPiece(null, "Описание", 10);
        } catch (IllegalArgumentException err) {
            System.err.println("Наименование товара = null!");
        }
    }

    @org.junit.Test
    public void ProductPieceTestDescription() {
        try {
            ProductPiece test2 = new ProductPiece("Наименование", null, 10);
        } catch (IllegalArgumentException err) {
            System.err.println("Описание товара = null!");
        }
    }

    @org.junit.Test
    public void ProductPieceNegativeWeightTest() {
        try {
            ProductWeight test3 = new ProductWeight("Наименование", "Описание", -10);
        } catch (IllegalArgumentException err) {
            System.err.println("Отрицательный вес!");
        }
    }
}