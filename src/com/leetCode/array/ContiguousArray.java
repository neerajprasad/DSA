package leetCode.array;

import java.util.HashMap;

public class ContiguousArray {
    public static int getLongestContiguousCount(int[] nums){
//        int maxCount=Integer.MIN_VALUE;
//        int count=1;
//        for (int i = 0; i <nums.length ; i++) {
//            while(i <nums.length-1 && nums[i]!=nums[i+1] ){
//                count++;
//                i++;
//            }
//            if(maxCount<count)
//                maxCount=count;
//            count=1;
//        }
//        return maxCount;
        return maxLen(nums,nums.length);
    }

    static int maxLen(int arr[], int n)
    {
        // Creates an empty hashMap hM

        HashMap<Integer, Integer> hM = new HashMap<Integer, Integer>();

        int sum = 0;     // Initialize sum of elements
        int max_len = 0; // Initialize result

        for (int i = 0; i < n; i++)
        {
            arr[i] = (arr[i] == 0) ? -1 : 1;
        }

        // Traverse through the given array

        for (int i = 0; i < n; i++)
        {
            // Add current element to sum

            sum += arr[i];

            // To handle sum=0 at last index

            if (sum == 0)
            {
                max_len = i + 1;
            }

            // If this sum is seen before, then update max_len
            // if required

            if (hM.containsKey(sum + n))
            {
                if (max_len < i - hM.get(sum + n))
                {
                    max_len = i - hM.get(sum + n);
                }
            }
            else // Else put this sum in hash table
                hM.put(sum + n, i);
        }
        return max_len;
    }
}

