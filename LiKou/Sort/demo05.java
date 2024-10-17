package Contest_23.LiKou.Sort;

import java.util.Arrays;

/**
 * 计数排序
 * 力扣1122 数组的相对排序
 * https://leetcode.cn/problems/relative-sort-array/
 * 给你两个数组，arr1 和arr2，arr2中的元素各不相同，arr2 中的每个元素都出现在arr1中。
 * 对 arr1中的元素进行排序，使 arr1 中项的相对顺序和arr2中的相对顺序相同。
 * 未在arr2中出现过的元素需要按照升序放在arr1的末尾。
 *
 * @author QIA
 * @create 2022-11-12-14:38
 */
public class demo05 {

    public static int[] relativeSortArray(int[] arr1,int[] arr2) {
        int[] nums = new int[1001];
        int[] res = new int[arr1.length];
        int max = 0;
        //遍历arr1，统计每个元素的数量
        for (int i:arr1) {
            nums[i]++;
            max = Math.max(max,i); //每次都求max，获取arr1的最大值
        }
        //遍历arr2，处理arr2中出现的元素
        int index = 0;
        for (int i: arr2) {
            while(nums[i] > 0){
                res[index++] = i;
                nums[i]--;
            }
        }
        //遍历nums，处理剩下arr2中未出现的元素
        for (int i = 0; i <= max; i++) {
            while(nums[i] > 0){
                res[index++] = i;
                nums[i]--;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        //测试用例
        int[] arr1 = {28,6,22,8,44,17};
        int[] arr2 = {22,28,6,8,};
        System.out.println(Arrays.toString(relativeSortArray(arr1,arr2)));

    }
}
