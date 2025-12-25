public class LeetCode21 {

    public static void main(String[] args) {
        LeetCode21 solution = new LeetCode21();
        ListNode list1 = solution.getListNodeByList(new int[] { 1, 2, 4 });
        ListNode list2 = solution.getListNodeByList(new int[] { 1, 3, 4 });
        solution.printListNodeLink(solution.mergeTwoLists(list1, list2));
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = new ListNode();
        ListNode temp = head;
        while (list1 != null || list2 != null) {
            if (list2 == null) {
                temp.next = list1;
                list1 = list1.next;
            } else if (list1 == null) {
                temp.next = list2;
                list2 = list2.next;
            } else {
                if (list1.val < list2.val) {
                    temp.next = list1;
                    list1 = list1.next;
                } else {
                    temp.next = list2;
                    list2 = list2.next;
                }
            }
            temp = temp.next;
        }
        return head.next;
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
