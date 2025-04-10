package LanQianBei16th.LqTest.Demo02;

import java.util.*;
/**
 * 社区服务【算法赛】
 * @author QIA
 * @create 2025-03-08-19:12
 */

public class Main13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();
        scanner.close();

        // 记录S中所有可能的子串（限制最大长度为 5）
        HashSet<String> subStrings = new HashSet<>();
        int len = S.length();
        for (int i = 0; i < len; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = i; j < Math.min(i + 5, len); j++) {
                sb.append(S.charAt(j));
                subStrings.add(sb.toString());
            }
        }

        // BFS 找到最小的非子串
        Queue<String> queue = new LinkedList<>();
        queue.offer("");

        while (!queue.isEmpty()) {
            String current = queue.poll();
            for (char c = 'a'; c <= 'z'; c++) {
                String next = current + c;
                if (!subStrings.contains(next)) {
                    System.out.println(next);
                    return;
                }
                queue.offer(next); // 继续尝试更长的字符串
            }
        }
    }
}