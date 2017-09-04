package pc_test;



import java.util.HashMap;
import java.util.Scanner;

/**师想知道从某某同学当中，分数最高的是多少，现在请你编程模拟老师的询问。当然，老师有时候需要更新某位同学的成绩.
 输入描述:
 输入包括多组测试数据。
 每组输入第一行是两个正整数N和M（0 < N <= 30000,0 < M < 5000）,分别代表学生的数目和操作的数目。
 学生ID编号从1编到N。
 第二行包含N个整数，代表这N个学生的初始成绩，其中第i个数代表ID为i的学生的成绩
 接下来又M行，每一行有一个字符C（只取‘Q’或‘U’），和两个正整数A,B,当C为'Q'的时候, 表示这是一条询问操作，他询问ID从A到B（包括A,B）的学生当中，成绩最高的是多少
 当C为‘U’的时候，表示这是一条更新操作，要求把ID为A的学生的成绩更改为B。

 * Created by zhujia on 2017/8/6.
 */
public class QueryScore {

    public static void calculation(String c , int a ,int b,HashMap<Integer,Integer> hashMap ){
        if(c.equals("Q")){
            int maxScore=hashMap.get(a);
            if(b<a){int temp=a;a=b;b=temp;}
            for (int k=a; k<=b ; k++) {
                if (hashMap.get(k)>maxScore){
                    maxScore=hashMap.get(k);
                }
            }
            System.out.println(maxScore);
        }
        if(c.equals("U")){
            hashMap.put(a,b);
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            HashMap<Integer,Integer> hashMap = new HashMap<>();
            int studentNumber = scanner.nextInt();
            int operationNumber = scanner.nextInt();
            for (int j = 1; j <=studentNumber&&scanner.hasNext() ; j++) {
                hashMap.put(j,scanner.nextInt());
            }
            for (int i = 0; i <operationNumber&&scanner.hasNext() ; i++) {
                String c=scanner.next();
                int    a=scanner.nextInt();
                int    b=scanner.nextInt();
                calculation(c,a,b,hashMap);
            }
        }
    }
}
