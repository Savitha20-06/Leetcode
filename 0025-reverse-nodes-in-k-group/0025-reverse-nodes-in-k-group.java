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
    class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head==null || k==1) return head;

        ListNode dummy=new ListNode(0);
        dummy.next = head;

        ListNode prev = dummy;

        while (true) 
        {
            ListNode curr = prev;
            for (int i = 0; i < k; i++) 
            {
                curr = curr.next;
                if (curr == null) return dummy.next;
            }
            ListNode start = prev.next;
            ListNode next = curr.next;

            ListNode p = next;
            ListNode c = start;

            while (c != next) {
                ListNode temp = c.next;
                c.next = p;
                p = c;
                c = temp;
            }
            prev.next = curr;
            prev = start;
        }
    }
}