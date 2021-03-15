package p70;

import java.util.ArrayList;

public class P70 {
    public static void main(String[] args) {

    }
}

class Solution {
    public int climbStairs(int n) {
        ArrayList<Integer> arr1 = new ArrayList<Integer>();
        arr1.add(0);
        arr1.add(1);
        arr1.add(2);
        for (int i = 3; i <= n; i++) {
            arr1.add(arr1.get(i - 1) + arr1.get(i - 2));
        }
        return arr1.get(n);
    }
}