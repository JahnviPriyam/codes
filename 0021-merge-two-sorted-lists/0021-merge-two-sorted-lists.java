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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        int n1 = 0, n2 = 0;
        ListNode temp = list1;

        while (temp != null) {
            n1++;
            temp = temp.next;
        }

        temp = list2;
        while (temp != null) {
            n2++;
            temp = temp.next;
        }

        int[] arr = new int[n1 + n2];
        int idx = 0;

        temp = list1;
        while (temp != null) {
            arr[idx++] = temp.val;
            temp = temp.next;
        }

        temp = list2;
        while (temp != null) {
            arr[idx++] = temp.val;
            temp = temp.next;
        }

        Arrays.sort(arr);

        if (arr.length == 0) return null;

        ListNode head = new ListNode(arr[0]);
        ListNode curr = head;

        for (int i = 1; i < arr.length; i++) {
            curr.next = new ListNode(arr[i]);
            curr = curr.next;
        }

        return head;
    }
}
