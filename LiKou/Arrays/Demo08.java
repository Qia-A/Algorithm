package Contest_23.LiKou.Arrays;

/**
 * 数组
 * 力扣704 二分查找
 * https://leetcode.cn/problems/binary-search/
 * 题目：
 * 给定一个n个元素有序的（升序）整型数组nums和一个目标值target，
 * 写一个函数搜索nums中的target，如果目标值存在返回下标，否则返回-1。
 * 输入: nums = [-1,0,3,5,9,12], target = 9
 * 输出: 4
 * 解释: 9 出现在 nums 中并且下标为 4
 *
 * @author QIA
 * @create 2022-11-16-15:18
 */
public class Demo08 {
    public static void main(String[] args) {
        //测试用例
        int[] nums = {-1,0,3,5,9,12};
        int target = 9;

        System.out.println(search(nums, target));
    }

    public static int search1(int[] nums,int target) {
        //for循环
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == target){
                return i;
            }
        }
        return -1;
    }

    public static int search(int nums[],int target) {
        //二分法查找
        int left = 0;
        int right = nums.length - 1;// 定义target在左闭右闭的区间里，[left,right]
        while (left <= right) { // 当left==right，区间[left,right]依然有效，所以用 <=
            int middle = left + ((right - left) / 2);//防止溢出，等同于(left + right)/2
            if (nums[middle] > target) {
                right = middle - 1; // target 在左区间，所以[left,middle - 1]
            } else if (nums[middle] < target) {
                left = middle + 1; // target 在右区间，所以[middle + 1,right]
            } else {
                return middle; // 数组找到目标值，直接返回下标
            }
        }
        //未找到目标值
        return -1;
    }
}
