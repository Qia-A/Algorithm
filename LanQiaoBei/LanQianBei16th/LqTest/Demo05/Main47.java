package LanQianBei16th.LqTest.Demo05;

import java.util.*;

/**
 * 未来竞赛【算法赛】
 * 二分
 * @author QIA
 * @create 2025-03-22-18:56
 */
public class Main47 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int MOD = 1000000007;
        int N = sc.nextInt();  // 表示参赛者数量
        int D = sc.nextInt();  // 表示选取的距离要求
        int[] arr = new int[N];
        // 参赛者编号
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        HashMap<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            int country = arr[i];
            int computer = i+1;
            map.computeIfAbsent(country, k -> new ArrayList<>()).add(computer);
        }

        long total = 1;
        for (List<Integer> list : map.values()) {
            Collections.sort(list);
            int C = list.size();
            long ways = 1; // 选0的方式数目
            ways += C; // 选1的方式数目
            long pairs = 0;
            int right = 0;
            for (int i = 0; i < list.size(); i++) {
                while (right < list.size() && list.get(right) - list.get(i) <= D) {
                    right++;
                }
                pairs += (right - i - 1);
            }
            ways += pairs;
            total = (total * ways) % MOD;
        }

        total = (total - 1 + MOD) % MOD; // 防止负数
        System.out.println(total);
    }
}
