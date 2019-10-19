package liulishuo;

import java.util.ArrayList;
import java.util.Scanner;

public class Liulishuo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String []strArr = str.split(" ");
        int len =strArr.length;
        int []numArr = new int[len];
        for(int i = 0;i<len;++i){
            numArr[i] = Integer.parseInt(strArr[i]);
        }
        ListNode head = new ListNode(0);
        ListNode current = head;
        for(int i = 0;i<len;++i){
            ListNode temp = new ListNode(numArr[i]);
            current.next = temp;
            current = current.next;
        }
        head = head.next;
        ListNode reHead = ReverseList(head);
        while (reHead.next.next!=null){
            System.out.print(reHead.val+" ");
            reHead = reHead.next;
        }
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

    public static class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
}
