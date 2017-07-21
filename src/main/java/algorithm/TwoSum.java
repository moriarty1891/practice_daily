package algorithm;

/**
 * Created by zhujia on 2017/7/21.
 */

/**
 * 给一个整数数组，找到两个数使得他们的和等于一个给定的数 target。

 你需要实现的函数twoSum需要返回这两个数的下标, 并且第一个下标小于第二个下标。注意这里下标的范围是 1 到 n，不是以 0 开头。
 */
public class TwoSum {
    public int[] twoSum(int[] numbers, int target) {
        for (int i = 0; i <numbers.length ; i++) {
            for (int j = 0 ; j < numbers.length;j++){
                if(i!=j){
                    if(numbers[i]+numbers[j]==target){
                        int[] array = {i+1,j+1};
                        return array;
                    }
                }
            }
        }
        return null;
    }
}
