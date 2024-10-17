package Contest_23.LiKou.Arrays;

import java.util.Arrays;

/**
 * 数组
 * 力扣75 颜色分类
 * https://leetcode.cn/problems/sort-colors/
 * 给定一个包含红色、白色和蓝色、共n个元素的数组nums，原地对它们进行排序，使得相同颜色的元素相邻，并按照红色、白色、蓝色顺序排列。
 * 我们使用整数0、1和2分别表示红色、白色和蓝色。
 * 必须在不使用库的sort函数的情况下解决这个问题。
 *
 * @author QIA
 * @create 2022-11-14-20:21
 */
public class Demo01 {
    public static int[] sortColors(int[] nums){
        //定义双指针
        int l = 0,r = nums.length - 1;
        for (int i = 0; i <= r; i++) {
            if(nums[i] == 0){
                if(i > 1){//i==1就没必要交换了
                    swap(nums,i,1);
                    l++;
                    i--;//交换后的节点也需要判断，而不是跳到下一个元素
                }
            }
            if (nums[i] == 2){
                if(i < r) {
                    swap(nums,i,r);
                    r--;
                    i--;
                }
            }
        }
        return nums;
    }
    //两数交换
    public static void swap(int[] nums,int i,int j){
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }

    public static void main(String[] args) {
        int[] nums = {2,0,2,1,1,0};
        System.out.println(Arrays.toString(sortColors(nums)));
    }
}
