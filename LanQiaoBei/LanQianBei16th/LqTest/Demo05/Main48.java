package LanQianBei16th.LqTest.Demo05;

import java.util.Scanner;

/**
 * 备份比赛数据【算法赛】
 * @author QIA
 * @create 2025-03-22-18:56
 */
public class Main48 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();   // 电脑数量
        int T = sc.nextInt();   // 最多允许的天数
        int[] A = new int[N];   // 每台电脑的备份时间
        int[] B = new int[N];   // 每台电脑备份后等待时间

        // 最大的单个备份时间
        int maxA = 0;
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
            if (A[i] > maxA) {
                maxA = A[i];
            }
        }
        for (int i = 0; i < N; i++) {
            B[i] = sc.nextInt();
        }
        sc.close();

        // 每天工作时间 M 的下界为 maxA（至少能完成最耗时备份），上界为3600
        int left = maxA, right = 3600, ans = -1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (canFinish(mid, N, T, A, B)) {
                ans = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        System.out.println(ans);
    }

    // 模拟：以每天工作时间 M 是否能在 T 天内完成所有备份任务
    static boolean canFinish(int M, int N, int T, int[] A, int[] B) {
        int days = 1;
        int currentTime = 0;  // 当前天已占用的时间

        // 安排第一台电脑的备份
        currentTime = A[0];

        // 对后续每台电脑依次安排
        for (int i = 1; i < N; i++) {
            // 先安排等待时间（等待时间可以跨天）
            int waiting = B[i - 1];
            while (waiting > 0) {
                int remaining = M - currentTime;
                if (remaining >= waiting) {
                    currentTime += waiting;
                    waiting = 0;
                } else {
                    waiting -= remaining;
                    days++;
                    currentTime = 0;
                    if (days > T) return false;
                }
            }

            // 再安排备份 A[i]（必须在一天内连续完成）
            if (currentTime + A[i] <= M) {
                currentTime += A[i];
            } else {
                days++;
                currentTime = A[i];
                if (days > T) return false;
            }
        }
        return days <= T;
    }
}
