package algorithm;

import java.util.HashMap;
import java.util.Set;

/**
 * Created by 24323 on 2017/7/21.
 */
public class SingleNumber {
    /**
     * 给出2*n + 1 个的数字，除其中一个数字之外其他每个数字均出现两次，找到这个数字。
     * @param A
     * @return
     */
    public int singleNumber1(int[] A) {
        // Write your code here
        if(A.length==0){
            return 0;
        }
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for ( int i = 0;i< A.length ; i++) {
            if (hashMap.containsKey(A[i])){
                hashMap.remove(A[i]);
            }else{ hashMap.put(A[i],1);}
        }
           Object[]array =  hashMap.keySet().toArray();
        return (Integer) array[0];
    }
    public int singleNumber2(int[] A) {
        if (null == A || A.length == 0) {
            return 0;
        }
        int n = A[0];
        for(int i = 1; i < A.length; i++) {
            n = n ^ A[i];//出现两次的数异或后为0，只剩出现一次的数。

        }
        return n;
    }
}
