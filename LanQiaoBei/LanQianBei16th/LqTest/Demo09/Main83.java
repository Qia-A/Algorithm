package LanQianBei16th.LqTest.Demo09;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 最小质因子之和
 * @author QIA
 * @create 2025-04-11-19:26
 */
public class Main83 {
    static int N = 3000010;
    static long[] sd = new long[N]; // 存储前缀和

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        prime(N-1);
        int t = sc.nextInt();
        while(t-- > 0){
            // 输入n后，将n传入到方法内
            int n = sc.nextInt();
            System.out.println(sd[n]);
        }
    }

    // 埃筛法
    static void prime(int n) {

        Arrays.fill(sd,0);

        for(int i = 2; i <= n;i++){
            if(sd[i] == 0) {
                sd[i] = i;
                if ((long)i * i > n) continue;
                for (int j = i * i; j <= n; j += i) {
                    if (sd[j] == 0) sd[j] = i;
                }
            }
        }

        for(int i = 3;i <= n;i++){
            sd[i] += sd[i-1];
        }
    }
}