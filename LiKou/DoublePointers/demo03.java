package Contest_23.LiKou.DoublePointers;

import java.util.Arrays;

/**
 * 双指针算法
 *
 * @author QIA
 * @create 2022-11-05-16:11
 */
public class demo03 {
    //力扣88. 合并两个有序数组https://leetcode.cn/problems/merge-sorted-array/
    public static void merge(int[] nums1, int m, int[] nums2, int n){
        for (int i = 0;i < n; ++i) {
            nums1[m + i] = nums2[i];
        }
        Arrays.sort(nums1);
    }

    public static void main(String[] args) {
        int nums1[]={1,2,3,0,0,0};
        int nums2[]={2,5,6};
        int m = 3,n = 2;
        merge(nums1,m,nums2,n);
        for (int i = 0; i < nums1.length; i++) {
            System.out.println(nums1[i]);
        }
    }
}
