package LanQianBei16th.LqTest.Demo02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 砍柴
 * @author QIA
 * @create 2025-03-09-15:00
 */

public class Main18 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //先打表列出所有的质数
        List<Integer> a=new ArrayList<>();//存2-100000之间的质数
        for (int i = 2; i <=100000; i++) {
            boolean isright=true;
            for (int j = 2; j*j <=i; j++) {
                if(i%j==0) {
                    isright =false;
                    break;
                }
            }
            if(isright) {
                a.add(i);
            }
        }
        //动态规划
        int dp[]=new int[100001];//当前状态先手赢为1否则为0
        dp[2]=1;
        for (int i = 2; i <=100000; i++) {
            for (int j = 0; j < a.size(); j++) {
                int x=i-a.get(j);//当次砍的长度
                if(x<0) {
                    //防止出现柴长度只有1砍了2的情况，也就是防止超砍情况
                    break;
                }
                if(dp[x]==0) {
                    //说明下一个人来砍必输，所有他赢了，后面就不用循环了，因为他们砍柴采用最优策略
                    dp[i]=1;
                    break;
                }
            }
        }
        int T=sc.nextInt();//测试的组数
        int []trr=new int[T];//值用来存输赢

        for (int i = 0; i < T; i++) {
            int t=sc.nextInt();
            trr[i]=dp[t]==1?1:0;//因为上面动态规划已经模拟了所有情况所以这里直接根据上面动态规划判断即可
        }
        for (int i = 0; i < T; i++) {
            System.out.println(trr[i]);
        }
    }
}