package Contest_23.LiKou.Greed;

/**
 * @author QIA
 * @create 2022-11-10-18:10
 */
public class demo16 {
    //力扣1221  分割平衡字符串
    //https://leetcode.cn/problems/split-a-string-in-balanced-strings/submissions/
    public static int balancedStringSplit(String s) {
        int count = 0;//统计字符串的最大数量
        int a = 0;
        for(int i = 0;i < s.length();i++){
            char c = s.charAt(i);
            if(c == 'L'){
                a++;
            }else{
                a--;
            }
            if(a == 0){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String s = "RLRRLLRLRL";
        System.out.println(balancedStringSplit(s));
    }
}
