package LanQianBei16th.LqTest.Demo08;

import java.util.Scanner;

/**
 * 素数环
 * @author QIA
 * @create 2025-04-09-23:31
 */
public class Main74 {
    static Scanner sc = new Scanner(System.in);
    static int n = sc.nextInt();
    static int[] a = new int[n+1];
    static int[] vis = new int[n+1];
    static int b=0;  // 标记当不存在满足要求的素数环时，输出No Answer
    public static void main(String[] args) {
        a[1]=1;
        vis[1]=1;
        dfs(2);
        if (b==0) {
            System.out.println("No Answer");
        }
    }

    // dfs遍历所有可能性
    public static void dfs(int step) {
        if (step == n+1 &&prime(a[1]+a[n])) {
            b=1;
            for (int i = 1; i <= n; i++) {
                System.out.print(a[i]+" ");
            }
            System.out.println();
        }
        for (int i = 2; i <= n; i++) {
            if (vis[i] == 0 && prime(a[step-1]+i)) {
                vis[i] =1;
                a[step]=i;
                dfs(step+1);
                vis[i] = 0;
            }
        }
    }

    // 判断是否素数
    public static boolean prime(int x){
        if (x <= 1) return false;
        for (int i = 2; i <= Math.sqrt(x); i++) {
            if (x % i == 0) return false;
        }
        return true;
    }
}
