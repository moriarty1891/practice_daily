package sort;

/**
 * 选择排序，是一种原地排序算法，时间复杂度n^2
 * 步骤：寻找最小值。用当前位置的值交换最小值
 * Created by zhujia on 2017/9/6.
 */
public class SelectionSort {
    public void selectionSort(int [] a){
        int min , temp ;
        for (int i = 0; i <a.length-1 ; i++) {
            min = i ;
            for (int j = i+1; j <a.length-1 ; j++) {
                if (a[j]<a[min]){
                    min=j;
                    temp=i;
                    i=j;
                    j=temp;
                }
            }
        }
    }
}
