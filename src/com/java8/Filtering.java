package java8;

import sun.management.counter.Counter;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Filtering {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("One");
        list.add("OneAndOnly");
        list.add("Derek");
        list.add("Change");
        list.add("factory");
        list.add("justBefore");
        list.add("Italy");
        list.add("Italy");
        list.add("Thursday");
//        list.add("");
//        list.add("");

//        filtering start with c
//        list.stream().filter(a -> a.startsWith("C") || a.startsWith("c")).forEach(System.out::println);
//        matching
        list.stream().anyMatch(a -> a.contains("a"));
//        collection of list
        list.stream().map(element -> element.toUpperCase()).collect(Collectors.toSet()).stream().sorted((ele1,ele2) -> ele2.compareTo(ele1)).forEach(System.out::println);
        AtomicInteger counter = new AtomicInteger();
//        collection of map
        Map<String, Integer> cards2Length = list.stream()
                .collect(Collectors.toMap((c) -> c, (c) -> counter.incrementAndGet(),(oldV, newV)->newV));
        System.out.println(cards2Length);

//        Read more: https://javarevisited.blogspot.com/2016/04/10-examples-of-converting-list-to-map.html#ixzz6IC6a7A7O
    }
}
