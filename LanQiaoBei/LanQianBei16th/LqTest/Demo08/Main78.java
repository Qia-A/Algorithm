package LanQianBei16th.LqTest.Demo08;

import java.util.Scanner;

/**
 * 棋盘
 * @author QIA
 * @create 2025-04-10-13:02
 */
public class Main78 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        boolean[][] arr = new boolean[n][n];
        while (m-- > 0){ // 记录差分数组头尾
            int x1 = sc.nextInt()-1;
            int y1 = sc.nextInt()-1;
            int x2 = sc.nextInt()-1;
            int y2 = sc.nextInt()-1;
            for (int i = x1; i <=x2 ; i++) {
                for (int j = y1; j <= y2; j++) {
                    arr[i][j] ^= true;
                }
            }
        }
        sc.close();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] ? 1 : 0);
            }
            System.out.println();
        }
    }
}
