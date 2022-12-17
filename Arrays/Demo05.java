package LiKou.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 数组
 * 力扣448  找到所有数组中消失的数字
 * https://leetcode.cn/problems/find-all-numbers-disappeared-in-an-array/
 * 给你一个含n个整数的数组nums，其中nums[i]在区间[1,n]内。
 * 请你找出所有在[1,n]范围内但没有出现在nums中的数字，并以数组的形式返回结果。
 *
 * @author QIA
 * @create 2022-11-15-2:04
 */
public class Demo05 {
    //有问题
    public static List<Integer> findDisappearedNumbers(int[] nums){
        //存放数组中消失的数字
        int n = nums.length;
        List<Integer> arr = new ArrayList<>();
        //遍历数组，把值对应的下标加n，后续数组大于n的下标表示存在的值
        for (int num : nums) {
            //计算出下标，因为是取余，所以就算这个位置之前有加过n，取余之后也不会影响原来的值，
            int x = (num - 1) % n;
            //下标对应的值+1
            nums[num] += n;
        }
        //遍历数组，把没有出现过的数组添加到结果数组中
        for (int i = 0; i < n; i++) {
            // 因为存在的值都会加在对应数组下标上面加上n，所以肯定大于n
            if (nums[i] <= n) {
                arr.add(i + 1);
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        //测试用例
        int[] nums ={4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(nums));
    }
}
