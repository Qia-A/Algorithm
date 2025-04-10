package LanQianBei16th.LqTest.Demo01;

import java.util.Scanner;

/**
 * 蓝桥 19716  商品库存管理
 * 差分，前缀和
 * @author QIA
 * @create 2025-02-27-22:26
 */
public class Main05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();

        int[][] operate = new int[m][2]; // 记录每次的操作区间
        int[] d = new int[n + 2]; // 差分数组，索引范围 0 到 n+1

        // 读取操作并更新差分数组
        for (int i = 0; i < m; i++) {
            int L = scan.nextInt();
            int R = scan.nextInt();
            operate[i][0] = L;
            operate[i][1] = R;

            // 更新差分数组
            d[L]++;
            if (R + 1 <= n) {
                d[R + 1]--;
            }
        }

        // 计算每个商品的库存操作次数总和
        int[] sum = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            sum[i] = sum[i - 1] + d[i];
        }

        // 预处理前缀和数组，统计库存为 0 和 1 的商品数量
        int[] preZero = new int[n + 1]; // 前缀和数组，统计库存为 0 的商品数量
        int[] preOne = new int[n + 1];  // 前缀和数组，统计库存为 1 的商品数量
        for (int i = 1; i <= n; i++) {
            preZero[i] = preZero[i - 1];
            preOne[i] = preOne[i - 1];
            if (sum[i] == 0) {
                preZero[i]++;
            } else if (sum[i] == 1) {
                preOne[i]++;
            }
        }

        // 计算未进行任何撤回操作时库存为 0 的商品数量
        int zeroCount = preZero[n];

        // 处理每个操作
        for (int i = 0; i < m; i++) {
            int L = operate[i][0];
            int R = operate[i][1];

            // 计算区间内库存为 0 和 1 的商品数量
            int cntZero = preZero[R] - preZero[L - 1];
            int cntOne = preOne[R] - preOne[L - 1];

            // 计算结果
            int res = (zeroCount - cntZero) + cntOne;
            System.out.println(res);
        }
    }
}
