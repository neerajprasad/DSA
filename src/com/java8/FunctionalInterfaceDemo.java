package java8;


import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionalInterfaceDemo {
    public static void main(String[] args) {
        Function<Integer,Double> c2f = x -> new Double(x*9/5+32);

        System.out.println(c2f.apply(36));

        Function < String, Integer > stringToInt = Integer::valueOf;

        System.out.println(" String to Int: " + stringToInt.apply("4"));

        Predicate<Integer> integerPredicate = x -> x>100;

        System.out.println(integerPredicate.test(100));

    }

}
