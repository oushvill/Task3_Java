import java.util.Objects;

public class WrappedProductPiece extends PackageProduct {
    private final int count;
    private final ProductPiece product;
    private final ProductPackage productPackage;

    public WrappedProductPiece(ProductPackage productPackage, int count, ProductPiece product) {
        super(product.getNameOfProduct(), product.getDescription(), productPackage);
        if (count < 0) throw new IllegalArgumentException("Отрицательное количество штук!");
        this.count = count;
        this.product = product;
        this.productPackage = productPackage;
    }

    public Product getProduct() {return product;}

    public int getCount(){ return  count;}

    public int getNetto() {
        return product.getWeight() * count;
    }

    public int getBrutto() { return product.getWeight() * count + productPackage.getWeightPack();}

    @Override
    public String getNameOfProduct() {
        return nameOfProduct;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof WrappedProductPiece)) return false;
        WrappedProductPiece that = (WrappedProductPiece) o;
        return Double.compare(that.getCount(), getCount()) == 0 && Objects.equals(getProductPackage(),
                that.getProductPackage()) && Objects.equals(getProduct(), that.getProduct());
    }
    @Override
    public String toString() {
        return "Упакованный штучный товар || Название: " + product.getNameOfProduct()
                + ". Описание: " + product.getDescription()
                + ". Тип упаковки: " + productPackage.getNamePack()
                + ". Кол-во штук: " + count+".\n";
    }
}