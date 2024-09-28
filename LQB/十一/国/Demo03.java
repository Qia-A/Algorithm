package Competition.lanqiao.LQB.十一.国;

/**
 * 国赛 试题C 扩散
 * 题目：小蓝在一张无限大的特殊画布上作画。
 *      这张画布可以看成一个方格图，每个格子可以用一个二维的整数坐标表示。
 *      小蓝在画布上首先点了一下几个点: (0,0),(2020,11),(11,14),(2000,2000)。
 *      只有这几个格子上有黑色，其它位置都是白色的。每过一分钟，黑色就会扩散一点。具体的，如果一个格子里面是黑色，它就会扩散到上、下、左、右四个相邻的格子中，使得这四个格子也变成黑色(如果原来就是黑色，则还是黑色)。
 *      请问，经过 2020 分钟后，画布上有多少个格子是黑色的。
 *
 * @author QIA
 * @create 2023-03-13-15:18
 */
public class Demo03 {
    public static void main(String[] args) {
        int count = 0;
        // 先假设已经过去了2020分钟，所有的点已经铺好
        // 在 x 轴
        for (int x = -2020; x < 2020+2021; x++) {
            // 在y轴
            for (int y = -2020; y < 2020+2001; y++) {
                if(judge(x,y)) {
                    count++;
                }
            }
        }
        System.out.println(count);

    }

    public static boolean judge(int x, int y) {

        // 找到x， y的关系，计算出长度，相对的
        // 以四个点为起点，判断每个铺好的点是以那个原始点为起点的
        // 一个点可能有多个起点，但计算一次，优先级就是 if 语句的顺序
        if ((Math.abs(x-0) + Math.abs(y)) <= 2020) {
            return true;
        } else if ((Math.abs(x-2020) + Math.abs(y-11)) <= 2020) {
            return true;
        } else if ((Math.abs(x-11)+Math.abs(y-14)) <= 2020) {
            return true;
        } else if ((Math.abs(x-2000)+Math.abs(y-2000)) <= 2020) {
            return true;
        }
        return false;
    }
}
