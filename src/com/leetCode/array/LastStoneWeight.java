package leetCode.array;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LastStoneWeight {
    public static void main(String[] args) {
        int[] arr = {2, 7, 4, 1, 8, 1};
        System.out.println(getLastWeightQueue(arr));
    }

    public static int getLastWeight(int[] arr) {
        List<Integer> lists = IntStream.of(arr)
                .boxed().collect(Collectors.toCollection(ArrayList::new));
        lists = lists.stream().sorted((a, b) -> b.compareTo(a)).collect(Collectors.toList());
        for (int i = 0; i < lists.size() - 1; ) {
            int value = lists.remove(i) - lists.remove(i);
            if (value != 0)
                lists.add(value);
            lists = lists.stream().sorted((a, b) -> b.compareTo(a)).collect(Collectors.toList());
        }


        return lists.size() == 0 ? 0 : lists.get(0);
    }

    public static int getLastWeightQueue(int[] arr) {
        Queue<Integer> queue = new PriorityQueue<>((a, b) -> b.compareTo(a));
        for (Integer a : arr
        ) {
            queue.add(a);
        }
        while (queue.size()>1){
            queue.add(queue.poll()-queue.poll());
        }
        return queue.size() == 0 ? 0 : queue.poll();
    }
}
