package Competition.lanqiao.LQB.校内模拟赛;

/**
 * @author QIA
 * @create 2023-03-11-15:09
 */
public class Main02 {
    public static void main(String[] args) {
        int num = 2022 - 26 - 676;
        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < 26; j++) {
                for (int k = 0; k < 26; k++) {
                    num--;
                    if(num == 0) {
                        System.out.println((char)('A' + i)+""+(char)('A' + j)+""+(char)('A' + k));
                        break;
                    }
                }
            }
        }
    }
}
