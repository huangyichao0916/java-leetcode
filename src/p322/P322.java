package p322;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class P322 {
    public static void main(String[] args) {
        System.out.println(new Solution().coinChange(new int[]{186,419,83,408}, 6249));
    }
}
class Solution {
    public int coinChange(int[] coins, int amount) {
        if (amount == 0) {
            return 0;
        }
        Arrays.sort(coins);
        MyFlag f1 = new MyFlag();
        helper(0, f1, coins, amount);
        int numOfCoins = f1.numOfCoins;
        return numOfCoins == 0 ? -1 : numOfCoins;
    }

    public void helper(int sum, MyFlag f, int[] coins, int amount) {
        if (f.flag) {
            return;
        }
        if (sum == amount) {
            f.flag = true;
            return;
        }
        if (sum > amount) {
            return;
        }
        for (int i = coins.length - 1; i >= 0; i--) {
            if (coins[i]> amount) {
                continue;
            }
            sum += coins[i];
            f.numOfCoins++;
            helper(sum, f, coins, amount);
            if (f.flag) {
                return;
            }
            sum -= coins[i];
            f.numOfCoins--;
        }
    }

    class MyFlag {
        boolean flag = false;
        int numOfCoins = 0;
    }
}