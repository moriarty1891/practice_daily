package binarytree;

/**
 * Created by zhujia on 2017/7/24.
 */

/**
 * 检查两棵二叉树是否等价。等价的意思是说，首先两棵二叉树必须拥有相同的结构，并且每个对应位置上的节点上的数都相等。
 */
public class IsIdentical {
    /**
     *
     * @param a
     * @param b
     * @return
     */
    public boolean isIdentical(TreeNode a, TreeNode b) {
        // Write your code here
        //递归出口
        if(a==null&&b==null)return true;
        if((a==null&&b!=null)||(a!=null&&b==null))return false;
        //递归调用
        if(a.getData()==b.getData())
            return isIdentical(a.getLeftChild(),b.getLeftChild()) && isIdentical(a.getRightChild(),b.getRightChild());
        return false;
    }
}
