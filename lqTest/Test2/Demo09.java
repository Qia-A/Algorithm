package Competition.lanqiao.lqTest.Test2;

import java.util.Scanner;

/**
 * 2020省赛 动态规划  3月集训
 * 数字三角形
 * @author QIA
 * @create 2023-03-22-11:39
 */
public class Demo09 {
    public static void main(String[] args) {
        //输出
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] array = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                array[i][j] = sc.nextInt();
            }
        }
        for (int i = n - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                array[i-1][j] += Math.max(array[i][j], array[i][j + 1]);
            }
        }
        System.out.println(array[0][0]);
    }
}
