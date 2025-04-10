package LanQianBei16th.LqTest.Demo02;

import java.util.Scanner;

/**
 * 9993 扫雷Ⅱ
 * @author QIA
 * @create 2025-03-05-17:06
 */
public class Main11 {
    static int N = (int)5e5+10,mod = 998244353;
    static int n;
    static int[][][] f =new int[N][3][3]; //i,j,k: 处理到第i列，第i列的地雷情况j和第i+1列地雷情况k
    static int[] p = new int[N]; // 每列地雷数

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); // 读取列数
        if (n == 1){
            int x = sc.nextInt();
            if (x == 0||x == 2) System.out.println(1);
            else System.out.println(2);
            return;
        }
        for (int i = 1; i <= n; i++) {
            p[i] = sc.nextInt();
        }
        // 处理第1列所有情况
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i+j==p[1]){
                    f[1][i][j] = 1;
                }
                if (i == 1){
                    f[1][i][j] *= 2; //当该列地雷数量为1，可以有上下两种情况，故*2
                }
                if (j == 1) {
                    f[1][i][j] *= 2;
                }
            }
        }

        // 由第i列（已知）递推第i+1列（未知）DP
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    int next = p[i+1]-j-k; // next为第i+2列地雷情况
                    if (next >= 0&&next <= 2){
                        f[i+1][k][next] = (f[i+1][k][next] + f[i][j][k])%mod;
                    }
                    if (next == 1){
                        f[i+1][k][next] = (f[i+1][k][next]*2)%mod;
                    }
                }
            }
        }

        // 只要递推到n-1即可,判断n-1列的地雷情况是否满足第n列地雷数量
        int res = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i+j==p[n]){
                    res = (res+f[n-1][i][j])%mod;
                }
            }
        }
        System.out.println(res);
    }
}
