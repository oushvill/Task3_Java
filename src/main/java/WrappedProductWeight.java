import java.util.Objects;

public class WrappedProductWeight extends PackageProduct {
    private final int weight;
    private final ProductWeight product;
    private final ProductPackage productPackage;

    public WrappedProductWeight(ProductPackage productPackage, int weight, ProductWeight product) {
        super(product.getNameOfProduct(), product.getDescription(), productPackage);
        if (Double.compare(weight, 0) == -1) throw new IllegalArgumentException("Отрицательный вес!");
        this.weight = weight;
        this.product = product;
        this.productPackage = productPackage;
    }

    public Product getProduct() {
        return product;
    }

    public int getWeight() { return weight; }

    public int getNetto() {
        return weight;
    }

    public int getBrutto() {
        return weight + productPackage.getWeightPack();
    }

    @Override
    public String getNameOfProduct() {
        return nameOfProduct;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof WrappedProductWeight)) return false;
        WrappedProductWeight that = (WrappedProductWeight) o;
        return Double.compare(that.getWeight(), getWeight()) == 0 && Objects.equals(getProductPackage(),
                that.getProductPackage()) && Objects.equals(getProduct(), that.getProduct());
    }

    @Override
    public String toString() {
        return "Упакованный весовой товар || Название: " + product.getNameOfProduct()
                + ". Описание: " + product.getDescription()
                + ". Тип упаковки: " + productPackage.getNamePack()
                + ". Вес: " + weight + " (кг).\n";
    }

}
