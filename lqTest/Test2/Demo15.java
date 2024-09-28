package Competition.lanqiao.lqTest.Test2;

import java.util.Arrays;

/**
 * 2020 国赛  填空
 * 本质上升序列
 * @author QIA
 * @create 2023-03-23-17:09
 */
public class Demo15 {
    public static void main(String[] args) {
        String str = "tocyjkdzcieoiodfpbgcncsrjbhmugdnojjddhllnofawllbhf" +
                "iadgdcdjstemphmnjihecoapdjjrprrqnhgccevdarufmliqij" +
                "gihhfgdcmxvicfauachlifhafpdccfseflcdgjncadfclvfmad" +
                "vrnaaahahndsikzssoywakgnfjjaihtniptwoulxbaeqkqhfwl";
        int[] dp = new int[str.length()];
        Arrays.fill(dp, 1);
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < i; j++) {
                if (str.charAt(i) > str.charAt(j)) {
                    dp[i] += dp[j];
                } else if (str.charAt(i) == str.charAt(j)) {
                    dp[i] -= dp[j];
                }
            }
        }
        int count = 0;
        for (int i : dp) count += i;
        System.out.println(count);
    }
}
