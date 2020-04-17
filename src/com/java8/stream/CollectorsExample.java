package java8.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CollectorsExample {
    private static List< Product > productsList = new ArrayList< Product >();
    public static void main(String[] args) {
        productsList.add(new Product(1, "HP Laptop", 25000f));
        productsList.add(new Product(2, "Dell Laptop", 30000f));
        productsList.add(new Product(3, "Lenevo Laptop", 28000f));
        productsList.add(new Product(4, "Sony Laptop", 28000f));
        productsList.add(new Product(5, "Apple Laptop", 90000f));
        productsList.stream().forEach(System.out::println);
        productPriceTotal();
        productSortbyName();
        productTotalCount();
        productAveragePriceValue();
        productWithMinPriceValue();
    }

    private static void  productWithMinPriceValue() {
        System.out.println(productsList.stream().min(Comparator.comparing(Product::getPrice)));
    }

    private static void productAveragePriceValue() {
        System.out.println(productsList.stream().collect(Collectors.averagingDouble(x ->x.getPrice())));
    }

    private static void productTotalCount() {
        System.out.println(productsList.stream().collect(Collectors.counting()).intValue());
    }

    private static void  productSortbyName() {
        productsList.stream().sorted((x,y) -> x.getName().compareTo(y.getName())).limit(2).skip(1).collect(Collectors.toList()).stream().forEach(System.out::println);
    }

    private static void productPriceTotal() {
    Double aDouble = productsList.stream().collect(Collectors.summingDouble(x -> x.getPrice())).doubleValue();
        System.out.println(aDouble);

    }
}
