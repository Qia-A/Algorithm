package LanQianBei16th.LqTest.Demo08;

import java.util.Scanner;

/**
 * 模拟栈/模拟队列
 * @author QIA
 * @create 2025-04-09-11:33
 */
public class Main71 {

    /**
     * 模拟栈
     * @param args
     */
    public static void Test(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int top=0;
        int[] a =new int[m+10];
        for (int i = 1; i <= m; i++) {
            String t = sc.next();
            if (t.equals("push")) {
                int x = sc.nextInt();
                a[++top]=x;
            }else if (t.equals("pop")) {
                if (top == 0) continue;
                else top--;
            }else if (t.equals("empty")) {
                if (top==0) System.out.println("YES");
                else System.out.println("NO");
            }else {
                if (top==0) System.out.println("empty");
                else System.out.println(a[top]);
            }
        }
    }

    /**
     * 模拟队列
     * @param args
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr =new int[n+5];
        // rear表示尾，head表示头
        int rear=0,head = 0;
        for (int i = 1; i <= n; i++) {
            String t = s.next();
            if (t.equals("push")) {
                int x = s.nextInt();
                arr[rear++] = x;
                rear %= n;
            }else if (t.equals("pop")) {
                if (rear != head) {
                    head++;
                }
            }else if (t.equals("empty")) {
                if (rear == head) System.out.println("YES");
                else System.out.println("NO");
            }else {
                if (rear == head) System.out.println("empty");
                else System.out.println(arr[head]);
            }
        }
    }
}
