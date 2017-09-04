package lists;

import tools.ListNode;

/**
 * Created by 24323 on 2017/7/15.
 */
public class FindKthToTail {
    //输入一个链表，输出该链表中倒数第k个结点。
    public static ListNode FindKthToTail(ListNode head, int k) {
        if(head==null || k<=0) return null;
        ListNode pre = head ;
        ListNode low = head ;
        for (int i = 1; i <k ; i++) {
            if(pre.next==null)
                return null;
            pre = pre.next;

        }while (pre.next!=null){
            pre = pre.next;
            low=low.next;
        }
        return low ;

    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);
        l1.next=l2;
        l2.next=l3;
        l3.next=l4;
        ListNode listNode = FindKthToTail(l1,3);
        System.out.println(listNode.val);
    }
}
