package interview.Matrix.test;

import interview.Matrix.PopUpTruck;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PopUpTruckTest {
    List<List<Integer>> list=null;
    @BeforeEach
    public void before(){
        list = Collections.asList(
                Collections.asList(1,1,0,0),
                Collections.asList(0,0,1,0),
                Collections.asList(0,0,0,0),
                Collections.asList(1,0,1,1),
                Collections.asList(1,1,1,1)
                );
    }

    @Test
    public  void test1(){
assertEquals(PopUpTruck.numberAmazonTreasureTrucks(5,4,list),3);
    }

}

class Collections {
    public static <T> List<T> asList(T ... items) {
        List<T> list = new ArrayList<T>();
        for (T item : items) {
            list.add(item);
        }

        return list;
    }
}