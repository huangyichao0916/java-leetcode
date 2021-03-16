package p377;

public class P377 {
    public static void main(String[] args) {
        Solution s1 = new Solution();
        System.out.println(s1.combinationSum4(new int[]{1, 2, 3},4));;
    }
}

class Solution {
    public int total = 0;

    public int combinationSum4(int[] nums, int target) {
        helper(nums, target, 0);
        return total;
    }

    public void helper(int [] nums, int target, int sum){
        if (sum > target){
            return;
        }
        if (sum == target){
            total ++;
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            int ele = nums[i];
            if (ele > target){
                continue;
            }
            sum += ele;
            helper(nums, target, sum);
            sum -= ele;
        }
    }
}