package LiKou.Arrays;

/**
 * 数组
 * 力扣704 二分查找
 * https://leetcode.cn/problems/binary-search/
 * 题目：
 * 给定一个n个元素有序的（升序）整型数组nums和一个目标值target，
 * 写一个函数搜索nums中的target，如果目标值存在返回下标，否则返回-1。
 *
 * @author QIA
 * @create 2022-11-16-15:18
 */
public class Demo08 {
    public static int search(int[] nums,int target) {
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        //测试用例
        int[] nums = {-1,0,3,5,9,12};
        int target = 9;
        System.out.println(search(nums, target));
    }
}
