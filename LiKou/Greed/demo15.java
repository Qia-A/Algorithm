package Contest_23.LiKou.Greed;

/**
 * 贪心算法
 *
 * @author QIA
 * @create 2022-11-10-11:03
 */
public class demo15 {
    //力扣1217  玩筹码
    //https://leetcode.cn/problems/minimum-cost-to-move-chips-to-the-same-position/
    public static int minCostToMoveChips(int[] position){
        int even = 0;//单数位
        int add = 0;//双数位
        for (int i = 0; i < position.length; i++) {
            if((position[i] % 2) != 0){
                even++;
            }else{
                add++;
            }
        }
        return Math.min(even,add);
    }

    public static void main(String[] args) {
        int[] position={2,2,2,3,5,6};
        System.out.println(minCostToMoveChips(position));
    }
}
