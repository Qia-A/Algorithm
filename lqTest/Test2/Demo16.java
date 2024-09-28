package Competition.lanqiao.lqTest.Test2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

/**
 * @author QIA
 * @create 2023-03-23-17:10
 */
public class Demo16 {
    public static StreamTokenizer st=new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
    public static void main(String[] args) throws IOException {

        //dp[i][0]表示背包容量为i，不使用魔法得到的最大价值
        //dp[i][1]表示背包容量为i，使用魔法得到的最大价值
        int n = nextInt();
        int m = nextInt();
        int k = nextInt();
        int[] w = new int[n + 1];
        int[] v = new int[n + 1];
        int[][] dp = new int[m + 1][2];
        for (int i = 1; i <=n; i++) {
            w[i]=nextInt();
            v[i]=nextInt();
        }
        for (int i = 1; i <=n; i++) {       //先遍历物品
            for (int j = m; j >=w[i] ; j--) {   //再遍历背包，j是容积
                //如果能选且还没有使用魔法
                dp[j][0]=Math.max(dp[j-w[i]][0]+v[i],dp[j][0]); //不适用魔法，和01背包模板一样
                //已经使用过魔法了
                if(j>=w[i]+k){
                    //dp[j-w[i]][1]+v[i]表示之前的一个物品使用魔法
                    //dp[j-w[i]-k][0]+v[i]*2表示第i件物品这次使用魔法
                    dp[j][1]=Math.max(Math.max(dp[j][1],dp[j-w[i]][1]+v[i]), dp[j-w[i]-k][0]+v[i]*2);
                }
            }
        }
        //将用魔法和不用魔法的情况取最大值就行
        System.out.println(Math.max(dp[m][1],dp[m][0]));
    }
    public static int nextInt() throws IOException {
        st.nextToken();
        return (int)st.nval;
    }
}
