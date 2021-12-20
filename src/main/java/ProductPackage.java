import java.util.Objects;

public class ProductPackage {
    protected  int weightPack;
    protected  String namePack;

    public ProductPackage(int weightPack, String namePack) {
        if (Double.compare(weightPack, 0) == -1) throw new IllegalArgumentException("Отрицательный вес!");
        if (namePack == null) throw new IllegalArgumentException();
        this.namePack = namePack;
        this.weightPack = weightPack;
    }

    public  String getNamePack() {
        return namePack;
    }

    public  int getWeightPack() {
        return weightPack;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ProductPackage)) return false;
        ProductPackage that = (ProductPackage) o;
        return Double.compare(that.getWeightPack(), getWeightPack()) == 0
                && getNamePack().equals(that.getNamePack());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNamePack(), getWeightPack());
    }

    @Override
    public String toString() {
        return String.format("Упаковка || Тип упаковки: %s, вес: %d (кг).", namePack, weightPack);
    }
}
