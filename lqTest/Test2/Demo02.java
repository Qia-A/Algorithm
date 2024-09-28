package Competition.lanqiao.lqTest.Test2;

import java.util.Scanner;

/**
 * 2017 省赛 分巧克力
 *
 * @author QIA
 * @create 2023-03-19-23:58
 */
public class Demo02 {
    public static int arr[][],n;
    public static long check(int k){
        long ans=0;
        for(int i=0;i<n;i++){
            ans+=(arr[i][0]/k)*(arr[i][1]/k);
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int k=sc.nextInt();
        arr=new int [n][2];
        for(int i=0;i<n;i++){
            arr[i][0]=sc.nextInt();
            arr[i][1]=sc.nextInt();
        }
        int bit[]=new int[20];
        bit[0]=1;
        for(int i=1;i<20;i++){
            bit[i]=bit[i-1]*2;
        }
        int ans=bit[19];
        int p=18;
        long a=check(ans),b=check(ans+1);
        while(!(a>=k&&b<k)){
            if(a>=k&&b>=k){
                ans+=bit[p];
            }else if(a<k&&b<k){
                ans-=bit[p];
            }
            p--;
            a=check(ans);
            b=check(ans+1);
        }
        System.out.println(ans);
    }
}
