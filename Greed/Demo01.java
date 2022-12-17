package LiKou.Greed;

/**
 * 贪心算法
 * 力扣122 买卖股票的最佳时机||
 * https://leetcode.cn/problems/best-time-to-buy-and-sell-stock-ii/submissions/
 * 给你一个整数数组prices,其中prices[i]表示某支股票第i天的价格。
 * 在每一天，你可以决定是否购买和/或出售股票。你在任何时候最多
 * 只能持有一股股票。你也可以先购买，然后在同一天出售。
 * 返回你能获得的最大利润。
 *
 * @author QIA
 * @create 2022-11-21-23:10
 */
public class Demo01 {
    public static int maxProfit(int[] prices){
        //定义数组长度
        int len = prices.length;
        //长度小于2，无法进行正常买入和出售股票
        if (len < 2){
            return 0;
        }
        //定义获得的最大利润
        int res = 0;
        for(int i = 1; i < len;i++){
            //判断前一天与当前股票售出的差值，当其大于0，进行累加
            int diff = prices[i] - prices[i - 1];
            if (diff > 0){
                res += diff;
            }
        }
        return res;
    }


    public static void main(String[] args) {
        //测试用例
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }
}
