package sort;

/**
 * Created by zhujia on 2017/7/18.
 */
//快速排序
   /* 该方法的基本思想是：

            1．先从数列中取出一个数作为基准数。

            2．分区过程，将比这个数大的数全放到它的右边，小于或等于它的数全放到它的左边。

            3．再对左右区间重复第二步，直到各区间只有一个数。*/
public class QuickSort {

    public static int partition(int []array,int low,int high){
        int key = array[low];
        while (low<high){
            // 从右向左找小于key的数填到坑里
            while (array[high] >= key && low < high){
                high--;
                //进去循环之后要一直保证i小于j才能有意义，最外面的while条件只在进入循环体时进行判断。
            }if(low<high){
                //将array[high]填到array[low]中，array[high]就形成了一个新的坑
                array[low]=array[high];
                low++;
            }
            // 从左向右找大于key的数填到坑里
            while (array[low] < key && low < high){
                low++;
            }if(low<high){
                array[high]=array[low];
                high--;
            }
        }
        //退出时，low等于high。将key填到这个坑中。
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
        int []array={1,5,7,6,9,8,2,6,4,1,0,3,6,4,7,98,1,77,88,99,44,1};
        //调用的时候要注意，最后一个参数为数组最后一个元素的下标，而不是数组长度！！！！
        sort(array,0,array.length-1);
        for (int i :array
             ) {
            System.out.print(i+" ");
        }
    }
}
