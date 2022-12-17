package LiKou.Arrays;

/**
 * 数组
 * 力扣322 零钱兑换
 * https://leetcode.cn/problems/coin-change/
 * 给你一个整数数组coins，表示不同面额的硬币；以及一个整数amount，表示总金额。
 * 计算并返回可以凑成总金额所需的【最少的硬币个数】。如果没有任何一种硬币组合能组成总金额，返回-1。
 * 你可以认为每种硬币的数量是无限的。
 *
 * @author QIA
 * @create 2022-11-18-3:32
 */
public class Demo16 {
    //递归,【超时】
    static int res = Integer.MAX_VALUE;
    public static int coinChange(int[] coins,int amount) {
        if (coins.length == 0){
            return -1;
        }
        findWay(coins,amount,0);

        //如果没有任何一种硬币组合能组成总金额，返回 -1.
        if (res == Integer.MAX_VALUE){
            return -1;
        }
        return res;
    }
    public static void findWay(int[] coins,int amount,int count) {
        if (amount < 0){
            return;
        }
        if (amount == 0){
            res = Math.min(res,count);
        }
        for (int i = 0; i < coins.length; i++) {
            findWay(coins,amount-coins[i],count+1);
        }
    }

    public static void main(String[] args) {
        int[] coins = {1,2,5};
        int amount = 11;
        System.out.println(coinChange(coins, amount));
    }
}
