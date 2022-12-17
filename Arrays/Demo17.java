package LiKou.Arrays;

/**
 * 数组
 * 力扣766  托普利茨矩阵
 * https://leetcode.cn/problems/toeplitz-matrix/
 * 题目：
 * 给你一个m x n的矩阵matrix。如果这个矩阵是托普利茨矩阵，返回true；否则，返回false。
 * 如果矩阵上每一条由左上到右下的对角线上的元素都相同，那么这个矩阵是托普利茨矩阵。
 *
 * @author QIA
 * @create 2022-11-18-4:11
 */
public class Demo17 {
    public static boolean isToeplitzMatrix(int[][] matrix) {
        //遍历
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix[0].length; j++) {
                if(matrix[i][j] != matrix[i-1][j-1]){
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        //测试用例
        int[][] matrix = {{1,2,3,4},{5,1,2,3,},{9,5,1,2}};
        System.out.println(isToeplitzMatrix(matrix));
    }
}
