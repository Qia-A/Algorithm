package LanQianBei16th.LqTest.Demo03;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author QIA
 * @create 2025-03-11-23:09
 */
public class Main25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 输入字符串，定义长度、字符、排序
        String str1 = sc.next();
        String str2 = sc.next();
        int l1 = str1.length();
        int l2 = str2.length();
        char[] c1 = str1.toCharArray();
        char[] c2 = str2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);

        // 判断二者字符串长度后，遍历字符串，用ASCLL表相减，不同则输出
        if (l1 < l2){
            for (int i = 0; i < l1; i++) {
                if (c1[i] - c2[i] != 0){
                    System.out.println(c2[i]);
                    return;
                }
            }
            System.out.println(c2[l2-1]);
        }else {
            for (int i = 0; i < l2; i++) {
                if (c1[i] - c2[i] != 0){
                    System.out.println(c1[i]);
                    return;
                }
            }
            System.out.println(c1[l1-1]);
        }
        sc.close();
    }
}
