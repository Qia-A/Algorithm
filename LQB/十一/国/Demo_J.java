package Competition.lanqiao.LQB.十一.国;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 国赛  试题J：答疑
 *
 *
 * @author QIA
 * @create 2023-03-13-17:23
 */
public class Demo_J {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[][] list = new long[N][4];  // 用第四个数来储存三个数之和
        long num = 0l; // num记录每个同学的发信息的时间
        long sum = 0l; // sum记录所有同学发的时间的总和
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 3; j++) {
                list[i][j] = sc.nextLong(); // 输入
                list[i][3] += list[i][j]; // 前三个数的和
            }
        }
        // 下面两个sort用于排序，由小到大排序
        // 可能会有几个同学所花的时间一样，所以先给收拾所花的时间排序
        Arrays.sort(list, (a,b)->(int)(a[2]-b[2]));
        // 这样第二个排序，时间相通的同学，收拾所花的时间长的会在后面，
        Arrays.sort(list, (a,b)->(int)(a[3]-b[3]));
        for (int i = 0; i < N; i++) {
            num += list[i][3]; // 每个同学的发信息时间
            sum += num-list[i][2]; // 同学发信息时间的总和
        }
        System.out.println(sum);
    }
}
