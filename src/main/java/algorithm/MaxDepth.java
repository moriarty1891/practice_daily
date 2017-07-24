package algorithm;

/**
 * Created by 24323 on 2017/7/24.
 */

import binarytree.TreeNode;

/**
 * 给定一个二叉树，找出其最大深度。

 二叉树的深度为根节点到最远叶子节点的距离。
 */
public class MaxDepth {
    public int maxDepth(TreeNode root) {
        // write your code here
        if (root==null)return 0;
        int left =1;
        int right =1;
        left += maxDepth(root.getLeftChild());
        right+= maxDepth(root.getRightChild());
        return left>right?left:right;
    }
}
