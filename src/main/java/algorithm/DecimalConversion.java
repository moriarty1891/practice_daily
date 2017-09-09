package algorithm;

import java.util.Scanner;

/**写出一个程序，接受一个十六进制的数值字符串，输出该数值的十进制字符串。（多组同时输入 ）

 * Created by zhujia on 2017/8/6.
 */
public class DecimalConversion {
    public static int calculation (String num){
        //把16进制转换成10进制
        return Integer.valueOf(num.substring(2),16);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            System.out.println(calculation(scanner.next()));
        }
    }
}
