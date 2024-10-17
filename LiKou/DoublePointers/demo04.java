package Contest_23.LiKou.DoublePointers;

/**
 * 双指针算法
 *
 * @author QIA
 * @create 2022-11-05-16:52
 */
public class demo04 {
    //力扣202.编写一个算法来判断一个数 n 是不是快乐数。
    //[ 快乐数 ]定义为：
    //对于一个正整数，每一次将该数替换为它每个位置上的数字的平方和。然后重复这个过程直到这个数变为 1，也可能是 无限循环 但始终变不到 1。
    //如果这个过程 结果为 1，那么这个数就是快乐数。如果 n 是 快乐数 就返回 true ；不是，则返回 false 。
    //https://leetcode.cn/problems/happy-number/

    public static boolean isHappy(int n){
        int slow = n,fast = n;//定义快慢指针
        do{
            slow = Sum(slow);
            fast = Sum(fast);
            fast = Sum(fast);
        }while(slow != fast);

        return slow == 1;
    }

    public static int Sum(int n){
        int sum = 0;
        while(n > 0){
            int bit = n % 10;
            sum += bit * bit;
            n = n / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int n = 19;
        System.out.println(isHappy(n));
    }

}
