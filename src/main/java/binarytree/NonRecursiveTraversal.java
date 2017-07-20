package binarytree;

import java.util.LinkedList;

/**
 * Created by 24323 on 2017/7/20.
 */
public class NonRecursiveTraversal {
    /**
     * 前序遍历根-左-右
     * @param treeNode
     */
    public void preOrderTraversal(TreeNode treeNode){
        LinkedList<TreeNode> stack = new LinkedList<>();
        //初始化当前节点为根节点
        TreeNode currentTreeNode = treeNode;
        stack.push(currentTreeNode);
        while (!stack.isEmpty()){
            //出栈打印
            currentTreeNode=stack.pop();
            System.out.print(currentTreeNode.getData() + ",");
            // 如果结点右孩子不为空，入栈（因为节点顺序为根--左--右，所以右结点先入栈）
            if(currentTreeNode.getRightChild()!=null){
                stack.push(currentTreeNode.getRightChild());
            }
            // 左孩子入栈
            if(currentTreeNode.getLeftChild()!=null){
                stack.push(currentTreeNode.getLeftChild());
            }
        }
    }

    /**
     * 中序遍历左-根-右
     * @param treeNode
     */
    public void  inOrderTraversal(TreeNode treeNode){
        // 初始化链栈
        LinkedList<TreeNode> stack = new LinkedList<>();
        //初始化当前节点为根节点
        TreeNode currentTreeNode = treeNode;
        // 条件： 栈不为空或者当前结点不为空
        while (!stack.isEmpty()|| currentTreeNode != null){
            // 当前结点不为空，则将结点的左孩子入栈,直到结点左孩子为null,退出循环，执行下一步操作
            while (currentTreeNode!=null){
                // 将当前结点入栈
                stack.push(currentTreeNode);
                // 设置当前结点为当前结点的左孩子
                currentTreeNode= currentTreeNode.getLeftChild();
            }
            // 判断栈是否为空
            if (!stack.isEmpty()){
                currentTreeNode=stack.pop();
                System.out.print(currentTreeNode.getData() + ",");
                // 设置当前结点为当前结点的右孩子,如果不为空，则执行上一个循环入栈
                currentTreeNode = currentTreeNode.getRightChild();
            }

    }
    }

    /**
     * 后序遍历左-右-根
     * @param treeNode
     */
    public void afterOrderTraversal(TreeNode treeNode){
        // 初始化链栈
        LinkedList<TreeNode> stack = new LinkedList<>();
        TreeNode rightNode = null;
        //初始化当前节点为根节点
        TreeNode currentTreeNode = treeNode;
        // 条件： 栈不为空或者当前结点不为空
        while (currentTreeNode != null || !stack.isEmpty()) {
            // 当前结点不为空，则将结点的左孩子入栈,直到结点左孩子为null,退出循环，执行下一步操作
            while (currentTreeNode != null) {
                stack.push(currentTreeNode);
                currentTreeNode = currentTreeNode.getLeftChild();
            }
            currentTreeNode = stack.pop();
            // 当上一个访问的结点是右孩子或者当前结点没有右孩子则访问当前结点
            while (currentTreeNode != null
                    && (currentTreeNode.getRightChild() == null || currentTreeNode.getRightChild() == rightNode)) {
                System.out.print(currentTreeNode.getData() + " ");
                rightNode = currentTreeNode;
                if (stack.isEmpty()) {
                    return;
                }
                currentTreeNode = stack.pop();
            }
            stack.push(currentTreeNode);
            currentTreeNode = currentTreeNode.getRightChild();
        }
    }

}
