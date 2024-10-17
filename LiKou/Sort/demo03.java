package Contest_23.LiKou.Sort;

import java.util.HashSet;
import java.util.Set;

/**
 * 排序
 * 力扣349.两个数组的交集
 * 题目：给定两个数组nums1和nums2，返回它们的交集。输出结果中的每个元素一定是唯一的。我们可以不考虑输出结果的顺序 。
 * https://leetcode.cn/problems/intersection-of-two-arrays/
 *
 * @author QIA
 * @create 2022-11-11-2:29
 */
public class demo03 {
    public static int[] intersection(int[] nums1,int[] nums2){
        //思路：先对两个数组进行排序，
        //保证数组是有序的，则可以使用双指针的方法得到两个数组的交集
        //同时需要定义一个新的数组来记录交集的元素
        if (nums1 == null || nums1.length == 0 || nums2 == null || nums2.length == 0) {
            return new int[0];
        }
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> resSet = new HashSet<>();
        //遍历数组1
        for (int i : nums1) {
            set1.add(i);
        }
        //遍历数组2的过程中判断哈希表中是否存在该元素
        for (int i : nums2) {
            if (set1.contains(i)) {
                resSet.add(i);
            }
        }
        int[] resArr = new int[resSet.size()];
        int index = 0;
        //将结果几何转为数组
        for (int i : resSet) {
            resArr[index++] = i;
        }
        return resArr;
    }

    public static void main(String[] args) {
        //测试用例
        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};
        System.out.println(intersection(nums1,nums2));
    }
}
