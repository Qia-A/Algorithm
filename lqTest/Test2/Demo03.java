package Competition.lanqiao.lqTest.Test2;

import java.util.Scanner;

/**
 *
 * 刷题集训B 2018 省赛
 * 递增三元组
 * @author QIA
 * @create 2023-03-20-13:25
 */
public class Demo03 {
    public static void main(String[] args) {

        // 暴力解法
        Scanner sc = new Scanner(System.in);
        // 输入
        int n = sc.nextInt();
        int[] A = new int[n];
        int[] B = new int[n];
        int[] C = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            B[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            C[i] = sc.nextInt();
        }

        int count = 0;
        //暴力遍历
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    if (A[i] < B[j] && B[j] < C[k]) {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
