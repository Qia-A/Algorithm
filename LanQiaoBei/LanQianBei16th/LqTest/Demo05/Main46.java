package LanQianBei16th.LqTest.Demo05;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 拳头对决【算法赛】
 * @author QIA
 * @create 2025-03-22-18:56
 */
public class Main46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = (int)1e5+10;
        int n = sc.nextInt();
        int[] a = new int[N];
        int[] b = new int[N];
        for (int i = 1; i <= n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 1; i <= n; i++) {
            b[i] = sc.nextInt();
        }
        sc.close();

        // 对数组a从索引1到n的部分进行排序
        Arrays.sort(a,1,n+1);
        long ret = 0;
        // 遍历数组
        for (int i = 1; i <= n; i++) {
            // 初始化左右指针和答案
            int l = i,r = n, ans = n+1;
            // 使用二分查找找到第一个大于b[i]的元素位置
            while(l <= r) {
                // 计算中间位置，相当于（l+r）/2
                int mid = l+r >> 1;
                if (a[mid] > b[i]){
                    // 如果中间元素大于b[i],更新答案为中间位置
                    ans = mid;
                    // 将右指针移到中间位置左边，继续查找是否有更小满足条件的
                    r = mid - 1;
                }else {
                    // 如果中间元素不大于b[i],将左指针移到中间位置右边
                    l = mid+1;
                }
            }
            // 累加满足元素之和
            ret += n-ans+1;
        }
        System.out.println(ret);
    }
}
//    // 树状数组（Binary Indexed Tree）
//    static class BIT {
//        int[] tree;
//        int n;
//        public BIT(int n) {
//            this.n = n;
//            tree = new int[n+1];
//        }
//        // 在位置 i 增加 delta，i 从 1 开始
//        void update(int i, int delta) {
//            while (i <= n) {
//                tree[i] += delta;
//                i += i & -i;
//            }
//        }
//        // 查询前缀和 [1, i]
//        int query(int i) {
//            int sum = 0;
//            while (i > 0) {
//                sum += tree[i];
//                i -= i & -i;
//            }
//            return sum;
//        }
//    }
//
//    public static void main(String[] args) throws IOException {
//        // 使用 BufferedReader 提高输入效率
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int N = Integer.parseInt(st.nextToken());
//        // 读取蓝队拳头大小 A
//        int[] A = new int[N];
//        // 读取红队拳头大小 B
//        int[] B = new int[N];
//
//        st = new StringTokenizer(br.readLine());
//        for (int i = 0; i < N; i++) {
//            A[i] = Integer.parseInt(st.nextToken());
//        }
//        st = new StringTokenizer(br.readLine());
//        for (int i = 0; i < N; i++) {
//            B[i] = Integer.parseInt(st.nextToken());
//        }
//
//        // 复制 A 数组用于排序（蓝队使用）
//        int[] sortedA = A.clone();
//        Arrays.sort(sortedA);
//
//        // 离散化：需要将红队 B 和蓝队 A 的值一起离散化
//        int[] allValues = new int[2 * N];
//        for (int i = 0; i < N; i++) {
//            allValues[i] = B[i];
//            allValues[i + N] = A[i];
//        }
//        Arrays.sort(allValues);
//        // 去重并建立映射 value -> rank (1-indexed)
//        int m = 0;
//        int[] unique = new int[2 * N];
//        unique[m++] = allValues[0];
//        for (int i = 1; i < allValues.length; i++) {
//            if (allValues[i] != allValues[i-1]) {
//                unique[m++] = allValues[i];
//            }
//        }
//        // 使用 HashMap 记录映射关系
//        HashMap<Integer, Integer> rankMap = new HashMap<>();
//        for (int i = 0; i < m; i++) {
//            rankMap.put(unique[i], i + 1); // rank 从 1 开始
//        }
//
//        // 构造 BIT，用于统计红队中各拳头的出现次数（按离散化后的 rank）
//        BIT bit = new BIT(m);
//
//        long ans = 0;
//        // 注意：红队的出场顺序是固定，即 B[0], B[1], ..., B[N-1]
//        // 我们令第 i 轮使用蓝队中第 i 个最小拳头，也就是 sortedA[i]
//        // 每轮先更新当前红队成员 B[i]，然后用蓝队员 sortedA[i]获得胜利数
//        for (int i = 0; i < N; i++) {
//            // 红队第 i 轮出场，更新 BIT
//            int rankB = rankMap.get(B[i]);
//            bit.update(rankB, 1);
//            // 蓝队在第 i 轮出场的队员拳头大小为 sortedA[i]
//            int rankA = rankMap.get(sortedA[i]);
//            // 查询 BIT 中小于 sortedA[i] 的红队成员个数
//            int wins = bit.query(rankA - 1);
//            ans += wins;
//        }
//
//        System.out.println(ans);
//    }