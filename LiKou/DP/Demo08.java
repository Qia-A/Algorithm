package Contest_23.LiKou.DP;

/**
 * 动态规划
 * 力扣494 目标和
 * https://leetcode.cn/problems/target-sum/
 * 给你一个整数数组nums和一个整数target。
 * 向数组中的每个整数前添加'+'或'-'，然后串联起所有整数，可以构造一个表达式：
 *   例如，nums = [2,1]，可以在2之前添加'+'，在1之前添加'-'，然后串联起来得到表达式"+2-1"。
 * 返回可以通过上述方法构造的、运算结果等于target的不同表达式的数目。
 *
 *
 * @author QIA
 * @create 2022-11-24-20:03
 */
public class Demo08 {
    public static int findTarget(int[] nums,int target) {
        //动态规划
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            //绝对值范围超过了sum的绝对值范围则无法得到
        }
        if (Math.abs(target) > Math.abs(sum)) {
            return 0;
        }
        int len = nums.length;
        int range = sum * 2 + 1;//因为要包含负数所以要两倍，又要加上0这个中间的那个情况
        int[][] dp = new int[len][range];//这个数组是从总和为-sum开始的
        //加上sum纯粹是因为下标界限问题，赋第二维的值的时候都要加上sum
        // 初始化  第一个只能分别组成+-nums[i]的一种情况
        dp[0][sum + nums[0]] += 1;
        dp[0][sum - nums[0]] += 1;
        for (int i = 1; i < len; i++) {
            for (int j = -sum; j <= sum; j++) {
                if ((j+nums[i]) > sum) {//+不成立  加上当前数大于了 sum   只能减去当前的数
                    dp[i][j+sum] = dp[i - 1][j - nums[i] + sum] + 0;
                }else if((j - nums[i]) < -sum) { //-不成立， 减去当前数小于-sum  只能加上当前的数
                    dp[i][j+sum] = dp[i-1][j+nums[i]+sum] + 0;
                }else { // +-都可以
                    dp[i][j+sum] = dp[i - 1][j + nums[i] + sum] + dp[i-1][j-nums[i] + sum];
                }
            }
        }
        return dp[len - 1][sum + target];
    }
    public static int findTarget1(int[] nums,int target) {
        /*
        类01背包问题：
        设pos为取+的数字和，neg为取-的数字和（均为正数），则target = pos - neg=pos - （sum - pos） = 2*pos-sum
        故pos=（sum + target）/ 2 >= 0且为常数，因此此问题等价于求有多少种方法用nums[i]凑成和为pos
        进而该问题抽象为：用价值与体积均为nums[i]的物品，恰好凑满容量为pos的背包方案数
        1、动态定义：dp[i]为恰好能凑满容量为j的背包方案数
        2、状态转移：背包容量能或者不能装下nums[i]
            2.1当不能装下nums[i]时，方案数直接继承之前的dp[j]
            2.2当能装下nums[i]时，总的方案数为不考虑nums[i]的方案数 + 有nums[i]参与新增的方案数
                dp[j] += dp[j - nums[i]],dp[j - nums[i]]种方案与nums[i]共同凑成pos，即1*dp[j - nums[i]]
        3、状态初始化：dp[0] = 1,因为后面总会一直查找至j = 0，如dp[3] += dp[3 - 3],空集是任意一条有效路径的起点，当属一条
        4、遍历顺序：i正序，j倒序
        5、返回形式：dp[pos]就是凑成pos总的方案数
         */
        int len = nums.length;
        int sum = 0;
        for (int num : nums) sum += num;
        //pos为小数 || target绝对值比sum还大
        if((sum + target) % 2 == 1 || Math.abs(target) > sum) return 0;
        int pos = (sum + target) / 2;
        int[] dp = new int[pos + 1];
        dp[0] = 1;
        for (int num : nums) {
            for (int j = pos; j >= num; j--) {
                dp[j] += dp[j - num];
            }
        }
        return dp[pos];
    }

    public static void main(String[] args) {
        //测试用例
        int[] nums = {1,1,1,1,1};
        int target = 3;
        System.out.println(findTarget(nums, target));
    }
}