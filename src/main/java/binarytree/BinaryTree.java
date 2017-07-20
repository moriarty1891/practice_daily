package binarytree;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhujia on 2017/7/20.
 */
public class BinaryTree {
    //初始化二叉树
    public static List<TreeNode> initBinaryTree(int[] tree){
        List<TreeNode> list = new ArrayList<>();
        for (int treeNodeData : tree) {
            list.add( new TreeNode(treeNodeData));
        }
        for(int parentNode = 0 ;parentNode< tree.length/2 -1 ; parentNode++){
            //初始化左儿子
            list.get(parentNode).setLeftChild(list.get(parentNode*2 + 1));
            //初始化右儿子
            list.get(parentNode).setRightChild(list.get(parentNode*2 + 2));
        }
        //最后一个节点的度不一定是2，需要单独处理。
        int lastNode = tree.length/2 -1;
        list.get(lastNode).setLeftChild(list.get(lastNode*2+1));
        if(tree.length%2!=0){
            list.get(lastNode).setRightChild(list.get(lastNode*2+2));
        }
        return list;
    }
}
