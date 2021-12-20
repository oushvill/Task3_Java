public class ServiceProducts {
    public static int countByFilter(ProductBatch batchOfGoods, Filter filter) {
        int res = 0;
        for (PackageProduct products : batchOfGoods.getProducts()) {
            if (filter.apply(products.getNameOfProduct())) res++;
        }
        return res;
    }
}
