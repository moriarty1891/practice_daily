package sort;

/**
 * Created by zhujia on 2017/7/10.
 */
public class InsertionSort {
    public static void main(String[] args) {
        int [] a = {49,38,65,97,76,13,27,49,78,34,12,64,1} ;
        System.out.println("before  sort：");
        for (int i = 0; i <a.length ; i++) {
            System.out.print(a[i] +" ");
        }

        //假设后面的序列是有序的，每次从剩余数组中取出最后一个，插入到有序数组的合适位置
        for (int i = 1; i <a.length ; i++) {
            int temp = a[i];
            int j;
                for(j=i-1;j>=0;j--){
                    if(a[j] > temp ){
                         a[j+1] = a[j];
                }   else break;

            }
            a[j+1] = temp;
        }




        System.out.println();
        System.out.println("after sort：");
        for (int i = 0; i <a.length ; i++) {
            System.out.print(a[i] +" ");
        }
    }
}
