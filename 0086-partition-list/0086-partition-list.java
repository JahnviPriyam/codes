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
    public ListNode partition(ListNode head, int x) {
        ListNode bhead= new ListNode(0);
        ListNode ahead= new ListNode(0);
        ListNode bfore= bhead;
        ListNode after= ahead;
        while(head!=null)
        {
            if(head.val<x)
            {
                bfore.next = head;
                bfore= bfore.next;
            }
            else
            {
                after.next = head;
                after= after.next;
            }
            head= head.next;
        }
        after.next= null;
        bfore.next= ahead.next;
        return bhead.next;

        
    }
}