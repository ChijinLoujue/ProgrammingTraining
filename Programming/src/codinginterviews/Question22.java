package codinginterviews;

import java.util.Scanner;

public class Question22 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int k = sc.nextInt();
        String []str = input.split(" ");
        int len = str.length;
        ListNode head = new ListNode(Integer.parseInt(str[0]));
        ListNode temp = head;
        for(int i = 1;i<len;++i){
            temp.next = new ListNode(Integer.parseInt(str[i]));
            temp = temp.next;
        }
        System.out.println(FindKthToTail(head,k).val);
    }

    public static ListNode FindKthToTail(ListNode head, int k) {
        if(head ==null||k==0)
            return null;
        ListNode temp1 = head;
        ListNode temp2 = head;
        for(int i=0;i<k-1;++i){
            temp1 = temp1.next;
            if(temp1==null)
                return null;
        }
        while (temp1.next!=null){
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        return temp2;
    }
    public static class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
}
