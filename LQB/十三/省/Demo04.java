package Competition.lanqiao.LQB.十三.省;

import java.io.*;
import java.util.*;

/**
 * 十三届  试题F：选数异或
 * 问题描述：给定一个长度为n的数列A1,A2··Am和一个非负整数x,给定m次查询,
 * 每次问能否从某个区间 [l,r] 中选择两个数使得他们的异或等于 x。
 * 输入格式:
 *    输入的第一行包含三个整数n,m,t。
 *    第二行包含n个整数A1，A2，··，An。
 *    接下来m行，每行包含两个整数lr表示询问区间,?。
 * 输出格式:
 *    对于每个询问,如果该区间内存在两个数的异或为2则输出yes,否则输出no。
 * [样例输入]
 * 441
 * 1 2 3 4
 * 14
 * 1 2
 * 2 3
 * 3 3
 * [样例输出]
 * yes
 * no
 * yes
 * no
 * [评测用例规模与约定]
 * 对于 20% 的评测用例，1≤ n,m < 100;
 * 对于 40% 的评测用例，1 ≤ n,m s 1000;
 * 对于所有评测用例，1 < n,m < 100000 ，x < 22 ，1lrin，0 < A; < 220
 *
 * @author QIA
 * @create 2023-03-08-16:14
 */

public class Demo04 {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        StreamTokenizer st = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
        st.nextToken();
        int n=(int)st.nval;
        st.nextToken();
        int m=(int)st.nval;
        st.nextToken();
        int x=(int)st.nval;
        Map map = new HashMap<Integer, Integer>();
        int[] dp=new int[200000];
        for(int i=1;i<=n;i++){
            st.nextToken();
            int tmp=(int)st.nval;
            dp[i]=Math.max(dp[i-1],(int) map.getOrDefault(tmp^x,Integer.MIN_VALUE));
            map.put(tmp, i);
        }
        for(int i=0;i<m;i++){
            st.nextToken();
            int l=(int)st.nval;st.nextToken();
            int r=(int)st.nval;
            if(dp[r]>=l) System.out.println("yes");
            else System.out.println("no");
        }
    }
}