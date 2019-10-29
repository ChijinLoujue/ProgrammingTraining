package codinginterviews;

import java.util.Stack;

public class Question52 {
    public ListNode FindFirstCommonNode1(ListNode pHead1, ListNode pHead2) {
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
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        ListNode result =null;
        int len1 = 0;
        int len2 = 0;
        if(pHead1==null||pHead2==null)
            return result;
        ListNode temp1 = pHead1;
        ListNode temp2 = pHead2;
        while(temp1!=null){
            len1++;
            temp1 = temp1.next;
        }
        while(temp2!=null){
            len2++;
            temp2 = temp2.next;
        }
        temp1 = pHead1;
        temp2 = pHead2;
        if(len1>len2){
            int offer = len1-len2;
            while (offer>0){
                temp1 = temp1.next;
                offer--;
            }
        }
        if(len1<len2){
            int offer = len2-len1;
            while (offer>0){
                temp2 = temp2.next;
                offer--;
            }
        }
        while (temp1!=null&&temp2!=null){
            if(temp1==temp2){
                result =temp1;
                break;
            }
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        return result;


    }

}
