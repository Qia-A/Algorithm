package Competition.lanqiao.lqTest.Test1;

import java.util.Scanner;

/**
 * 算法训练-1007 印章  DP
 * 题目：共有n种图案的印章，每种图案的出现概率相同。小A买了m张印章，求小A集齐n种印章的概率。
 * 输入格式：一行两个正整数 n和 m
 * 输出格式：一个实数P表示答案，保留4位小数。
 * 样例输入：2 3
 * 样例输出：0.7500
 * 数据规模和约定：1 <= n,m <= 20
 *
 * @author QIA
 * @create 2023-02-19-20:37
 */
public class Demo05 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(),m = s.nextInt();
        // 设置初始化
        double arr[][] = new double[m+1][n+1];
        double p = 1.0/n;
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (i < j) {
                    // 当 图案数量 > 购买印章，集齐的概率为 0
                    arr[i][j] = 0;
                }
                if (j == 1) {
                    // 当 图案数量为 1 时，集齐的概率为购买印章数量的次方
                    arr[i][j] = Math.pow(p, i-1);
                } else {
                    // DP 的状态方程
                    arr[i][j] = arr[i-1][j-1]*(n-j+1)*p + arr[i-1][j]*(j*p);
                }
            }
        }
        System.out.printf("%.4f",arr[m][n]);
    }
}
