package Competition.lanqiao.lqTest.第14届蓝桥杯速成刷题清单;

import java.util.Scanner;

/**
 * 并查集
 * 思路：
 * 因为需要判新两个学生是否为朋友，可以考虑使用并查集来解决。
 * 并查集是一种树型的数据结构，用于外理一些不相交集合的合并及查询问题。
 * 常常在使用中以森林来表示。具体实现过程:
 * 1. 初始化，每个节点的父亲都是它本身
 * 2. 按顺序处理操作，若是连接操作，则将两个学生所在的集合合并，即将一个集合的根节点的父亲指向
 * 另一个集合的根节点，若两个学生已经在同一集合中，则无票进行合并。
 * 3. 若是查询操作，则判断两个学生所在的集合的根节点是否相同，若相同则输出 YES，否则输出 NO。
 * 在代码实现过程中，可以使用一个数组记录每个节点的父亲节点，使用一个函数 find_parent 来查找节点的根节点，
 * 使用另一个函数 union set 来合并两人节点所在的集合。
 * 在处理连接操作时，需要先查找两人节点的根节点，然后判断它们是否在一个集合中，
 * 若不在，则将其中一个集合的根节点的父亲指向另一个集合的根节点。
 * 时间复杂度为 O(Ma(N))，其中 a(N)表示反阿克曼函数，为 log*N 的增长量级，可以看作常数级别。
 *
 * @author QIA
 * @create 2023-04-03-1:11
 */
public class _4蓝桥幼儿园 {
    static int[] parent; // 记录节点的父亲节点
    static int[] rank; // 记录节点所在连通块的大小

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 节点数
        int m = sc.nextInt(); // 操作数
        parent = new int[n+1];
        rank = new int[n+1];
        for (int i = 1; i <= n; i++) {
            parent[i] = i; // 初始化每个节点的父亲为自己
            rank[i] = 1; // 初始化每个节点所在连通块大小为1
        }
        for (int i = 0; i < m; i++) {
            int op = sc.nextInt(); // 操作类型
            int x = sc.nextInt();
            int y = sc.nextInt();
            if (op == 1) {
                union(x,y); // 合并x，y所在的连通块
            } else {
                if (find(x) == find(y)) { // 判断x，y是否在统一连通块中
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
    }

    // 查找节点x所在连通块的根节点
    public static int find(int x) {
        if (x != parent[x]) {
            parent[x] = find(parent[x]); // 压缩路径
        }
        return parent[x];
    }

    // 合并节点 x,y 所在的连通块
    public static void union(int x, int y) {
        int rootX = find(x);
        int rootY = find(y);
        if (rootX != rootY) {
            if (rank[rootX] > rank[rootY]) {
                if (rank[rootX] > rank[rootY]) {
                    parent[rootX] = rootX;
                    rank[rootX] += rank[rootY];
                } else {
                    parent[rootX] = rootY;
                    rank[rootY] += rank[rootX];
                }
            }
        }
    }
}
