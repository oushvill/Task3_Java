import java.util.Objects;

public class Product {
    protected String nameOfProduct= "";
    protected String description = "";

    public Product(String nameOfProduct, String description) {
        if (nameOfProduct == null || description == null) throw new IllegalArgumentException();
        this.nameOfProduct = nameOfProduct;
        this.description = description;
    }

    public Product(Product product) {
        this.nameOfProduct = product.getNameOfProduct();
        this.description = product.getDescription();
    }

    public String getNameOfProduct() {
        return nameOfProduct;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;
        Product product = (Product) o;
        return Objects.equals(getNameOfProduct(), product.getNameOfProduct())
                && Objects.equals(getDescription(), product.getDescription());
    }

    @Override
    public String toString() {
        return String.format("Товар || Тип Товара: '%s'. Описание товара: %s.", nameOfProduct, description);
    }
}
