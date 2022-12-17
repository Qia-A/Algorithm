package LiKou.DoublePointers;

/**
 * 双指针算法
 *
 * @author QIA
 * @create 2022-11-05-15:39
 */
public class demo02 {
    //力扣27  给你一个数组nums和一个值val，你需要原地移除所有数值等于val的元素，并返回移除后数组的新长度。
    public static int removeElement(int[] nums,int val){
        int slow = 0;//定义慢指针
        for (int fase = 0;fase < nums.length;fase++){
            if(nums[fase] != val) {
                nums[slow] = nums[fase];
                slow++;
            }
        }
        return slow + 1;
    }

    public static void main(String[] args) {
        int nums[] = {0,1,2,2,3,0,4,2,5};
        int val = 2;
        System.out.println(removeElement(nums,val));
    }
}
