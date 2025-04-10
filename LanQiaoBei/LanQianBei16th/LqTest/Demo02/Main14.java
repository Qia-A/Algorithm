package LanQianBei16th.LqTest.Demo02;

import java.util.Scanner;

/**
 * 妇女唇膏【算法赛】
 * @author QIA
 * @create 2025-03-08-19:57
 */
public class Main14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String S = scanner.next();
        scanner.close();

        int[] distances = new int[n];
        int lastOne = -1;

        // 从左向右扫描，计算距离最近的左边的 `1`
        for (int i = 0; i < n; i++) {
            if (S.charAt(i) == '1') {
                lastOne = i;
            } else if (lastOne != -1) {
                distances[i] = i - lastOne;
            } else {
                distances[i] = Integer.MAX_VALUE; // 先赋个大值，等会再取最小
            }
        }

        // 从右向左扫描，计算距离最近的右边的 `1`
        lastOne = -1;
        for (int i = n - 1; i >= 0; i--) {
            if (S.charAt(i) == '1') {
                lastOne = i;
            } else if (lastOne != -1) {
                distances[i] = Math.min(distances[i], lastOne - i);
            } else if (distances[i] == Integer.MAX_VALUE) {
                distances[i] = -1; // 左右都没 `1`
            }
        }

        // 只输出 `0` 的位置对应的距离
        boolean first = true;
        for (int i = 0; i < n; i++) {
            if (S.charAt(i) == '0') {
                if (!first) System.out.print(" ");
                System.out.print(distances[i]);
                first = false;
            }
        }
    }
}
