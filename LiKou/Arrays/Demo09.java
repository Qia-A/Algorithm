package Contest_23.LiKou.Arrays;

/**
 * 数组
 * 力扣575 分糖果
 * https://leetcode.cn/problems/distribute-candies/
 * Alice 有 n 枚糖，其中第 i 枚糖的类型为 candyType[i] 。Alice 注意到她的体重正在增长，所以前去拜访了一位医生。
 * 医生建议 Alice 要少摄入糖分，只吃掉她所有糖的 n / 2 即可（n 是一个偶数）。Alice非常喜欢这些糖，她想要在遵循医生建议的情况下，尽可能吃到最多不同种类的糖。
 * 给你一个长度为n的整数数组candyType，返回：Alice在仅吃掉n/2枚糖的情况下，可以吃到糖的【最多】种类数。
 *
 * @author QIA
 * @create 2022-11-16-16:26
 */
public class Demo09 {
    public static int distributeCandies(int[] candyType) {
        //只能吃掉一半的糖
        int count = 0;
        for (int i = 0; i < candyType.length; i++) {

        }
        return 0;
    }

    public static void main(String[] args) {
        //测试用例
        int[] candyType = {1,1,2,2,3,3};
        System.out.println(distributeCandies(candyType));
    }
}
