package codinginterviews;

public class Question62 {
    public int LastRemaining_Solution(int n, int m) {
        if(n<=0)
            return -1;
        ListNode head = new ListNode(0);
        ListNode temp = head;
        for(int i = 1;i<n;++i){
            ListNode cur = new ListNode(i);
            temp.next = cur;
            temp = temp.next;
        }
        temp.next = head;
        int result = -1;
        while (temp.next!=temp){
            for(int i=0;i<m-1;++i){
                temp = temp.next;
            }
            temp.next = temp.next.next;
        }
        result = temp.val;
        return result;
    }
}
