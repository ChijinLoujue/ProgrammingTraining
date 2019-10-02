package codinginterviews;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class Question6{
    public static void main(String []args) {
        ListNode listNode = new ListNode(0);
        ListNode temp = listNode;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i =0;i<n;++i){
            temp.next = new ListNode(sc.nextInt());
            temp=temp.next;
        }
        listNode = listNode.next;
        System.out.println(printListFromTailToHead(listNode));
    }
    public static ArrayList<Integer> printListFromTailToHead(ListNode listNode) {

        ArrayList<Integer> temp = new ArrayList<Integer>();
        ArrayList<Integer> result = new ArrayList<Integer>();
        if (listNode==null){
            return result;
        }
        temp.add(listNode.val);
        while (listNode.next!=null){
            listNode = listNode.next;
            temp.add(listNode.val);
        }
        for (int i =temp.size()-1;i>=0;--i){
            result.add(temp.get(i));
        }
        return result;
    }

    public static class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
}
