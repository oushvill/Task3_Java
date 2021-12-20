public class ProductPiece extends Product {
    private final int weight;

    public ProductPiece(String nameOfProduct, String description, int weight) {
        super(nameOfProduct, description);
        if (Double.compare(weight, 0.0) == -1) throw new IllegalArgumentException();
        this.weight = weight;
    }

    public ProductPiece(ProductPiece product) {
        super(product);
        weight = product.getWeight();
    }

    public int getWeight() {
        return weight;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ProductPiece)) return false;
        if (!super.equals(o)) return false;
        ProductPiece that = (ProductPiece) o;
        return Double.compare(that.getWeight(), getWeight()) == 0;
    }

    @Override
    public String toString() {
        return String.format("Штучный товар || Название: %s. Описание товара: %s. Вес 1 единицы: %d (кг).", nameOfProduct,description, weight);

    }
}
