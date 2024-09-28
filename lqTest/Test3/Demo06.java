package Competition.lanqiao.lqTest.Test3;

import java.util.Arrays;

/**
 * 填空题 2020 国赛
 * 阶乘约数
 * @author QIA
 * @create 2023-04-02-12:01
 */
public class Demo06 {
    public static void main(String[] args) {
        int sum = 100;
        check(sum);
    }
    private static void check(int n)
    {
        int[] shuzu = new int[n+1];   //n+1表示为了在数组的索引中出现n

        Arrays.fill(shuzu, 0);

        //100的阶乘=1*2*3*4*...*100;
        for (int i = 2; i <= n; i++)    //对2到100的数进行处理
        {
            int a=i;    //用a代替i,下面的i值会发生改变
            for (int j = 2; j <=a; j++)    //分解i
            {
                while(a%j==0)
                {
                    shuzu[j]=shuzu[j]+1;
                    a=a/j;
                }

            }
        }

        long ans=1;
        for (int i = 2; i < shuzu.length; i++)
        {
            ans=ans*(shuzu[i]+1);
        }
        System.out.println(ans);
    }
}
