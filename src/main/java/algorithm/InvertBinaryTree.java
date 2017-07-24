package algorithm;

import binarytree.TreeNode;

/**
 * Created by zhujia on 2017/7/24.
 */
public class InvertBinaryTree {
    public void invertBinaryTree(TreeNode root) {
        // write your code here
        if(root==null)return;
        TreeNode currentTreeNode;
        currentTreeNode = root.getRightChild();
        root.setRightChild(root.getLeftChild());
        root.setLeftChild(currentTreeNode);
        invertBinaryTree(root.getRightChild());
        invertBinaryTree(root.getLeftChild());
    }
}
