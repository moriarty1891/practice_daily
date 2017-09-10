package arrays;

/**
 * Created by zhujia on 2017/9/10.
 */
public class Find2DimensionalArray {
    /**
     * 题目：在一个二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
     * 请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
     * 思路：矩阵是有序的，从左下角来看，向上数字递减，向右数字递增，
     * 因此从左下角开始查找，当要查找数字比左下角数字大时。右移
     * 要查找数字比左下角数字小时，上移
     *
     * @param target
     * @param array
     * @return
     */
    public boolean Find(int target, int[][] array) {
        //行标
        int len = array.length - 1;
        //第i列
        int i = 0;
        while ((len >= 0) && (i < array[0].length)) {
            if (array[len][i] > target) {
                len--;
            } else if (array[len][i] < target) {
                i++;
            } else return true;

        }
        return false;

    }
}
