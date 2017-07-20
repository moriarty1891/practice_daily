package binarytree;

/**
 * Created by zhujia on 2017/7/20.
 */
public class TreeNode {
    private TreeNode leftChild;
    private TreeNode rightChild;
    private int data;

    public TreeNode(int data){
        this.data=data;
    }
    public TreeNode(TreeNode leftChild,TreeNode rightChild,int data){
        this.leftChild=leftChild;
        this.rightChild=rightChild;
        this.data=data;
    }

    public TreeNode getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(TreeNode leftChild) {
        this.leftChild = leftChild;
    }

    public TreeNode getRightChild() {
        return rightChild;
    }

    public void setRightChild(TreeNode rightChild) {
        this.rightChild = rightChild;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
    @Override
    public String toString(){
        return "TreeNode [leftChild=" + leftChild + ", rightChild=" + rightChild + ", data=" + data + "]";
    }
}
