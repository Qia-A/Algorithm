package Competition.lanqiao.lqTest.Test2;

import java.util.Scanner;

/**
 * 2021 模拟赛 模拟 暴力
 * 扫雷
 * @author QIA
 * @create 2023-03-24-9:43
 */
public class Demo17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int map[][] = new int[n+2][m+2];
        int result[][] = new int[n+2][m+2];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                map[i][j] = sc.nextInt();
            }
        }
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if(map[i][j] == 1) {
                    result[i][j] = 9; // 存在地雷赋给9
                }else {
                    sum = map[i][j] + map[i-1][j-1] + map[i-1][j] + map[i-1][j+1] +
                            map[i][j-1] + map[i][j+1] + map[i+1][j-1] + map[i+1][j] + map[i+1][j+1];
                    result[i][j] = sum;
                }
            }
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
