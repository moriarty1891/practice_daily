package algorithm;

import tools.ListNode;

/**
 * Created by zhujia on 2017/7/15.
 */
public class ReverseList {
    //输入一个链表，反转链表后，输出链表的所有元素。
    public static ListNode ReverseList(ListNode head) {
        //head为当前节点，如果当前节点为空的话，直接返回null；
        if(head==null)return  null;
        ListNode pre = null;
        ListNode next = null;
        //做循环，如果当前节点不为空的话，始终执行此循环，此循环的目的就是让当前节点从指向next到指向pre
        //如此就可以做到反转链表的效果
        //先用next保存head的下一个节点的信息，保证单链表不会因为失去head节点的原next节点而就此断裂
        while (head!=null){
        next = head.next;
        //保存完next，就可以让head从指向next变成指向pre了，代码如下
        head.next=pre;
        //head指向pre后，就继续依次反转下一个节点,让pre，head，next依次向后移动一个节点，继续下一次的指针反转
        pre=head;
        head=next;
        }
        return pre;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        l1.next=l2;
        l2.next=l3;
        ListNode  listnode =   ReverseList(l1);
        System.out.println(listnode.val+""+listnode.next.val+""+listnode.next.next.val);
        }

}
