package Competition.lanqiao.lqTest.Test3;

/**
 * @author QIA
 * @create 2023-03-27-13:15
 */
public class Demo04 {

    static int function1(int x, int n) {
        if (n == 0) {
            return 1; // return 1 同样是因为0次方是等于1的
        }
        return function1(x, n -1) * x;
    }

    public static void main(String[] args) {
        int x = 5;
        int n = 2;

        System.out.println(function1(x,n));
    }
}
