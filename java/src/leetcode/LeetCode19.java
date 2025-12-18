public class LeetCode19 {

    public static void main(String[] args) {
        LeetCode19 solution = new LeetCode19();
        ListNode head = solution.getListNodeByList(new int[] { 1, 2, 3, 4, 5 });
        int n = 2;
        solution.printListNodeLink(solution.removeNthFromEnd(head, n));
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) {
            return head;
        }
        int linkLen = 0;
        ListNode temp = head;
        while (temp != null) {
            linkLen++;
            temp = temp.next;
        }
        if (linkLen < n) {
            return head;
        }
        if (n == linkLen) {
            return head.next;
        }
        int target = linkLen - n;
        ListNode temp2 = head;
        for (int i = 0; i < target - 1; i++) {
            temp2 = temp2.next;
        }
        temp2.next = temp2.next.next;
        return head;
    }

    public void printListNodeLink(ListNode listNode) {

        StringBuffer stringBuffer = new StringBuffer("[");
        while (listNode != null) {
            stringBuffer.append(listNode.val).append(", ");
            listNode = listNode.next;
        }
        stringBuffer.append("]");
        System.out.println(stringBuffer);
    }

    public ListNode getListNodeByList(int[] nums) {
        if (nums == null) {
            return null;
        }
        if (nums.length == 0) {
            return new ListNode();
        }
        ListNode head = new ListNode();
        ListNode temp = head;
        for (int i = 0; i < nums.length; i++) {
            ListNode listNode = new ListNode();
            listNode.val = nums[i];
            temp.next = listNode;
            temp = listNode;
        }
        return head.next;
    }
}