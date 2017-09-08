package stack_queue;

import java.util.Stack;

/**
 * Created by zhujia on 2017/9/4.
 */

/**
 * 用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。
 * 实现方法：
 * 队列入列时：直接将元素压到栈S1，S1的栈顶元素就是队列的入列元素；
 *队列出列时：先判断栈S2中是否有元素，若有元素，说明栈S1中的元素已经全都倒入S2了，这时S2的栈顶的元素肯定就是第一个入队列的元素，
 * 即出队元素。如果S2中没有元素，先将S1中的元素倒入S2中，再弹出S2的栈顶元素，即出队元素。
 */
public class StackToQueue {

    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();


    public void push(int node) {
        stack1.push(node);
    }

    public int pop() {
        if (stack1.empty() && stack2.empty()) {
            throw new RuntimeException("Queue is empty!");
        }
        if (stack2.empty()) {
            while (!stack1.empty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }
}
