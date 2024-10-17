package Contest_23.LiKou.Arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 二分法，坚持循环不变量原则
 * 力扣59  螺旋矩阵||
 * https://leetcode.cn/problems/spiral-matrix-ii/
 * 给你一个正整数 n，生成一个包含 1 到 n2 所有元素，
 * 且元素按顺时针顺序螺旋排列的 nxn 正方形矩阵matrix。
 *
 * 输入：n = 3
 * 输出：[[1,2,3],[8,9,4],[7,6,5]]
 * @author QIA
 * @create 2022-12-25-22:56
 */
public class Demo21 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        System.out.println(Arrays.toString(generateMatrix(n)));
    }

    public static int[][] generateMatrix(int n){
        int loop = 0; // 控制循环次数
        int[][] res = new int[n][n];
        int start = 0; // 每次循环的开始点（start，start）
        int count = 1; // 定义填充数字
        int i,j;

        while (loop++ < n / 2) { // 判断边界后，loop从1开始
            //模拟上侧从左到右
            for (j = start; j < n - loop; j++) {
                res[start][j] = count++;
            }

            //模拟右侧从上到下
            for (i = start; i < n - loop; i++) {
                res[i][j] = count++;
            }

            //模拟下侧从右到左
            for (;j >= loop; j--) {
                res[i][j] = count++;
            }

            // 模拟左侧从下到上
            for (; i >= loop; i--) {
                res[i][j] = count++;
            }
            start++;
        }

        if (n % 2 == 1) {
            res[start][start] = count;
        }
        return res;
    }
}
