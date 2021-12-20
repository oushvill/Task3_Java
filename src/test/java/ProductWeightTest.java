public class ProductWeightTest {
    @org.junit.Test
    public void ProductWeightTestName() {
        try {
            ProductWeight test1 = new ProductWeight(null, "Описание", 4);
        } catch (IllegalArgumentException err) {
            System.err.println("Наименование товара = null!");
        }
    }

    @org.junit.Test
    public void ProductWeightTestDescription() {
        try {
            ProductWeight test2 = new ProductWeight("Наименование", null, 4);
        } catch (IllegalArgumentException err) {
            System.err.println("Описание товара = null!");
        }
    }

    @org.junit.Test
    public void ProductWeightTestNegativeWeight() {
        try {
            ProductWeight test3 = new ProductWeight("Наименование", "Описание", -8);
        } catch (IllegalArgumentException err) {
            System.err.println("Отрицательный вес!");
        }
    }
}