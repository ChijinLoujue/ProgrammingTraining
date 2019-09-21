//leetcode:两数相加
class Main {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l3=new ListNode(0);
        ListNode Ne=l3;
        ListNode hh=new ListNode(1);
        int yu=0;
        while(l1.next==null||l2.next==null)
        {
            int a=l1.val;
            int b=l2.val;
            ListNode newnode=new ListNode((a+b)%10+yu);
            l3.next=newnode;
            yu=(l1.val+l2.val)/10;
            if(l1.next!=null)
                l1=l1.next;
            else a=0;
            if(l2.next!=null)
                l2=l2.next;
            else b=0;
        }
        if(yu!=0)
            l3.next=hh;
        return l3;
    }
}