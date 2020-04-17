package java8.stream;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        Product product=null;

        Optional<Product> optionalProduct = Optional.of(Optional.ofNullable(product).orElse(new Product(1, "neeraj", 1000f)));
        System.out.println(optionalProduct.isPresent());

        Optional<String> empty = Optional.empty();
        System.out.println(empty.isPresent());
        orElseThrowOptionalAPI();
    }

    private static void orElseThrowOptionalAPI() {
        String nullName = null;
        String name = Optional.ofNullable(nullName)
                .orElseThrow(IllegalArgumentException::new);
        System.out.println(name);
    }
}
