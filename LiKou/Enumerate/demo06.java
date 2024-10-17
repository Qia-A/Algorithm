package Contest_23.LiKou.Enumerate;

/**
 * 枚举算法
 *
 * @author QIA
 * @create 2022-11-06-17:00
 */
public class demo06 {
    //力扣1925 统计平方和三元组的数目
    //https://leetcode.cn/problems/count-square-sum-triples/
    public static int countTriples(int n){
        int res = 0;//定义计算满足平方和三元数组的数目
        for (int a = 1; a <= n;a++){
            for(int b = 1; b <= n;b++){
                int cs = a*a + b*b;
                int c = (int)Math.sqrt(cs);
                if(c <= n && c*c == cs){
                    res++;
                }
            }
        }
        return res;
    }


    public static void main(String[] args) {
        int n = 10;
        System.out.println(countTriples(n));
    }

}
