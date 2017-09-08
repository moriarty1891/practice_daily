package sort;

/**
 *
 * Created by zhujia on 2017/7/10.
 */
public class InsertionSort {
    /**
     * 插入排序。原地排序。
     * @param a
     */
    public void InsertionSort(int[] a) {
        int key,value;
        //设数组中第一个元素有序。
        for (int i = 1; i <a.length ; i++) {
            value=a[i];
            key=i;
            //挨个向后移1个
            while (a[key-1]>value&&key>=1){
                a[key]=a[key-1];
                key--;
            }
            //找到了合适的位置，塞进去。
            a[key]=value;
        }

    }


    public static void main(String[] args) {
        int [] a = {49,38,65,97,76,13,27,49,78,34,12,64,1} ;
        System.out.println("before  sort：");
        for (int i = 0; i <a.length ; i++) {
            System.out.print(a[i] +" ");
        }
            System.out.println();
        System.out.println("after sort：");
        for (int i = 0; i <a.length ; i++) {
            System.out.print(a[i] +" ");
        }
    }
}
