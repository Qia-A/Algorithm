package Competition.lanqiao.LQB.校内模拟赛;

import java.util.ArrayList;
import java.util.List;

/**
 * @author QIA
 * @create 2023-03-11-14:26
 */
public class Main01 {
    public static void main(String[] args) {
        int x = 2023;
        while(true) {
            if(getNum(x)){
                System.out.println(x);
                return;
            }
            x++;
        }
    }

    public static boolean getNum(int x){
        List<Integer> list = new ArrayList<>();
        while (x > 0) {
            int tmp = x % 16;
            list.add(tmp);
            x /= 16;
        }
        for (int t : list) {
            if (t < 10) return false;
        }
        return true;
    }
}
