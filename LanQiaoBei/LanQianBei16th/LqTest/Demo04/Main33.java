package LanQianBei16th.LqTest.Demo04;


import java.util.Scanner;

/**
 * 408 接水问题
 * @author QIA
 * @create 2025-03-19-12:31
 */
public class Main33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 定义人数、水龙头，每名同学的节水量
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] w = new int[n];
        for (int i = 0; i < n; i++) {
            w[i] = sc.nextInt();
        }
        sc.close();

        int t=m;  //索引，下一位同学的序号
        // 所有人都接上水了
        while (t < n){
            int min = 10000; // 求用时最少的水龙头
            int k = 0; // 索引，记录哪一号的水龙头
            // 遍历找到接水量最少的学生
            for (int i = 0; i < m; i++) {
                if (w[i] < min){
                    min = w[i];
                    k = i;
                }
            }
            // 接水量最少的同学，接完后由第n个人接上，直到所有人接完
            w[k] += w[t];
            t++;
        }

        // 求时间最久的水龙头,也就是最后一名同学接完的时间
        int max = 0;
        // 到这里，所有人已经接上水了，找到接水量最多的那人，他接完的时间就是所需时间
        for (int i = 0; i < m; i++) {
            if (w[i] > max) {
                max = w[i];
            }
        }
        System.out.println(max);
    }
}
