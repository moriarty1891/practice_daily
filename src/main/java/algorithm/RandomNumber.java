package algorithm;

import java.util.*;

/**明明想在学校中请一些同学一起做一项问卷调查，为了实验的客观性，他先用计算机生成了N个1到1000之间的随机整数（N≤1000），对于其中重复的数字，只保留一个，把其余相同的数去掉，不同的数对应着不同的学生的学号。然后再把这些数从小到大排序，按照排好的顺序去找同学做调查。请你协助明明完成“去重”与“排序”的工作。

 * Created by zhujia on 2017/8/4.
 */
public class RandomNumber {
    public static ArrayList<Integer> calculation ( ArrayList<Integer> arrayList){
        ArrayList arrayList1 = new ArrayList();
        for (int i:arrayList
             ) {
            if(arrayList1.contains(i))continue;
            arrayList1.add(i);
        }
        return arrayList1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()){
            int i = scanner.nextInt();
            ArrayList arrayList = new ArrayList();
            for (int j = 0; j <i ; j++) {
                arrayList.add(scanner.nextInt());
            }
            ArrayList<Integer> arrayList1 = calculation(arrayList);
            Collections.sort(arrayList1);
            //System.out.println(Arrays.toString(arrayList1.toArray()));
            for (int j = 0; j <arrayList1.size() ; j++) {
                System.out.println(arrayList1.get(j));
            }
        }


    }
}
