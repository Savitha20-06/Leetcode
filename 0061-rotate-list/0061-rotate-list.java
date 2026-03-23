/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution 
{
    public ListNode rotateRight(ListNode head, int k) 
    {
        ListNode temp=head;
        int c=0;
        while(temp!=null)
        {
            c++;
            temp=temp.next;
        }
        if(c!=0)
        { 
            k=k%c;
        }
        for(int i=0;i<k;i++)
        {
            temp=head;
            if((temp==null)||(temp.next==null))
            {
                return head;
            }
            while(temp.next.next!=null)
            {
                temp=temp.next;
            }
            ListNode dummy=temp.next;
            temp.next=null;
            dummy.next=head;
            head=dummy;
        }
        return head;
    }
}