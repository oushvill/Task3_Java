import java.util.Arrays;
import java.util.Objects;

public class ProductBatch {
    private final String description;
    private final PackageProduct[] products;

    public ProductBatch(String description, PackageProduct... products) {
        if (description == null) throw new IllegalArgumentException();
        this.description = description;
        this.products = products;
    }

    public ProductBatch(String description, WrappedProductWeight[] productWeights, PackageProduct[] products) {
        this.products = products;
        this.description = null;
    }

    public String getDescription() {
        return description;
    }

    public PackageProduct[] getProducts() {
        return products;
    }


    @Override
    public int hashCode() {
        int result = Objects.hash(getDescription());
        result = (31 * result) + Arrays.hashCode(getProducts());
        return result;
    }

    @Override
    public String toString() {
        return String.format("%s: %n%s ", description, Arrays.toString(products));
    }

    public int getWeight() {
        return ProductBrutto.getProductWeight(products);
    }
}
