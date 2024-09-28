package Competition.LuoGu.CZB;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Demo02 {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        int lenA = s1.nextInt();
        int lenB = s1.nextInt();
        long[] a = new long[lenA];
        long[] b = new long[lenB];
        List<Long> res = new ArrayList<>();
        long bit = 0;
        for (int i = 0 ; i < lenA ; i++) {
            a[i] = s1.nextInt();
        }
        for (int i = 0 ; i < lenB ; i++) {
            b[i] = s1.nextInt();
        }

        int maxLen , minLen;
        long[] max, min;
        if (lenA > lenB) {
            minLen = lenB;
            maxLen = lenA;
            max = a;
            min = b;
        } else {
            maxLen = lenB;
            minLen = lenA;
            min = a;
            max = b;
        }
        max = rev(max);
        min = rev(min);
        for (int i = 0 ; i < maxLen ; i++) {
            int radix = i + 2;
            long[] r;
            if (i >= minLen) {
                r = fun(radix, max[i] + bit, 0);
            } else {
                r = fun(radix, max[i] + bit, min[i]);
            }
            res.add(r[0]);
            bit = r[1];
        }

        for (int i = res.size() - 1 ; i >= 0 ; i--) {
            System.out.print(res.get(i) + " ");
        }

    }
    private static long[] fun(int radix , long a , long b) {
        long[] r = new long[2];
        if (a + b >= radix) {
            r[0] = (a + b) - radix;
            r[1] = 1;
        } else {
            r[0] = a + b;
        }
        return r;
    }
    private static long[] rev(long[] arr) {
        long[] res = new long[arr.length];
        for (int i = 0 ; i < arr.length ; i++) {
            res[i] = arr[arr.length - i - 1];
        }
        return res;
    }
}