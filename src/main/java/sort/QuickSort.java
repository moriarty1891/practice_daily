package sort;

/**
 * Created by zhujia on 2017/7/18.
 */
//快速排序
public class QuickSort {

    public static int partition(int []array,int low,int high){
        int key = array[low];
        while (low<high){
            while (array[high] > key && low < high){
                high--;
            }if(low<high){
                array[low]=array[high];
                low++;
            }

            while (array[low] < key && low < high){
                low++;
            }if(low<high){
                array[high]=array[low];
                high--;
            }
        }
        array[low]=key;
        return high;
    }

    public static void sort(int[] array,int low ,int high){
        if(low>=high){
            return ;
        }
        int index=partition(array,low,high);
        sort(array,low,index-1);
        sort(array,index+1,high);

    }

    public static void main(String[] args) {
        int []array={1,5,7,6,9,8,2,6,4,1,0,3,6,4,7,98,1,77,88,99,44,11};
        sort(array,0,21);
        for (int i :array
             ) {
            System.out.print(i+" ");
        }
    }
}
