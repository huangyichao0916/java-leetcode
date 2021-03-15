package two;

import java.util.HashMap;

public class TwoHYC {
    public static void main(String[] args) {
        Solution s1 = new Solution();
        int[] iii = s1.twoSum(new int[]{2, 7, 11, 15}, 9);
        for (int x : iii) {
            System.out.println(x);
        }
    }
}

class Solution{
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hm1 = new HashMap<Integer,Integer>();
        for (int i = 0; i < nums.length; i++) {
            int other = target - nums[i];
            if (hm1.containsKey(other)){
                return new int[]{i,hm1.get(other)};
            }
            hm1.put(nums[i],i);
        }
        return new int[]{0,0};
    }
}

//class Solution {
//    public int[] twoSum(int[] nums, int target) {
//        for (int i = 0; i < nums.length - 1; i++) {
//            int other = target - nums[i];
//            for (int jj = i + 1; jj < nums.length; jj++) {
//                if (nums[jj] == other) {
//                    return new int[]{i, jj};
//                }
//            }
//        }
//        return new int[]{0, 0};
//    }
//}