package LanQianBei16th.LqTest.Demo08;

import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * 实现堆排序
 * @author QIA
 * @create 2025-04-10-16:36
 */
public class Main79 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        PriorityQueue<Integer> queue = new PriorityQueue<>(); // 默认最小堆
        for (int i = 0; i < n; i++) {
            StringBuilder builder = new StringBuilder(sc.next());
            if (builder.toString().equals("push")) { // 加入
                int x = sc.nextInt();
                queue.add(x);
            }else if (builder.toString().equals("remove")) {
                if (queue.isEmpty()) {
                    System.out.println("empty");
                }else {
                    queue.poll();
                }
            } else if (builder.toString().equals("min")) {
                if (queue.isEmpty()) {
                    System.out.println("empty");
                }else {
                    System.out.println(queue.peek());
                }
            } else if (builder.toString().equals("print")) {
                int x = sc.nextInt();
                for (int k = 0; k < x-1; k++) {
                    System.out.print(queue.poll()+" ");
                }
                System.out.println(queue.poll());
            }

        }
    }
}
