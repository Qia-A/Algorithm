package Contest_23.LanQiaoBei14th.Carl;

/**
 *
 * 求x的n次方  递归算法（时间复杂度）
 * @author QIA
 * @create 2022-12-19-22:54
 */
public class Demo01 {
    public static void main(String[] args) {
        int x = 5;
        int n = 500;

        System.out.println(function1(x, n));
        System.out.println(function2(x, n));
    }
    public static int function1(int x,int n){
        //O(n)
        if (n == 0){
            return 1;
        }
        return function1(x,n - 1) * x;
    }

    public static int function2(int x,int n){
        //O(logn)
        if (n == 0){
            return 1;
        }
        int t = function2(x,n / 2);
        if (n % 2 == 1){
            return t * t * x;
        }
        return t * t;
    }
}
