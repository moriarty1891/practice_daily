package binarytree;

import java.util.*;

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
     1、有右子树的，那么下个结点就是右子树最左边的点； 2、没有右子树的，也可以分成两类，
     a)是父节点左孩子 ，那么父节点就是下一个节点 ； b)是父节点的右孩子找他的父节点的父节点的父节点.直到当前结点是其父节点的左孩子位置。如果没有,那么他就是尾节点。
     * @param treeNode
     */
    public List<Integer>  inOrderTraversal(TreeNode treeNode){
        List<Integer> result = new ArrayList<>();
        //鲁棒性
        if(treeNode == null)
            return result;
        Stack<TreeNode> stack = new Stack<>();
        do {
            //依次将左节点均加入栈中
            while(treeNode != null) {
                stack.push(treeNode);
                treeNode = treeNode.getLeftChild();
            }
            if (!stack.isEmpty()) {
                treeNode = stack.pop();
                result.add(treeNode.getData());
                treeNode = treeNode.getRightChild();
            }
        } while(!stack.isEmpty() || treeNode != null);
        return result;

    }

    /**
     * 后序遍历左-右-根
     * @param treeNode
     */

    /**
     * 迭代实现，使用栈实现，出栈得到节点顺序为根右左，每次向list最开头插入元素
     * @param root
     * @return
     */
    public List<Integer> afterOrderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();

        if (root == null)
            return result;
        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(root);   //首先将根节点压栈
        while (!stack.isEmpty()) {
            TreeNode ele = stack.pop(); //首先出栈的为根节点，其后先出右子节点，后出左子节点
            if (ele.getLeftChild() != null)
                stack.push(ele.getLeftChild());  //将左子节点压栈
            if (ele.getRightChild() != null) {
                stack.push(ele.getRightChild()); //将右子节点压栈
            }
            result.add(0, ele.getData()); //因为出栈顺序为“根右左”，所以需要每次将元素插入list开头
        }
        return result;
    }

    /**
     *
     * @param root 树根节点
     * 层序遍历二叉树，用队列实现，先将根节点入队列，只要队列不为空，然后出队列，并访问，接着将访问节点的左右子树依次入队列
     */
    public static void levelTravel(TreeNode root){
        if(root==null)return;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            TreeNode temp =  q.poll();
            System.out.println(temp.getData());
            if(temp.getLeftChild()!=null)q.add(temp.getLeftChild());
            if(temp.getRightChild()!=null)q.add(temp.getRightChild());
        }
    }

}
