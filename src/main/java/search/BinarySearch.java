package search;

/**
 * Created by zhujia on 2017/7/16.
 */
//对于一个有序数组，我们通常采用二分查找的方式来定位某一元素，请编写二分查找的算法，在数组中查找指定元素。

public class BinarySearch {
    public int getPos(int[] A, int n, int val) {
        //给定一个整数数组A及它的大小n，同时给定要查找的元素val，请返回它在数组中的位置(从0开始)，若不存在该元素，返回-1。若该元素出现多次，请返回第一次出现的位置。
        //鲁棒性
        if(A==null || n<=0)return -1;
        int mid =0,left=0,right=n-1;
        while (left<right){
            mid=(left+right)/2;
            if(A[mid]>val)
                right=mid-1;
            else if(A[mid]<val)
                left=mid+1;
            else right=mid;

        }
        if(A[left]==val){
           return left;
        }
        return -1;
    }
}
