package Competition.lanqiao.LQB.校内模拟赛;

/**
 * @author QIA
 * @create 2023-03-11-16:09
 */
public class Main04 {
    public static void main(String[] args) {
        int[] nums = {99, 22, 51, 63, 72, 61, 20, 88, 40, 21, 63, 30, 11, 18, 99, 12, 93, 16, 7, 53, 64, 9, 28, 84, 34, 96, 52, 82, 51, 77};
        int count = 0;
        for (int i = 0; i < 30; i++) {
            for (int j = i+1; j < 30; j++) {
                if(nums[i]*nums[j] > 2022) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
