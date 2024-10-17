package Contest_23.LiKou.DoublePointers;

/**
 * 贪心算法
 * 力扣202  快乐数
 * https://leetcode.cn/problems/happy-number/
 * 编写一个算法来判断一个数 n 是不是快乐数。
 * 「快乐数」定义为：
     * 对于一个正整数，每一次将该数替换为它每个位置上的数字的平方和。
     * 然后重复这个过程直到这个数变为1，也可能是无限循环但始终变不到1。
     * 如果这个过程结果为1，那么这个数就是快乐数。
 * 如果n是快乐数就返回true；不是，则返回false。
 *
 * @author QIA
 * @create 2022-11-25-20:05
 */
public class Demo06 {
    public static boolean isHappy(int n){
        //快慢指针："快指针"每次走两步，”慢指针“每次走一步，当二者相等时，即为一个循环周期。
        // 此时，判断是不是因为1引起的循环，是的话就是快乐数，否则不是快乐数。
        // 注意：此时不建议用集合记录每次的计算结果来判断是否进入循环，因为这个集合可能大到无法存储；
        int slow = n,fast = n;
        do{
            slow = bitSquareSum(slow);
            fast = bitSquareSum(fast);
            fast = bitSquareSum(fast);
        }while(slow != fast);

        return slow == 1;
    }
    public static int bitSquareSum(int n) {
        int sum = 0;
        while(n > 0) {
            int bit = n % 10;
            sum += bit * bit;
            n = n / 10;
        }
        return sum;
    }


    public static void main(String[] args) {
        //测试用例
        int n = 2;
        System.out.println(isHappy(n));
    }
}
