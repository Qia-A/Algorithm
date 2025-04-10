package LanQianBei16th.LqTest.Demo01;


import java.util.Scanner;

/**
 * 01背包问题
 * 有 N件物品和一个容量是 V的背包。每件物品只能使用一次。第 i件物品的体积是 vi，价值是 wi。
 * 求解将哪些物品装入背包，可使这些物品的总体积不超过背包容量，且总价值最大。输出最大价值。
 *
 * 输入格式
 * 第一行两个整数，N，V，用空格隔开，分别表示物品数量和背包容积。
 * 接下来有 N行，每行两个整数 vi,wi，用空格隔开，分别表示第 i 件物品的体积和价值。
 *
 * 输出格式
 * 输出一个整数，表示最大价值。
 *
 * 数据范围
 * 0<N,V≤1000
 * 0<vi,wi≤1000
 * @author QIA
 * @create 2025-02-24-17:02
 */
public class Main03 {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int V = sc.nextInt();
        int[] v = new int[N+1];
        int[] w = new int[N+1];

        for (int i = 1; i <= N; i++) {
            v[i] = sc.nextInt();
            w[i] = sc.nextInt();
        }
        sc.close();

//        // ①01问题
//        int[][] dp = new int[N+1][V+1];
//        dp[0][0] = 0;
//        for (int i = 1; i <= N;i++){
//            for (int j = 0; j <= V; j++) {
//                if (j >= v[i]) {
//                    dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j-v[i]] + w[i]);
//                }else{
//                    dp[i][j] = dp[i-1][j];
//                }
//            }
//        }
//        System.out.println(dp[N][V]);

        // ②01问题
        int[] dp = new int[V+1];
        dp[0] = 0;
        for(int i = 1; i <= N; i++){
            for(int j = V; j >= v[i]; j--){
                dp[j] = Math.max(dp[j], dp[j-v[i]] + w[i]);
            }
        }
        System.out.println(dp[V]);
    }
}
