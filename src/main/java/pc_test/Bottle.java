package pc_test;

import java.util.Scanner;

/**有这样一道智力题：“某商店规定：三个空汽水瓶可以换一瓶汽水。小张手上有十个空汽水瓶，她最多可以换多少瓶汽水喝？”答案是5瓶，方法如下：先用9个空瓶子换3瓶汽水，喝掉3瓶满的，喝完以后4个空瓶子，用3个再换一瓶，喝掉这瓶满的，这时候剩2个空瓶子。然后你让老板先借给你一瓶汽水，喝掉这瓶满的，喝完以后用3个空瓶子换一瓶满的还给老板。如果小张手上有n个空汽水瓶，最多可以换多少瓶汽水喝？

 * Created by zhujia on 2017/8/4.
 */
public class Bottle {
   public static int bottle (int num ){
       if (num<3)return 0;
       int sum =0;
       while (num>2){
           int  a = num/3;//3 1
           int  b = num%3;//1 1
           sum+=a;//3 4
           num = a+b;//4 2
       }
       if (num==2)return sum+1;
       else return sum;
   }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()){
            System.out.println(bottle(scanner.nextInt()));
        }
    }
}
