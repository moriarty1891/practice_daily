package lists;

import tools.ListNode;

/**
 * Created by zhujia on 2017/7/31.
 */

/**
 * 请写一个程序，找到两个单链表最开始的交叉节点。
 * 如果两个链表没有交叉，返回null。
 *在返回结果后，两个链表仍须保持原有的结构。
 *可假定整个链表结构中没有循环。
 */
public class GetIntersectionNode {
    /**
     * 假设两个链表a,b.a比b长k个结点(k>=0).

     那么当a_ptr,b_ptr两个指针同时分别遍历a,b的时候, 必然b_ptr先到达结尾(NULL),而此时a_ptr落后a的尾巴k个结点.

     如果此时再从a的头发出一个指针t,继续和a_ptr 一起走,当a_ptr达到结尾(NULL)时,t恰好走了k个结点.此时从b的头发一个指针s, s和t一起走,因为a比b长k个结点,所以,t和s会一起到达交点.
     * @param headA
     * @param headB
     * @return
     */
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        // Write your code here
        if(headA==null||headB==null){
            return null;
        }
        ListNode A=headA;
        ListNode B=headB;
        int A_length=1;
        while(A.next!=null){
            A=A.next;
            A_length++;
        }
        int B_length=1;
        while(B.next!=null){
            B=B.next;
            B_length++;
        }
        if(A!=B) return null;
        ListNode short_list=headA;
        ListNode long_list=headB;
        if(A_length>B_length){
            long_list=headA;
            short_list=headB;
        }
        for(int i=0;i<Math.abs(A_length-B_length);i++){
            long_list=long_list.next;
        }
        while(long_list!=null){
            if(long_list==short_list){
                return long_list;
            }else{
                long_list=long_list.next;
                short_list=short_list.next;
            }
        }
        return null;
    }
}
