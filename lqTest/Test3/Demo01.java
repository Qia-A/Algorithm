package Competition.lanqiao.lqTest.Test3;

import java.util.Scanner;

/**
 * 贪心  字符串  2021  模拟赛
 * 删除字符
 * @author QIA
 * @create 2023-03-27-8:24
 */
public class Demo01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 接收字符串
        String s = sc.nextLine();
        // 删除字符长度
        int size = sc.nextInt();
        // 将接收的字符串转换为整型数组
        int[] ch = new int[s.length()];
        // 用于存储删除后的元素数组
        int[] arr = new int[s.length() - size];

        int count = 0;
        int a = 0, flag = a;
        for (int i = 0; i < s.length(); i++) {
            ch[i] = s.charAt(i) - 'A';
        }
        while (size > 0) {
            flag = a;
            for (int i = a; i <= flag + size; i++) {
                if (ch[a] > ch[i]) {
                    a = i;
                }
            }
            size -= (a-flag);
            arr[count++] = ch[a];
            a++;
        }
        for (int i = a; i < ch.length; i++) {
            arr[count++] = ch[i];
        }
        // 遍历并输出，不用换行
        for (int j : arr) {
            System.out.print((char) (j + 'A'));
        }
        sc.close();
    }
}
