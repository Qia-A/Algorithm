package Contest_23.LiKou.Arrays;

/**
 * 数组、双指针
 * 力扣11 盛最多水的容器
 * https://leetcode.cn/problems/container-with-most-water/
 * 题目：
 * 给定一个长度为n的整数数组height。有n条垂线，第i条线的两个端点是(i, 0)和(i, height[i])。
 * 找出其中的两条线，使得它们与x轴共同构成的容器可以容纳最多的水。
 * 返回容器可以储存的最大水量。
 * 说明：你不能倾斜容器。
 *
 * @author QIA
 * @create 2022-11-15-1:13
 */
public class Demo04 {
    public static int maxArea(int[] height){
        //双指针思路：首先定义最大面积，双指针i，j遍历heigth数组,较小值进行移动。计算面积，同时用Math.max(x,y)取最大值
        int max = 0;
        //定义双指针，遍历数组，较小值进行移动
        for (int i = 0,j = height.length-1; i < j;) {
            //计算面积
            int area = (j - i) * Math.min(height[i],height[j]);
            //取最大值
            max = Math.max(max,area);
            //较小值移动
            if(height[i] < height[j]){
                i++;
            }else{
                j--;
            }
        }
        //返回面积最大值
        return max;
    }

    public static void main(String[] args) {
        //测试用例
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
    }
}
