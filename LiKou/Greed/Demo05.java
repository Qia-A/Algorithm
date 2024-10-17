package Contest_23.LiKou.Greed;

/**
 * 贪心算法
 * 力扣134  加油站
 * https://leetcode.cn/problems/gas-station/
 * 在一条环路上有n个加油站，其中第i个加油站有汽油gas[i]升。
 * 你有一辆油箱容量无限的的汽车，从第i个加油站开往第i+1个加油站需要消耗汽油cost[i]升。你从其中的一个加油站出发，开始时油箱为空。
 * 给定两个整数数组gas和cost，如果你可以绕环路行驶一周，则返回出发时加油站的编号，否则返回-1。如果存在解，则保证它是唯一的。
 *
 * @author QIA
 * @create 2022-11-25-13:10
 */
public class Demo05 {
    public static int canComplete(int[] gas,int[] cost) {

        return 0;
    }

    public static void main(String[] args) {
        //测试用例
        int[] gas = {1,2,3,4,5};
        int[] cost = {3,4,5,1,2};
        System.out.println(canComplete(gas, cost));
    }
}
