package DataStructure.List;

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2)
    {
        ListNode head = new ListNode(0);
        ListNode cur = head;
        int carry = 0;
        while(l1!=null || l2!=null || carry!=0)
        {
            if(l1==null)
                l1=new ListNode(0);
            if(l2==null)
                l2=new ListNode(0);
            if(l1.val+l2.val+carry<10){
                cur.val=l1.val+l2.val+carry;
                carry=0;
            }
            else {
                cur.val=(l1.val+l2.val+carry)%10;
                carry=1;
            }
            l1=l1.next;
            l2=l2.next;
            if(l1!=null||l2!=null||carry==1)
                cur.next=new ListNode();
            cur=cur.next;
        }
        return head;
    }
}


