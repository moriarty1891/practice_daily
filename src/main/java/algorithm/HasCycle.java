package algorithm;

/**
 * Created by zhujia on 2017/7/24.
 */

import tools.ListNode;

/**
 * 给定一个链表，判断它是否有环。
 */
public class HasCycle {
    /**
     * 两个指针都从头开始遍历单链表，slow每次向前走1步，fast每次向前走2步，如果fast碰到了NULL，说明环不存在；如果h2碰到本应在身后的h1说明环存在
     * @param head
     * @return
     */
    public boolean hasCycle(ListNode head) {
        // write your code here
        if(head==null || head.next==null)return false;
        ListNode fast=head;
        ListNode slow=head;
        while (fast!=null&&fast.next!=null){
            if(fast.next.next==slow.next) return true;
                fast=fast.next.next;
                slow=slow.next;

        }
        return false;
    }
}
