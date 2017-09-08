package sort;

/**
 * 冒泡排序，时间复杂度：n^2 改进后最好情况时间复杂度：n
 * Created by zhujia on 2017/7/16.
 */
       /* 基本思想：
        对当前还未排好序的范围内的全部数，自上而下对相邻的俩个数依次进行比较和调整，让较大的数下沉，较小的数往上冒。
        即：每当俩相邻的数比较后发现他们的排序与排序的要求相反时，就将他们交换。
        每次遍历都可确定一个最大值放到待排数组的末尾，下次遍历，对该最大值以及它之后的元素不再排序（已经排好）。*/
public class BubbleSort {
    //改良的冒泡排序算法。传统的冒泡算法每次排序只确定了最大值，我们可以在每次循环之中进行正反两次冒泡，分别找到最大值和最小值，如此可使排序的轮数减少一半。
    public static void bubbleSort(int[] array) {
        int temp;
        int low = 0;
        int high = array.length - 1;
        while (low < high) {
            for (int i = low; i < high; i++) {  //正向冒泡，确定最大值
                if (array[i] > array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }

            } --high;
            for (int j = high; j > low; j--) {  //反向冒泡，确定最小值
                if (array[j] < array[j - 1]) {
                    temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }

            }
            ++low;
        }
        for (int i : array
                ) {
            System.out.print(i + " ");

        }

    }

    public static void main(String[] args) {
        int[] array = {1, 4, 6, 9, 0, 3, 6, 4, 2, 1, 11, 67, 45};

        bubbleSort(array);

    }
}