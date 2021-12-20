public class ProductWeight extends Product {

    private final int weight;

    public ProductWeight(String nameOfProduct, String description, int weight) {
        super(nameOfProduct, description);
        if (Double.compare(weight, 0) == -1) throw new IllegalArgumentException();
        this.weight = weight;
    }

    @Override
    public String toString() {
        return String.format("Весовой товар || Название: %s. Описание товара: %s. Вес 1 единицы: %d (кг).", nameOfProduct,description, weight);
    }
}