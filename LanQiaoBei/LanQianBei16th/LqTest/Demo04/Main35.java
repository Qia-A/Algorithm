package LanQianBei16th.LqTest.Demo04;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 862 聪明的猴子
 * @author QIA
 * @create 2025-03-19-12:31
 */
public class Main35 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int m=scan.nextInt();
        hz =new int [m];
        for (int i = 0; i < m; i++) {
            hz[i]=scan.nextInt();
        }
        int n=scan.nextInt();
        int [][] zb =new int [n][2];
        for (int i = 0; i < n ; i++) {
            zb[i][0]=scan.nextInt();
            zb[i][1]=scan.nextInt();
        }
        arr = new ArrayList<>();
        for (int i = 0; i <n; i++) {
            for (int j = i+1; j <n; j++) {
                double x=Math.sqrt(Math.pow(zb[i][0]-zb[j][0], 2)+Math.pow(zb[i][1]-zb[j][1], 2));
                arr.add(new jd(i,j,x));
            }
        }
        ksf(n,m);
    }

    public static int [] hz;
    public static ArrayList<jd> arr;
    public static void ksf(int n ,int m) {
        arr.sort((a,b)->Double.compare(a.w, b.w));
        bcj bcj1=new bcj(n);

        double max=0;
        for (jd i : arr) {
            int q1=i.q;
            int d1=i.d;
            double w1=i.w;

            int g_q1=bcj1.cx(q1);
            int g_d1=bcj1.cx(d1);

            if(g_q1!=g_d1) {
                bcj1.hb(g_q1, g_d1);
                max=Math.max(w1, max);
            }
        }
        int sum=0;
        for (int i = 0; i <m; i++) {
            if(hz[i]>=max) {
                sum++;
            }
        }
        System.out.println(sum);
    }
    public static class bcj {
        int [] bcj_sz;
        public bcj(int n) {
            bcj_sz=new int[n+1];
            for (int i = 0; i < bcj_sz.length; i++) {
                bcj_sz[i]=i;
            }
        }
        public int cx(int x) {
            if(x!=bcj_sz[x]) {
                bcj_sz[x]=cx(bcj_sz[x]);
            }
            return bcj_sz[x];
        }
        public void hb(int x1,int y1) {
            if(x1!=y1) {
                bcj_sz[x1]=y1;
            }
        }
    }

    public static class jd {
        int q;
        int d;
        double w;
        public jd(int q ,int d,double w) {
            this.q=q;
            this.d=d;
            this.w=w;
        }
    }
}