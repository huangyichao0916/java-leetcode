package p628;

import java.util.Arrays;

public class P628 {
    public static void main(String[] args) {
        System.out.println(new Solution().maximumProduct(new int[]{-1, -2, -3}));
    }
}

class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        return Math.max(nums[len - 1] * nums[len - 2] * nums[len - 3], nums[len - 1] * nums[0] * nums[1]);
    }
}