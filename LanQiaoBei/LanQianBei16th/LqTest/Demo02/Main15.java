package LanQianBei16th.LqTest.Demo02;
import java.util.Arrays;
import java.util.Scanner;
/**
 * 表演队【算法赛】
 * @author QIA
 * @create 2025-03-08-19:57
 */

public class Main15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int[] A = new int[N];

        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }
        scanner.close();

        // 1. 排序
        Arrays.sort(A);

        // 前缀和数组，表示前i个元素的和
        long[] fixsum = new long[N + 1];
        // 前缀乘位置和数组，表示前i个元素乘以其下标的和
        long[] mulSum = new long[N + 1];
        for (int i = 0; i < N; i++) {
            fixsum[i + 1] = fixsum[i] + A[i];
            mulSum[i + 1] = mulSum[i] + (long) A[i] * i;
        }

        // 2. 计算最小差异值
        long minDifference = Long.MAX_VALUE;
        // 遍历所有可能的连续K个元素的窗口
        for (int i = 0; i <= N - K; i++) {
            int j = i + K - 1; // 窗口结束下标
            // 计算当前窗口的差异值
            long sumMul = mulSum[j + 1] - mulSum[i];
            long sum = fixsum[j + 1] - fixsum[i];
            long currentDiff = 2 * sumMul - (i + j) * sum;
            if (currentDiff < minDifference) {
                minDifference = currentDiff;
            }
        }

        // 输出最小差异值
        System.out.println(minDifference);
    }
}