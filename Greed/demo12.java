package LiKou.Greed;

/**
 * 贪心算法
 *
 * @author QIA
 * @create 2022-11-09-1:07
 */
public class demo12 {
    //力扣860  柠檬水找零
    //https://leetcode.cn/problems/lemonade-change/
    public static boolean lemonadeChange(int[] bills){
        //1、找零面额分为5元和10元或20元；当他们支付一个5元面额，找零金额可以直接递增；
        // 2、当支付10面额时无5元面额，则导致无法找零，就返回false，否则就五元面额递减，10元面额递增；
        //3、当支付面额大于10元时，只有20元；所以找零时直接5元面额减去一张，10元面额减去一张；
        // 当无10元面额时且5元面额大于3时，直接5元面额减去三张就行。反之就返回false；
        int five = 0,ten = 0;//定义找零面额
        for (int bill:bills) {
            if (bill == 5){
                five++;
            } else if(bill == 10){
                if(five == 0) {
                    return false;
                }
                five--;
                ten++;
            }else{
                if(five > 0 && ten > 0){
                    five--;
                    ten--;
                }else if(five >= 3){
                    five -= 3;
                }else{
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        //数组中是每位顾客的付款金额，每次只能购买一杯5美元的柠檬水
        int[] bills = {5,5,10,10,20};
        //初始金额为0，依次正确找零，返回true，反之 false
        System.out.println(lemonadeChange(bills));
    }
}
