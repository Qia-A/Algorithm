package Contest_23.LiKou.List;

import java.util.Scanner;

/**
 * 约瑟夫问题
 * 题目：n个人围成一个圈，从第一个人开始报数，数到m的人出列，再由下一个人重新从1开始报数，数到m的人再出圈，依次类推，直到所有的人都出圈，请输出依次出圈人的编号。
 * 输入格式：输入两个整数：n,m
 * 输出格式：输出一行n个整数，按顺序输出每个出圈人的编号。
 * 样例输入：10 3
 * 样例输出：3 6 9 2 7 1 8 5 10 4
 *
 * @author QIA
 * @create 2022-12-29-0:14
 */
public class 约瑟夫环 {
    public static void main(String[] args) {
        class Node{
            int x;
            Node next;
            Node perv;
            public Node(int x){this.x = x;}
        }
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(), m = s.nextInt();

        Node head = new Node(-1);
        Node cur = head;
        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                head.x = i;
            } else {
                Node n1 = new Node(i);
                head.next = n1;
                n1.perv = head;
                head = head.next;
            }
        }
        head.next = cur;
        cur.perv = head;
        while (n > 1) {
            for (int i = 1; i < m; i++) {
                cur = cur.next;
            }
            System.out.print(cur.x + " ");
            cur = cur.perv;
            cur.next = cur.next.next;
            cur = cur.next;
            cur.perv = cur.perv.perv;
            n--;
        }
        System.out.println(cur.x);
    }
}
