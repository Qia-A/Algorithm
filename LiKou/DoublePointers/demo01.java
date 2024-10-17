package Contest_23.LiKou.DoublePointers;

/**
 * 双指针算法
 *
 * @author QIA
 * @create 2022-11-05-14:38
 */
public class demo01 {
    //力扣26  删除升序排列数组中的重复项
    public static int retur(int[] nums){
        int p = 0,q = 1;
        for(;q < nums.length;){
            if(nums[p] != nums[q]){
                nums[p + 1] = nums[q];
                p++;
            }
            q++;
        }
        return p + 1;
    }

    public static void main(String[] args) {
        int nums[] = {1,1,2};
        System.out.println(retur(nums));
    }
}
