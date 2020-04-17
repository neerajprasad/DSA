package leetCode.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ThreeSum {

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        if (nums.length < 3) return result;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int j = i + 1;
            int k = nums.length - 1;

            while (j < k) {
                if (nums[i]+ nums[j] + nums[k]==0) {
                    result.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    while (++j<k&&nums[j] == nums[j - 1]);
                    while (--k>j&&nums[k] == nums[k + 1]) ;
                } else if (nums[j] + nums[k] + nums[i]>0) {
                    while(--k >j&&nums[k]==nums[k+1]);
                } else {
                    while(++j<k && nums[j]==nums[j-1]);
                }
            }


        }
        return result;
    }
    public static List<List<Integer>> threeSumCopy(int[] nums) {
        List<List<Integer>> res = new LinkedList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; ++i) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int l = i + 1, r = nums.length - 1;
            while (l < r) {
                if (nums[i] + nums[l] + nums[r] == 0) {
                    res.add(Arrays.asList(nums[i], nums[l], nums[r]));
                    while (++l < r && nums[l] == nums[l - 1]) ; // skip the same b
                    while (--r > l && nums[r] == nums[r + 1]) ; // skip the same c
                } else if (nums[i] + nums[l] + nums[r] > 0) {
                    while (--r > l && nums[r] == nums[r + 1]) ;
                } else {
                    while (++l < r && nums[l] == nums[l - 1]) ;
                }
            }
        }

        return res;
    }
}

