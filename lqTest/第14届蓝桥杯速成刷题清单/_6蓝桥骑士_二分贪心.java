package Competition.lanqiao.lqTest.第14届蓝桥杯速成刷题清单;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author QIA
 * @create 2023-04-04-14:41
 */
public class _6蓝桥骑士_二分贪心 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String[] s = in.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int[] N = new int[n + 10];
        int[] Two = new int[n + 10];
        s = in.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            N[i] = Integer.parseInt(s[i]);
        }

        int len = 0;
        // 二分插入
        for (int i = 0; i < n; i++) {
            int l = 0, r = len;
            while (l < r) {
                int mid = (r - l) / 2 + l + 1;
                if (Two[mid] >= N[i]) {
                    r = mid - 1;
                } else {
                    l = mid;
                }
            }
            // 是否增加 len,就看r是否右边界，
            len = Math.max(len, r + 1);
            Two[r + 1] = N[i];
        }
        System.out.println(len);
    }
}
