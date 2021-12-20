abstract public class PackageProduct extends Product {
    protected final ProductPackage product;

    public PackageProduct(String nameOfProduct, String description, ProductPackage product) {
        super(nameOfProduct, description);
        this.product = product;
    }

    public ProductPackage getProductPackage() {
        return product;
    }

    abstract public int getNetto();

    abstract public int getBrutto();

    abstract public String getNameOfProduct();

}
