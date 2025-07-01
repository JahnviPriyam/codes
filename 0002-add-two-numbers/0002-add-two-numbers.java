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
import java.math.BigInteger;

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        String s1 = "", s2 = "";

        while (l1 != null) {
            s1 = l1.val + s1;
            l1 = l1.next;
        }
        while (l2 != null) {
            s2 = l2.val + s2;
            l2 = l2.next;
        }

        String sum = new StringBuilder(new BigInteger(s1).add(new BigInteger(s2)).toString()).reverse().toString();
        ListNode node = new ListNode(sum.charAt(0) - '0');
        ListNode head = node;
        for (int i = 1; i < sum.length(); i++) {
            node.next = new ListNode(sum.charAt(i) - '0');
            node = node.next;
        }

        return head;
    }
}
