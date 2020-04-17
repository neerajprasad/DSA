package java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamExample {
    private static List< Product > productsList = new ArrayList< Product >();

    public static void main(String[] args) {

        // Adding Products
        productsList.add(new Product(1, "HP Laptop", 25000f));
        productsList.add(new Product(2, "Dell Laptop", 30000f));
        productsList.add(new Product(3, "Lenevo Laptop", 28000f));
        productsList.add(new Product(4, "Sony Laptop", 28000f));
        productsList.add(new Product(5, "Apple Laptop", 90000f));
        // Without Java 8 Stream API'S
//        withoutStreamAPI();
        withStreamApi();
    }

    private static void withStreamApi() {
//        productsList.stream().filter(a -> a.getPrice() > 25000).forEach(System.out::println);
        Set<Float> collect = productsList.stream().filter(a -> a.getPrice() > 25000).map(product -> product.getPrice()).collect(Collectors.toSet());
        collect.forEach(System.out::println);
    }

    private static void withoutStreamAPI() {
        for (Product p:productsList
             ) {
            System.out.println(p.getName());
        }
    }

}
