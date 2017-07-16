package algorithm;

import tools.ListNode;

/**
 * Created by zhujia on 2017/7/15.
 */
public class deleteDuplication {
    //在一个排序的链表中，存在重复的结点，请删除该链表中重复的结点，重复的结点不保留，返回链表头指针。 例如，链表1->2->3->3->4->4->5 处理后为 1->2->5

    //V1.0  不能完成题目中的要求，不能正确返回头结点，需要标记出头结点
   /* public static ListNode deleteDuplication(ListNode pHead){
        ListNode pre= pHead;
        ListNode head=pHead;
        while (pHead.next!=null){
            if(pHead.val==pHead.next.val){
                pre.next=pHead.next.next;
                pHead=pre.next;
            }
            else{
                pre=pHead;
                pHead=pHead.next;
            }
        }

        return head;
    }*/
   //V2.0   解决方案：递归
    public static ListNode deleteDuplication(ListNode pHead) {
        //鲁棒性
        if (pHead == null) return null;
        //如果是单一节点直接返回
        if (pHead != null && pHead.next == null) return pHead;

        ListNode current;
        //如果发生重复
        if (pHead.next.val == pHead.val) {
            current = pHead.next.next;
            //存在多个重复节点情况
            while (current != null && current.val == pHead.val) {
                current = current.next;
            }
            //递归
            return deleteDuplication(current);
        } else {
            current = pHead.next;
            pHead.next = deleteDuplication(current);
            return pHead;
        }
    }
}
