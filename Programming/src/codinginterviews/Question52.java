package codinginterviews;

import java.util.Stack;

public class Question52 {
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        ListNode result = null;
        if(pHead1==null||pHead2==null)
            return result;
        Stack<ListNode> stack1 = new Stack<ListNode>();
        Stack<ListNode> stack2 = new Stack<ListNode>();
        ListNode temp1 = pHead1;
        ListNode temp2 = pHead2;
        while (temp1!=null){
            stack1.push(temp1);
            temp1 = temp1.next;
        }
        while (temp2!=null){
            stack2.push(temp2);
            temp2 = temp2.next;
        }

        while (stack1.peek()==stack2.peek()){
            result = stack1.pop();
            stack2.pop();
        }
        return result;
    }
}
