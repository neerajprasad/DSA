package java8;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.IntStream;
import java.util.stream.Stream;

interface IAverage{
    int avg(List<Integer> array);
}
public class LamdaMultipleStatement {

    public static void main(String[] args) {
        IAverage iAverage = new IAverage() {
            @Override
            public int avg(List<Integer> array) {
                OptionalDouble avg =array.stream().mapToInt(Integer::intValue).average();

                return (int) avg.getAsDouble();
            }
        };
        System.out.println(iAverage.avg(Arrays.asList(1,2,3,4,5,6)));
    }
}
