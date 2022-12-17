package LiKou.Greed;

import java.util.Arrays;

/**
 * 贪心算法
 * 力扣1005  K 次取反后最大化的数组和
 * https://leetcode.cn/problems/maximize-sum-of-array-after-k-negations/
 * 给你一个整数数组 nums 和一个整数 k ，按以下方法修改该数组：
 *      选择某个下标i并将nums[i]替换为-nums[i]。
 * 重复这个过程恰好k次。可以多次选择同一个下标 i 。
 * 以这种方式修改数组后，返回数组可能的最大和。
 *
 * @author QIA
 * @create 2022-11-22-11:58
 */
public class Demo04 {
    public static int largestSum(int[] nums,int k){
        //将数组按照绝对值大小从大到小排序，注意要按照绝对值的大小
        //先排序
        Arrays.sort(nums);
        int i=0,ans=0,n=nums.length;
        //给数组中的负数从小到大取反
        while(k>0&&i<n&&nums[i]<0) {
            nums[i]=-nums[i++];
            k--;
        }
        //k=0的话，数组已经达到取反最大数组和
        //k>0，说明nums已经全是非负数，剩余取反只要反复操作最小数即可，且次数为奇数才会发生变化
        if(k>0&&k%2==1){
            //i==0说明nums原本就是非负数，最小数为nums[i]
            //0<i<n，说明数组中原先就有非负数，此时最小数为nums[i]和最后一个取反的负数nums[i-1]的较小数
            //i=n,，说明数组原先全为负数，取反后最小数为最后一个取反负数，即nums[i-1]
            if(i==0||(i<n&&nums[i-1]>nums[i])) nums[i]=-nums[i];
            else nums[i-1]=-nums[i-1];
        }
        //求和
        for(int num:nums) ans+=num;
        return ans;
    }

    public static void main(String[] args) {
        //测试用例
        int[] nums = {-3,-1,0,2};
        int k = 1;
        System.out.println(largestSum(nums, k));
    }
}
