package LanQianBei16th.LqTest.Demo01;

import java.util.Scanner;

/**
 * 101 拉马车
 * @author QIA
 * @create 2025-03-05-13:59
 */
public class Main09 {
    public static boolean isflagA = true;
    public static boolean isflagB = false;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 1.定义A,B,桌面的牌
        String a = sc.nextLine();
        String b = sc.nextLine();
        // A ,B, 桌面
        StringBuilder A = new StringBuilder(a);
        StringBuilder B = new StringBuilder(b);
        StringBuilder C = new StringBuilder();
        sc.close();
        while (true){
            // 判断是否继续出牌
            if (isflagA){
                play(A,C, true);
                // A手中牌为空时，则B赢，游戏结束
                if (A.length() == 0){
                    System.out.println(B);
                    break;
                }
            } else if (isflagB) {
                // B手中牌为空时，则A赢，游戏结束
                play(B,C,false);
                if (B.length() == 0){
                    System.out.println(A);
                    break;
                }
            }
        }
    }
    // 2.当你出的牌与桌面上有相同的牌，则将其之间的牌倒序收回到自己的牌堆，并继续出牌
    //当A,B其中一方手中为空时，则游戏结束，当游戏无法结束输出-1.

    // 出牌阶段
    public static void play(StringBuilder x, StringBuilder y, boolean isflag){
        if (x.length() == 0) return; // 判断手牌是否为空

        // 查找手牌中第一张，在牌堆里是否有相同的
        char front = x.charAt(0);
        int pos = y.indexOf(String.valueOf(front));

        // 当牌堆里不存在时，则下一个人出牌
        if (pos == -1){
            y.insert(0,front);
            isflagA = !isflag;
            isflagB = isflag;
        }else {
            // 当存在时，则将其包含在内的牌倒叙收回手牌里
            x.append(front);
            for (int i = 0; i <= pos; i++) {
                x.append(y.charAt(i));
            }
            // 去掉桌面上收回的牌
            y.delete(0,pos+1);
            // 收回后，继续出牌
            if (isflag){
                isflagA = true;
                isflagB = false;
            }else {
                isflagA = false;
                isflagB = true;
            }
        }
        x.deleteCharAt(0);
    }
}
