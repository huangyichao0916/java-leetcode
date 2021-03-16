package p349;

import java.util.*;

public class P349 {
    public static void main(String[] args) {
        int [] arr1 = new int[]{4,9,5};
        int [] arr2 = new int[]{9,4,9,8,4};
        int [] arr3 = new Solution().intersection(arr1,arr2);
        for (int a : arr3){
            System.out.println(a);
        }
    }
}

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> arr1 = new HashSet<Integer>();
        HashSet<Integer> arr2 = new HashSet<Integer>();
        for (int i = 0; i < nums1.length; i++) {
            arr1.add(nums1[i]);
        }
        for (int i = 0; i < nums2.length; i++) {
            arr2.add(nums2[i]);
        }

        ArrayList<Integer> arrfin = new ArrayList<Integer>();
        for (int num : arr1){
            if (arr2.contains(num)){
                arrfin.add(num);
            }
        }

        int [] finalArr = new int[arrfin.size()];
        int index = 0;
        for (int num : arrfin){
            finalArr[index] = num;
            index ++;
        }
        return finalArr;
    }
}