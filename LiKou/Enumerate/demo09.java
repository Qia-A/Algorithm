package Contest_23.LiKou.Enumerate;

/**
 * 枚举算法
 *
 * @author QIA
 * @create 2022-11-07-23:03
 */
public class demo09 {
    //力扣2427 公因子的数目
    //https://leetcode.cn/problems/number-of-common-factors/
    public static int sommonFactors(int a,int b){
        int number = 0;
        for (int i = 1;i <= a;i++){
            if(a % i == 0){
                for(int j = 1;j <= b;j++){
                    if (b % j == 0){
                        if(i == j){
                            number++;
                        }
                    }
                }
            }
        }
        //返回a和b的公因子的数目
        return number;
    }

    public static void main(String[] args) {
        int a = 12,b = 6;
        System.out.println(sommonFactors(a,b));
    }
}
