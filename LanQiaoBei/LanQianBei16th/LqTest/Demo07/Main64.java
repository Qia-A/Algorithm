package LanQianBei16th.LqTest.Demo07;

import java.util.Scanner;

/**
 * 3670  大衣的元音字母
 * @author QIA
 * @create 2025-04-06-14:10
 */
public class Main64 {
    static int mod = 1000000007;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 字符串str，长度n，区间内元音字母个数k
        long n = sc.nextLong();
        long k = sc.nextLong();
        String str = sc.next();
        sc.close();

        solve(str,n,k);
    }

    public static void solve(String s,long n,long k){
        int count = 0;  // 用来统计字符串中的元音字母个数
        for (char str : s.toCharArray()) {
            if (str=='a' || str=='e' || str=='i' || str=='o' || str=='u'){
                count++;
            }
        }
        // 取余不为0，证明无法每个区间内元音字母个数都为k
        if (count % k != 0) {
            System.out.println(0);
        }else{
            // ans表示共计分割方法并对mod取余，len统计当前方法数
            long ans= 1;
            int len = 0;
            count = 0;
            for (char str : s.toCharArray()) {
                if (str=='a' || str=='e' || str=='i' || str=='o' || str=='u'){
                    count++;
                }
                if (count == k){
                    len++;
                }else if(count > k){
                    ans = (ans * len) % mod;
                    count = 1;
                    len = 0;
                    if (count == k) {
                        len++;
                    }
                }
            }
            System.out.println(ans);
        }
    }
}