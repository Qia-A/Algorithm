package Competition.lanqiao.LQB.校内模拟赛;

import java.util.Scanner;

/**
 * @author QIA
 * @create 2023-03-11-16:21
 */
public class Main05 {
        public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int t = scanner.nextInt();
            int[][] a = new int[n + 10][m + 10];
            while(t-- > 0){
                int r1 = scanner.nextInt();
                int c1 = scanner.nextInt();
                int r2 = scanner.nextInt();
                int c2 = scanner.nextInt();
                a[r1][c1]++;
                a[r2 + 1][c1]--;
                a[r1][c2 + 1]--;
                a[r2 + 1][c2 + 1]++;
            }
            int res = 0;
            for(int i = 1; i <= n; i++){
                for(int j = 1; j <= m; j++){
                    a[i][j] += a[i - 1][j] + a[i][j - 1] - a[i - 1][j - 1];
                    if(a[i][j] == 0) res++;
                }
            }
            System.out.println(res);
        }

}
