package arrays;
/**
 * Created by zhujia on 2017/7/31.
 */

/**
 *
 * 给定一个整数数组，找到一个具有最大和的子数组，返回其最大和。

    注意事项

    子数组最少包含一个数
 样例
 给出数组[−2,2,−3,4,−1,2,1,−5,3]，符合要求的子数组为[4,−1,2,1]，其最大和为6
 */
public class MaxSubArray {
    /**
     * 该算法在每次元素累加和小于0时，从下一个元素重新开始累加
     * 如果当前得到的和是个负数，那么这个和在接下来的累加中应该抛弃并重新清零，不然的话这个负数将会减少接下来的和。
     * @param nums
     * @return
     */
    public int maxSubArray(int[] nums) {
        // write your code
        int currentSum=0;
        int maxSum=0;
        for (int i = 0; i <nums.length ; i++) {
            currentSum +=nums[i];   //累加
            if(currentSum>maxSum){
                maxSum=currentSum;  //更新maxSum
            }
            //如果累加和出现小于0的情况，
            //则和最大的子序列肯定不可能包含前面的元素，
            //这时将累加和置0，从下个元素重新开始累加
            if(currentSum<0){
                currentSum=0;
            }
        }
        if(maxSum==0){  //// 最大和依然为0，说明数组中所有元素都为负值
            maxSum=nums[0];
            for (int i:nums
                 ) {
                if (i>maxSum){
                    maxSum=i;
                }
            }
        }
        return maxSum;
    }
}
