package Competition.lanqiao.lqTest.Test1;

import java.util.Scanner;

/**
 * 题目：从三角形的顶部到底部有很多条不同的路径。对于每条路径，把路径上面的数加起来可以得到一个和，你的任务就是找到最大的和。
 * 路径上的每一步只能从一个数走到下一层和它最近的左边的那个数或者右 边的那个数。
 * 此外，向左下走的次数与向右下走的次数相差不能超过 1。
 * 输入描述：输入的第一行包含一个整数 N\ (1 \leq N \leq 100)N (1≤N≤100)，表示三角形的行数。
 * 下面的 NN 行给出数字三角形。数字三角形上的数都是 0 至 100 之间的整数。
 * 输出描述：输出一个整数，表示答案
 * 输出输入样例：
 * 输入：
 * 5
 * 7
 * 3 8
 * 8 1 0
 * 2 7 4 4
 * 4 5 2 6 5
 * 输出：27
 * @author QIA
 * @create 2022-12-17-14:12
 */
public class Demo01 {
    private static int[][] arr;
    private static long max = Integer.MIN_VALUE;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt(); //三角形行数
        arr = new int[N][N];
        //录入数字三角形
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <= i; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        in.close();
        dfs(0,0,0,0,arr[0][0]);
        System.out.println(max);
    }
    /**
     * @param left 记录往左下走的次数
     * @param right 记录往右下走的次数
     * @param sum 递归过程中累计路径和
     */
    private static void dfs(int i, int j,int left, int right, int sum) {
        if(i+1 == arr.length || j+1 == arr[i].length) {
            if(Math.abs(left - right) <= 1) { //向左下走的次数与向右下走的次数相差不能超过 1
                max = max > sum ? max : sum;
            }
            return;
        }
        dfs(i+1, j, left+1, right, sum+arr[i+1][j]); //左下
        dfs(i+1, j+1, left, right+1, sum+arr[i+1][j+1]); //右下
    }
}
