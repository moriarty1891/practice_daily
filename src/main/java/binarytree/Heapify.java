package binarytree;

/**
 * 堆化数组，递归解决。
 * 最小堆中，要堆化一个元素，需要找到他的孩子节点中的最小值，然后将它与当前节点交换。重复该过程知道所有都满足。
 * 在堆化过程中由于是自顶向下的，这个过程又叫做向下渗透。
 * 给一个数组建立小顶堆。
 */
public class Heapify {
    public void heapify(int[] A) {
        //叶子结点总是满足堆的性质的，叶子结点总是在数组最后面。因此要建堆，只要堆化非叶子结点即可。
        //如何找到第一个非叶子结点呢？堆的最后一个节点处于a.length-1的位置，最后元素的父节点就是第一个非叶子节点。

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
