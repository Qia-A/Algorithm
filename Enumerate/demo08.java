package LiKou.Enumerate;
/**
 * 枚举算法
 *
 * @author QIA
 * @create 2022-11-07-17:50
 */
public class demo08 {
    //力扣2259 移除指定数字得到的最大结果
    //https://leetcode.cn/problems/remove-digit-from-number-to-maximize-result/
    public static String rempveDigit(String[] number,char digit) {
//        int len = number.length();
//        int index = 0;
//        for(int i = 0;i < len;i++){
//            if(number.charAt(i) == digit){
//                //如果当前digit小于它之后的数，则直接删除当前digit
//                if(i + 1 < len && number.charAt(i + 1) > digit){
//                    index = i;
//                    break;
//                }
//                //记录当前digit的位置
//                index = i;
//            }
//        }
//        //如果digit的当前位置为字符串最后一个，则直接删除最后一个，反之则删除它再两边拼接
//        if(index == len -1){
//            return number.substring(0,index);
//        }else{
//            return number.substring(0,index) + number.substring(index + 1);
//        }
        return null;
    }

    public static void main(String[] args) {
        String[] number = {"1231"};
        char digit = 1;
        System.out.println(rempveDigit(number,digit));
    }

}
