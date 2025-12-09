import java.util.*;

public class huawei16_1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
        int n = in.nextInt();
        if(n>1000)
            n = 1000;
        ListNode head = new ListNode(0);
        ListNode New1 = head;
        for(int i=1;i<n;i++){
            ListNode temp=new ListNode(i);
            New1.next=temp;
            New1 = New1.next;
        }
        New1.next=head;
        New1 = New1.next;
        while(New1.next!=New1){
            New1 = New1.next;
            ListNode temp=New1;
            temp=temp.next;
            temp=temp.next;
            New1.next=temp;
            New1=New1.next;
        }
        System.out.println(New1.val);
    }
        in.close();
    }
}
