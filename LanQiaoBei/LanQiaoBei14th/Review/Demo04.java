package Contest_23.LanQiaoBei14th.Review;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

/**
 * StreamTokenizer使用详解
 *
 * @author QIA
 * @create 2023-03-16-18:53
 */
public class Demo04 {

    private void StreamTokenizer() {

        /**
        private StreamTokenizer() {

            // 将a-z的字符作为一个普通单词要素，即可以正常将这些字符解析
            wordChars('a', 'z');
            // 将A-Z的字符作为一个普通单词要素，即可以正常将这些字符解析
            wordChars('A', 'Z');
            // 将ASCII码表中160-255的字符作为一个普通单词要素，即可以正常将这些字符解析。一个单词(String)是通过多个单词要素(char)组成的
            wordChars(128 + 32, 255);

            // StreamTokenizer默认认为空白符就是分隔符
            // 将ASCII码表中0-' '的字符作为空白分隔符，因为StreamTokenizer默认认为空白符就是分隔符，所以这些字符也就变成了分隔符
            whitespaceChars(0, ' ');

            // 将/字符作为注解符，也就是说当一个token中包括/时，/后面的字符全部不再解析
            commentChar('/');

            // 指定 " 为分隔符
            quoteChar('"');
            // 指定 ' 为分隔符
            quoteChar('\'');

            //当stream tokenizer遭遇到一个单词为双精度的浮点数时，会把它当作一个数字，而不是一个单词。
            parseNumbers();
        }
         */
    }

    public static void main(String[] args) {


        StreamTokenizer st = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));

        // 普通用法
//        st.nextToken(); // 获取下一组标记  默认是按照空格分割的   回车，tab是结束符
        int i = (int) st.nval;

//        st.nextToken();
        double j = st.nval;

//        st.nextToken();
        String s = st.sval;

        // 多组输出
        int a, b;
//        while(st.nextToken() != StreamTokenizer.TT_EOF)  // 表示读到了文件末尾
//        {
//            a = (int)st.nval;
//            st.nextToken();
//            b = (int)st.nval;
//            //out.println(a + b);
//            System.out.println("a + b = "+(a+b));
//        }
        //out.flush();
    }
}
