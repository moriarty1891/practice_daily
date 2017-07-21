package algorithm;

import tools.ListNode;


/**
 * Created by zhujia on 2017/7/21.
 */
public class AddLists {
    /**
     * 链表求和
     *你有两个用链表代表的整数，其中每个节点包含一个数字。数字存储按照在原来整数中相反的顺序，使得第一个数字位于链表的开头。
     * 写出一个函数将两个整数相加，用链表形式返回和。
     * @param l1:the first list
     * @param l2:the second list
     * @return the sum list of l1 and l2
     */
    //不能处理位数较多的极端情况，但是是一种开脑洞的解法。。。通过61%
    public ListNode addLists(ListNode l1, ListNode l2) {
        // write your code here
        long i = 1;
        long m =1;
        long  temp1=0;
        long temp2=0;
        while (l1!=null){
            temp1 += l1.val*i;
            l1=l1.next;
            i=i*10;

        }
        while (l2!=null){
            temp2 += l2.val*m;
            l2=l2.next;
             m=m*10;

        }
        long temp = temp1+temp2;
        String str =temp+"";
        char[]array = str.toCharArray();
        ListNode head = null;
        for (char c:array
             ) {
            //头插法
                ListNode listNode = new ListNode(Character.getNumericValue(c));
                listNode.next=head;
                head=listNode;

        }
        return head;
    }
}
