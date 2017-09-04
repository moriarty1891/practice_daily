package binarytree;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by zhujia on 2017/9/4.
 */
public class S_Print {

    /**
     * 请实现一个函数按照之字形打印二叉树，即第一行按照从左到右的顺序打印，第二层按照从右至左的顺序打印，第三行按照从左到右的顺序打印，其他行以此类推。
     * @param pRoot
     * @return
     */
    public static ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        int layer = 1;
        //s1存奇数层节点
        Stack<TreeNode> s1 = new Stack<>();
        //根节点放入S1
        s1.push(pRoot);
        //s2存偶数层节点
        Stack<TreeNode> s2 = new Stack<>();
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        while (!s1.empty() || !s2.empty()) {
            //奇数层
            if (layer % 2 != 0) {
                ArrayList<Integer> temp = new ArrayList<>();
                while (!s1.empty()) {
                    TreeNode node = s1.pop();
                    if (node != null) {
                        temp.add(node.getData());
                        s2.push(node.getLeftChild());
                        s2.push(node.getRightChild());
                    }
                }
                if (!temp.isEmpty()) {
                    list.add(temp);
                    layer++;
                }
                //偶数层
            } else {
                ArrayList<Integer> temp = new ArrayList<>();
                while (!s2.empty()) {
                    TreeNode node = s2.pop();
                    if (node != null) {
                        temp.add(node.getData());
                        s1.push(node.getRightChild());
                        s1.push(node.getLeftChild());
                    }
                }
                if (!temp.isEmpty()) {
                    list.add(temp);
                    layer++;
                }
            }
        }
        return list;
    }
}
