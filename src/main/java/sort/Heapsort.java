package sort;

public class Heapsort {
    /**
     * 小顶堆的插入操作。
     * 插入：新元素被加到表层，然后进行调整。
     * @param array 堆数组
     * @param current 插入节点的下标
     */
    public void minHeapFixup(int array[] ,int current){
        int father , temp;
        father=(current-1)/2;
        temp=array[current];
        while (father>=0&&current!=0){
            if(array[father]<=temp)break;
            array[current]=array[father];
            current=father;
            father=(current-1)/2;
        }
        array[current]=temp;
    }

    /**
     *
     * @param array 堆数组
     * @param n     插入节点的下标
     * @param nNum  插入节点的值
     */
    void MinHeapAddNumber(int array[], int n, int nNum)
    {
        array[n] = nNum;
        minHeapFixup(array, n);
    }

    /**
     * 删除：删除总是发生在根部。表中最后一个元素被用来填补空缺位置，然后调整。
     * @param array 堆数组
     * @param current   从current节点开始调整
     * @param sumNodesNum   节点总数
     */
    void minHeapFixdown(int array[], int current, int sumNodesNum){


    }


}
