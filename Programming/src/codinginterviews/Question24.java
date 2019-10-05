package codinginterviews;

import java.util.Scanner;

public class Question24 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String []str = input.split(" ");
        int len = str.length;
        ListNode head = new ListNode(Integer.parseInt(str[0]));
        ListNode temp = head;
        for(int i = 1;i<len;++i){
            temp.next = new ListNode(Integer.parseInt(str[i]));
            temp = temp.next;
        }
        System.out.println(head.val);
        System.out.println(ReverseList(head).val);
    }
    public static ListNode ReverseList(ListNode head) {
        if(head ==null)
            return null;
        if (head.next==null)
            return head;
        ListNode headNext = head.next;
        System.out.println(headNext.val);
        head.next =null;
        ListNode newHead = ReverseList(headNext);
        headNext.next=head;
        return newHead;
    }


}
