package binarytree;

/**
 * Created by zhujia on 2017/7/20.
 */

/**
 * 二叉树递归遍历（前中后序）
 */
public class RecursiveTraversal {
    /**
     * 前序遍历-根-左-右
     * @param treeNode
     */
    public void preOrderTraversal(TreeNode treeNode){
        if(treeNode==null)return;
        System.out.print(treeNode.getData()+"，");
        preOrderTraversal(treeNode.getLeftChild());
        preOrderTraversal(treeNode.getRightChild());
    }

    /**
     * 中序遍历-左-根-右
     * @param treeNode
     */
    public void  inOrderTraversal(TreeNode treeNode){
        if(treeNode==null)return;
        preOrderTraversal(treeNode.getLeftChild());
        System.out.print(treeNode.getData()+"，");
        preOrderTraversal(treeNode.getRightChild());

    }

    /**
     * 后序遍历-左-右-根
     * @param treeNode
     */
    public void afterOrderTraversal(TreeNode treeNode){
        if(treeNode==null)return;
        preOrderTraversal(treeNode.getLeftChild());
        preOrderTraversal(treeNode.getRightChild());
        System.out.print(treeNode.getData()+"，");
    }




}
