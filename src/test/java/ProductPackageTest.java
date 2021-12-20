public class ProductPackageTest {
    @org.junit.Test
    public void ProductPackageTestName() {
        try {
            ProductPackage test1 = new ProductPackage(10, null);
        } catch (IllegalArgumentException err) {
            System.err.println("Название упаковки = null!");
        }
    }

    @org.junit.Test
    public void ProductPackageTestNegativeWeightTest() {
        try {
            ProductPackage test2 = new ProductPackage(-10, "Наименование");
        } catch (IllegalArgumentException err) {
            System.err.println("Отрицательный вес упаковки!");
        }
    }
}