package LanQianBei16th.LqTest.Demo03;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 17.数位递增的数
 * @author QIA
 * @create 2025-03-10-0:14
 */
public class Main21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        sc.close();
        for (int i = 11; i <= n; i++) {
            // 将数字转换为一个个字符
            String before = Integer.toString(i);
            char[] c = before.toCharArray();
            // 进行排序
            Arrays.sort(c);
            String ans = "";
            // 将字符排序后再添加排列
            for (int j = 0; j < c.length; j++) {
                ans += c[j];
            }
            // 将原始数据和排序后的对比，不同的则不为递增数
            if (before.equals(ans)){
                count++;
            }
        }
        System.out.println(count);
    }
}
