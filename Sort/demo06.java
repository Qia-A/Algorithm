package LiKou.Sort;

import java.util.Arrays;

/**
 * 排序
 * 力扣888  公平的糖果交换
 * https://leetcode.cn/problems/fair-candy-swap/
 *    爱丽丝和鲍勃拥有不同总数量的糖果。给你两个数组aliceSizes和bobSizes，
 * aliceSizes[i]是爱丽丝拥有的第i盒糖果中的糖果数量，bobSizes[j]是鲍勃拥有的第j盒糖果中的糖果数量。
 *    两人想要互相交换一盒糖果，这样在交换之后，他们就可以拥有相同总数量的糖果。一个人拥有的糖果总数量是他们每盒糖果数量的总和。
 *    返回一个整数数组answer，其中answer[0]是爱丽丝必须交换的糖果盒中的糖果的数目，
 * answer[1]是鲍勃必须交换的糖果盒中的糖果的数目。如果存在多个答案，你可以返回其中任何一个。题目测试用例保证存在与输入对应的答案。
 *
 *
 * @author QIA
 * @create 2022-11-12-17:48
 */
public class demo06 {

    public static int[] fairCandySwap(int[] aliceSizes,int[] bobSizes){
        //思路：先对两人手中的糖果进行统计，再根据每盒中的糖果数量进行排序
        //定义两个人的糖果的相差数量
        //进行遍历，判断找出双方需要交换的糖果数量

        int[] ans = new int[2];//需要交换糖果的数目。[0]对应爱丽丝；[1]对应鲍勃。
        int sumA = 0,sumB = 0;//统计每个人有多少颗糖果
        for(int i:aliceSizes){
            sumA += i;
        }
        for(int j:bobSizes){
            sumB += j;
        }
        //对两个人每盒糖果进行排序
        Arrays.sort(aliceSizes);
        Arrays.sort(bobSizes);
        //temp统计爱丽丝和鲍勃相差多少颗糖果
        int temp = sumA-(sumA + sumB)/2;
        int i = 0,j = 0;
        //遍历每盒糖果，判断有无一盒糖果等于相差值，即可直接交换。
        while(i < aliceSizes.length && j<bobSizes.length){
            if(aliceSizes[i] - bobSizes[j] == temp){
                ans[0] = aliceSizes[i];
                ans[1] = bobSizes[j];
                break;
            }else if(aliceSizes[i] - bobSizes[j] > temp) {
                j++;
            }else if(aliceSizes[i] - bobSizes[j] < temp){
                i++;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        //测试用例
        int[] aliceSizes = {1,2,5};
        int[] bobSizes = {2,4};
        System.out.println(Arrays.toString(fairCandySwap(aliceSizes,bobSizes)));
    }
}
