package sort;

/**
 * Created by zhujia on 2017/9/6.
 * 归并排序。分治法。稳定。
 * 将输入序列分为两个部分并递归处理每个部分。
 * 当子问题解决后，算法将子问题的解合并。
 */
public class MergeSort {

    public void sort(int [] numbers ,int low ,int high ){
        int mid ;
        if (low<high){
            mid=(low+high)/2;
            //左边
            sort(numbers, low, mid);
            //右边
            sort(numbers, mid+1, high);
            //归并
            merge(numbers,low,mid+1,high);

        }
    }


    public void merge(int[] nums, int low, int mid, int high){
        //中间数组
        int[] temp = new int[high - low + 1];
        int i = low;// 左指针
        int j = mid + 1;// 右指针
        int k = 0;
        // 把左边剩余的数移入数组
        while (i <= mid) {
            temp[k++] = nums[i++];
        }

        // 把右边边剩余的数移入数组
        while (j <= high) {
            temp[k++] = nums[j++];
        }

        // 把新数组中的数覆盖nums数组
        for (int k2 = 0; k2 < temp.length; k2++) {
            nums[k2 + low] = temp[k2];
        }
    }

}
