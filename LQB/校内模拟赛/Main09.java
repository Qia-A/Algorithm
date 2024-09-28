package Competition.lanqiao.LQB.校内模拟赛;

import java.util.Scanner;

/**
 * @author QIA
 * @create 2023-03-11-17:00
 */
public class Main09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // n行 * m列
        int n = sc.nextInt();
        int m = sc.nextInt();
        // 清理次数
        int count = sc.nextInt();

        int[][] a = new int[n + 10][m + 10];
        while (count-- > 0) {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            a[x1][y1]++;
            a[x2 + 1][y2]--;
            a[x1][y2 + 1]--;
            a[x2 + 1][y2 + 1]++;
        }
        int res = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                a[i][j] += a[i - 1][j] + a[i][j - 1] - a[i - 1][j - 1];
                if (a[i][j] == 0) res++;
            }
        }
        System.out.println(res);
    }
}
