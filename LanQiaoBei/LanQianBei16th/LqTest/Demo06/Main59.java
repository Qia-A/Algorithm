package LanQianBei16th.LqTest.Demo06;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 19699  类斐波那契数列
 * @author QIA
 * @create 2025-04-05-13:55
 */
public class Main59 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 反向遍历
        for (int i = 10000000; i > 0; i--) {
            if (check(i)){
                // i为目标打印结果，并结束循环
                System.out.println(i);
                break;
            }
        }
        sc.close();
    }

    /**
     * 检测该数是否为类斐波那契额数列
     * @param x
     * @return
     */
    private static boolean check(int x) {
        String s = x + "";
        // 获取位数
        int l = s.length();
        int[] dp = new int[l];
        // 数x的每一位都拆出来存入数组
        for (int i = 0; i < l; i++) {
            dp[i] = s.charAt(i) - '0';
        }
        int sum = 0;
        // 迭代数组检查该数是否为类斐波那契额数列
        for (int i = l; sum < x ; i++) {
            sum = Arrays.stream(dp).sum(); // 数组求和
            dp[i%l] = sum;
        }
        // 跳出循环后  sum >= x
        return sum == x;
    }
}
