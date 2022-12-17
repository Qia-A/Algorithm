package LiKou.Sort;

/**
 * 排序
 * 力扣169.多数元素
 * 题目：给定一个大小为 n 的数组 nums ，返回其中的多数元素。多数元素是指在数组中出现次数 大于[n/2]的元素。
 * 备注：你可以假设数组是非空的，并且给定的数组总是存在多数元素。
 * https://leetcode.cn/problems/majority-element/
 *
 * @author QIA
 * @create 2022-11-11-0:14
 */
public class demo02 {
    public static int majorityElement(int[] nums) {
        //思路：摩尔投票法
        //假设第一个数过半数并设cnt=1；遍历后面的数如果相同，则cnt+1，不同则减一，
        //当cnt为0时则更换新的数字为候选数（成立前提，有出现次数大于n/2的数存在）
        int p = 0,q = 0;
        for (int i = 0; i < nums.length; i++) {
            if(q == 0){
                p = nums[i];
                q++;
            }else {
                if(p == nums[i]){
                    q++;
                }else{
                    q--;
                }
            }
        }
        return p;
    }

    public static void main(String[] args) {
        //测试用例
        int[] nums={2,2,1,1,1,2,2};
        System.out.println(majorityElement(nums));
    }
}
