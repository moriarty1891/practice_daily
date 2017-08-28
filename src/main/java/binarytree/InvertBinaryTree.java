package binarytree;

import binarytree.TreeNode;

import java.util.Stack;

/**
 * Created by zhujia on 2017/7/24.
 */
public class InvertBinaryTree {
    /**
     * 翻转二叉树（递归实现）
     * @param root
     */
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
    /**
     * 翻转二叉树(非递归实现)
     * @param root 二叉树的根
     * @return
     */
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return root;
        }
        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.peek();
            stack.pop();
            if (node.getLeftChild() != null) {
                stack.push(node.getLeftChild());
            }
            if (node.getRightChild() != null) {
                stack.push(node.getRightChild());
            }
            TreeNode temp;
            temp = root.getRightChild();
            root.setRightChild(root.getLeftChild());
            root.setLeftChild(temp);
        }
        return root;
    }
}
