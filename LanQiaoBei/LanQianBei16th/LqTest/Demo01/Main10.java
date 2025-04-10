package LanQianBei16th.LqTest.Demo01;

import java.util.*;

/**
 * 111 区间移位
 * @author QIA
 * @create 2025-03-05-15:48
 */
public class Main10 {
    private static int[][] intervals;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        intervals = new int[n][2];
        for (int i = 0; i < n; ++i) {
            // 将区间长度翻倍，结果除2
            intervals[i][0] = 2*sc.nextInt();
            intervals[i][1] = 2*sc.nextInt();
        }
        sc.close();
        // 将二维数组进行升序排列
        Arrays.sort(intervals, Comparator.comparingInt(i -> i[1]));

        int left = 0, right = (int)2e4;
        while (left < right){ // 二分查找，左闭右开
            int mid = (left + right) >> 1;
            if (check(mid)) right = mid;
            else left = mid + 1;
        }
        // 不是整数，输出带小数
        if (right % 2 == 0) System.out.println(right/2);
        else System.out.println((double)right/2);
    }

    private static boolean check(int shift){
        int cover = 0;
        List<int[]> temp = new ArrayList<>(Arrays.asList(intervals)); // 逐个遍历，并排除掉合格的区间
        while (true) {
            boolean qualified = false;
            for (int i = 0; i < temp.size(); ++i) {
                int[] interval = temp.get(i);
                if (interval[0] - shift <= cover /* 此时的cover可以理解为前一个区间的覆盖范围，这里检测的是向左移动能不能够到前面的 */ && interval[1] + shift >= cover /* 区间最右点达到的位置不超过区间的最大右偏移量 */) {
                    qualified = true;
                    int len = interval[1] - interval[0];
                    if (interval[0] + shift >= cover) cover += len; // 如果当前区间左移后超过前面区间的覆盖范围，那么此次移动，覆盖范围最多只能增加当前区间本身的长度，否则不连续
                    else cover = interval[1] + shift; // 若不能超过，覆盖范围最多是当前区间末端+位移量
                    temp.remove(i);
                    break; // 删除后立刻到下一个循环，以免Concurrent Modification Exception（贪心循环外面套一个while true的原因）
                }
            }
            if (!qualified || cover >= 2e4) break;
        }
        return cover >= 2e4;
    }
}
