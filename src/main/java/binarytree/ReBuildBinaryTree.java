package binarytree;

import java.util.Arrays;

/**
 * Created by zhujia on 2017/9/4.
 */


public class ReBuildBinaryTree {
    /**
     * 输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
     * 例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，则重建二叉树并返回。
     *
     * @param pre 前序数组
     * @param in  中序数组
     * @return 根节点
     */
    public TreeNode reConstructBinaryTree(int[] pre, int[] in) {
        if (pre.length == 0 || in.length == 0) return null;
        //设置根节点
        TreeNode node = new TreeNode(pre[0]);
        for (int i = 0; i < in.length; i++) {
            //寻找中序遍历的根节点
            if (pre[0] == in[i]) {
              /*  Arrays.copyOfRange(T[ ] original,int from,int to)
                将一个原始的数组original，从小标from开始复制，复制到小标to，生成一个新的数组。
                注意这里包括下标from，不包括下标to。*/

                TreeNode leftChild = reConstructBinaryTree(Arrays.copyOfRange(pre, 1, i + 1), Arrays.copyOfRange(in, 0, i));
                TreeNode rightChild = reConstructBinaryTree(Arrays.copyOfRange(pre, i + 1, pre.length), Arrays.copyOfRange(in, i + 1, in.length));
                node.setLeftChild(leftChild);
                node.setRightChild(rightChild);
            }


        }
        return node;

    }
}
