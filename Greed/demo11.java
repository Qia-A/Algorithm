package LiKou.Greed;

import java.util.Arrays;

/**
 * 贪心算法
 *
 * @author QIA
 * @create 2022-11-08-23:38
 */
public class demo11 {
    //力扣455  分发饼干
    //https://leetcode.cn/problems/assign-cookies/
    public static int findContentChildren(int[] a,int[] s){
        //先对两个数组进行排序
        Arrays.sort(a);
        Arrays.sort(s);
        int count = 0;//满足小孩子的计数

        //从数组最大值开始遍历
        for (int i = a.length - 1,j = s.length - 1;i >= 0 && j >= 0;){
            //饼干大于小孩胃口，即分配饼干，满足小孩+1，a和s数组同时下标-1
            if(s[j] >= a[i]){
                count++;
                j--;
                i--;
                //饼干小于小孩子胃口，胃口数组a下标-1
            }else{
                i--;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        //第一个数组代表小孩子的数量及胃口值，第二个数组代表饼干的数量及尺寸
        int[] g = {1,2};
        int[] s = {1,2,3};
        System.out.println(findContentChildren(g,s));
    }
}
