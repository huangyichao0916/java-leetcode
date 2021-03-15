package p217;

import java.util.HashMap;

public class P217 {

}

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> hm1 = new HashMap<Integer,Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (hm1.containsKey(nums[i])){
                return true;
            }
            hm1.put(nums[i],i);
        }
        return false;
    }
}