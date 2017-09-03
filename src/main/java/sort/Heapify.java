package sort;

/**
 * 堆化数组，递归解决。
 * 给一个数组建立小顶堆。
 */
public class Heapify {
    public void heapify(int[] A) {

        for (int i = (A.length - 1) / 2; i >= 0; i--)
            heapify(A, i);
    }


    public void heapify(int[] A, int i) {
        //左孩子
        int l = 2 * i + 1;
        //右孩子
        int r = 2 * i + 2;
        //设根节点是最小的
        int smallest = i;
        //如果左孩子小于根，左孩子就是最小的
        if (l < A.length && A[l] < A[smallest])
            smallest = l;
        //如果右孩子小于最小的，右孩子就是最小的
        if (r < A.length && A[r] < A[smallest])
            smallest = r;
        //如果最小值不是根，需要移动元素
        if (smallest != i) {
            //交换最小的和根
            int tmp = A[i];
            A[i] = A[smallest];
            A[smallest] = tmp;
            //把原来的根当成根进行递归
            heapify(A, smallest);
        }
    }
}
