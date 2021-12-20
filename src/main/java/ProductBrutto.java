import java.util.Arrays;

public class ProductBrutto {
    public static int getProductWeight(PackageProduct... products) {
        return Arrays.stream(products).mapToInt(PackageProduct::getBrutto).sum();
    }
}
