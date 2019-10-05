package codinginterviews;

import java.util.Scanner;

public class Question25 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        String input1 = sc.nextLine();
        String input2 = sc.nextLine();
        String []str1 = input1.split(" ");
        String []str2 = input2.split(" ");
        int len1 = str1.length;
        int len2 = str2.length;
        ListNode head1 = new ListNode(Integer.parseInt(str1[0]));
        ListNode head2 = new ListNode(Integer.parseInt(str2[0]));
        ListNode temp1 = head1;
        ListNode temp2 = head2;
        for(int i = 1;i<len1;++i){
            temp1.next = new ListNode(Integer.parseInt(str1[i]));
            temp1 = temp1.next;
        }
        for(int i = 1;i<len2;++i){
            temp2.next = new ListNode(Integer.parseInt(str2[i]));
            temp2 = temp2.next;
        }
        System.out.println(head1.val);
        System.out.println(head2.val);
        System.out.println(Merge(head1,head2).val);
    }

    public static ListNode Merge(ListNode list1,ListNode list2) {
        ListNode head = new ListNode(0);
        ListNode temp = head;
        while (list1!=null||list2!=null){
            if((list2==null&&list1!=null)||((list2!=null&&list1!=null)&&list1.val<=list2.val)){
                temp.next=list1;
                list1 =list1.next;
            }else {
                temp.next = list2;
                list2=list2.next;

            }
            temp=temp.next;
        }
        return head.next;

    }
}
