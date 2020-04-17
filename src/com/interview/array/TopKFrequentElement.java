package interview.array;

import java.util.*;

public class TopKFrequentElement {
    public static List<Integer> topKFrequent(int[] nums, int k) {
        List<Integer>  result= new ArrayList<>();
        if(nums.length<=0) return result;

        if(k>nums.length) return result;
        int count=0;
        Arrays.sort(nums);
        for (int i = 0; i <nums.length ; i++) {
            while(i <nums.length-1 && nums[i]==nums[i+1]) i++;
            if(count<k) {
                result.add(nums[i]);
                count++;
            }
        }

        return result;
    }
    public static List<Integer> topKFrequentHeap(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int n: nums){
            map.put(n, map.getOrDefault(n,0)+1);
        }

        PriorityQueue<Map.Entry<Integer, Integer>> maxHeap =
                new PriorityQueue<>((a,b)->(b.getValue()-a.getValue()));
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            maxHeap.add(entry);
        }

        List<Integer> res = new ArrayList<>();
        while(res.size()<k){
            Map.Entry<Integer, Integer> entry = maxHeap.poll();
            res.add(entry.getKey());
        }
        return res;
    }
}
