package algorithm;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by zhujia on 2017/7/31.
 */

/**
 * 给定一个整型数组，找出主元素，它在数组中的出现次数严格大于数组元素个数的二分之一。
 */
public class MajorityNumber {
    /**
     * 排序后返回中间值
     * @param nums
     * @return
     */
    /*public int majorityNumber(ArrayList<Integer> nums) {
        // write your code
        Collections.sort(nums);
        return nums.get(nums.size()/2);
    }*/

    /**
     *利用hashMap，记录元素的值，和出现的次数
     * @param nums
     * @return
     */
    public int majorityNumber(ArrayList<Integer> nums){
        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        int target=0;
        for (int num: nums) {
            if (!hashMap.containsKey(num))
                hashMap.put(num, 1);
            else
                hashMap.put(num, hashMap.get(num)+1);
            if (hashMap.get(num)>nums.size()/2) {
                target = num;
                break;
            }
        }
        return target;

    }

}
