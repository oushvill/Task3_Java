public class Main {
    public static void main(String[] args) {
        //Упаковка товара
        ProductPackage productPackage = new ProductPackage(2, "Картонная коробка");
        System.out.println(productPackage.toString());
        System.out.println();

        //Товар
        Product product = new Product("Новогодние сладости ", "Набор сладостей для детей");
        System.out.println(product.toString());

        //Весовой товар
        ProductWeight productWeight = new ProductWeight("Печенье 'Карнавал'", "печенье в шоколаде", 5);
        System.out.println(productWeight.toString());

        //Штучный товар
        ProductPiece productPiece = new ProductPiece("Упаковка конфет", "конфеты с кокосовой начинкой", 4);
        System.out.println(productPiece.toString());
        System.out.println();

        //Упакованный штучный товар
        WrappedProductPiece wrappedProductPiece = new WrappedProductPiece(productPackage, 3, productPiece);
        System.out.println(wrappedProductPiece.toString());
        System.out.println("Масса нетто = " + wrappedProductPiece.getNetto());
        System.out.println("Масса брутто = " + wrappedProductPiece.getBrutto());
        System.out.println();

        //Упакованный весовой товар
        WrappedProductWeight wrappedProductWeight = new WrappedProductWeight(productPackage, 3, productWeight);
        System.out.println(wrappedProductWeight.toString());
        System.out.println("Масса нетто = " + wrappedProductWeight.getNetto());
        System.out.println("Масса брутто = " + wrappedProductWeight.getBrutto());
        System.out.println();

        //Партия товаров
        ProductPackage productPackage2 = new ProductPackage(1, "Картонная коробка");
        ProductBatch productWeights = new ProductBatch("Партия весового товара",
                new WrappedProductWeight(productPackage2, 10, new ProductWeight("Картошка", "Свежая", 10)),
                new WrappedProductWeight(productPackage2, 10, new ProductWeight("Бананы", "Эквадорские", 10)),
                new WrappedProductWeight(productPackage2, 10, new ProductWeight("Огурцы", "Тепличные", 10))
        );
        ProductBatch productPieces = new ProductBatch("Партия штучного товара",
                new WrappedProductPiece(productPackage2, 6, new ProductPiece("Кока-Кола (2л)", "Ящик", 12)),
                new WrappedProductPiece(productPackage2, 3, new ProductPiece("Актимель (0,2л)", "Коробка", 2)),
                new WrappedProductPiece(productPackage2, 10, new ProductPiece("Сигареты", "Блок", 1))
        );

        System.out.println(productWeights.toString());
        int brWeights = productWeights.getWeight();
        System.out.println("Масса брутто '" + productWeights.getDescription() + "' = " + brWeights+"\n");

        System.out.println(productPieces.toString());
        int brPieces = productWeights.getWeight();
        System.out.println("Масса брутто '" + productPieces.getDescription() + "' = " + brPieces+"\n");

        //Фильтры
        String str = "груши , яблоки , торты";
        System.out.println("Проверка следующих товаров: " + str);

        BeginStringFilter beginF1 = new BeginStringFilter("груши");
        BeginStringFilter beginF2 = new BeginStringFilter("торты");
        boolean res1 = beginF1.apply(str); // true
        boolean res2 = beginF2.apply(str); // false
        System.out.println("Первый товар 'груши' = " + res1);
        System.out.println("Первый товар 'торты' = " + res2);

        EndStringFilter endF1 = new EndStringFilter("груши");
        EndStringFilter endF2 = new EndStringFilter("торты");
        boolean res3 = endF1.apply(str); // false
        boolean res4 = endF2.apply(str); // true
        System.out.println("Последний товар 'груши' = " + res3);
        System.out.println("Последний товар 'торты' = " + res4);

        IncludeStringFilter inF1 = new IncludeStringFilter("яблоки");
        boolean res5 = inF1.apply(str); // true
        System.out.println("Присутствует товар 'яблоки' = " + res5);
        System.out.println();

        //Сервис товаров
        ProductBatch batchOfGoods = new ProductBatch("Партия сервисного товара",
                new WrappedProductWeight(new ProductPackage(0, "Фура"), 25, new ProductWeight("Арбузы", "Шымкентские", 1200)),
                new WrappedProductWeight(new ProductPackage(0, "Фура"), 25, new ProductWeight("Арбузы", "Астраханские", 800)),
                new WrappedProductPiece(new ProductPackage(1, "Мешок"), 10, new ProductPiece("Бутылки", "Утилизированные", 25))
        );
        System.out.println(batchOfGoods);

        BeginStringFilter ServiceBegin = new BeginStringFilter("Арбузы");

        System.out.println("Товаров удовлетворяющих запросу найдено: "+ServiceProducts.countByFilter(batchOfGoods, ServiceBegin));
    }
}
