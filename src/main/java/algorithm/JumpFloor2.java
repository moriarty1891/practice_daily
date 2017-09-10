package algorithm;

/**
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
 * Created by zhujia on 2017/9/10.
 */
public class JumpFloor2 {
    /**
     * 每个台阶都有跳与不跳两种情况（除了最后一个台阶），最后一个台阶必须跳。所以共用2^(n-1)中情况
     * @param target
     * @return
     */
    public int JumpFloorII(int target) {
        if (target <= 0) return 0;
        return (int) Math.pow(2, target - 1);
    }
}
