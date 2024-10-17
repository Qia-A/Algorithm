package Contest_23.LiKou.Greed;

/**
 * 贪心算法
 *
 * @author QIA
 * @create 2022-11-09-2:23
 */
public class demo13 {
    //力扣605  种花问题
    //https://leetcode.cn/problems/can-place-flowers/
    public static boolean canPlaceFlowers(int[] flowerbed,int n){
        //如果花种完了，或者花床检查完了，就都停止遍历
        for (int i = 0,len = flowerbed.length; i < len && n > 0;) {
            if(flowerbed[i] == 1){
                //即当前i位置已经种植了的话，那么下一个可以种花的位置是 i+2，因为在flowerbed中不存在相邻的两朵花
                i += 2;
            } else if(i == flowerbed.length - 1 || flowerbed[i + 1] == 0){
                //两种可以种植花的位置
                //一、最后一个位置（i == flowerbed.length - 1）；
                //二、或者，为可种花的位置（i+2）紧邻其后的（i+2+1）的位置没有种植（flowebed[i+1] == 0）
                n--;
                //种植完后，同时可以找出下一个可以种植的位置
                i += 2;
            }else{
                //这种情况是flowerbed[i+2+1] = 1,所以下次循环就从这里开始判断其后可种植的位置
                i+=3;
            }
        }
        return n <= 0;
    }

    public static void main(String[] args) {
        int[] flowerbed = {1,0,0,0,0,1};
        int n = 2;
        System.out.println(canPlaceFlowers(flowerbed,n));
    }
}
