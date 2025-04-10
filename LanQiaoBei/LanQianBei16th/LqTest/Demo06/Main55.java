package LanQianBei16th.LqTest.Demo06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * 19713  拔河
 * @author QIA
 * @create 2025-03-25-20:46
 */
public class Main55 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // 存入每位同学的力量值
        long[] a = new long[n+1];
        for (int i = 1; i <= n; i++) {
            a[i]= sc.nextLong();
        }

        //
        ArrayList<Long> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            long count = a[i];
            for (int j = i+1; j <= n; j++) {
                count += a[j];
                list.add(count);
            }
        }

        // 对存储的列表进行升序排序
        Collections.sort(list);
        long result = Long.MAX_VALUE;
        for (int i = 1; i < list.size(); i++) {
            result = Math.min(result, (list.get(i) - list.get(i-1)));
        }
        System.out.println(result);
    }
}
