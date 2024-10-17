package Contest_23.LiKou.Enumerate;

/**
 * 枚举算法
 *
 * @author QIA
 * @create 2022-11-06-20:38
 */
public class demo07 {
    //力扣2309  兼具大小写的最好英文字母
    //https://leetcode.cn/problems/greatest-english-letter-in-upper-and-lower-case/
    public static String greatestLetter(String s){
        int[] arr = new int[26];
        String str = "";
        for (int i = 0; i < s.length(); i++) {
            if(Character.isLowerCase(s.charAt(i))){
                arr[s.charAt(i) - 'a']++;
            } else {
                arr[s.charAt(i) - 'A'] += 1000;
            }
        }
        for (int i = 25; i >= 0; i++) {
            if (arr[i] > 1000 && arr[i] % 1000 != 0) {
                str += (char) (i + 'A');
                break;
            }
        }
        return str;
    }

    public static void main(String[] args) {
        String s = "lEeTcOdE";
        System.out.println(greatestLetter(s));
    }
}
