class Solution {
    Node deleteAllOccurOfX(Node head, int x) {
        Node curr = head;

        while (curr != null) {
            if (curr.data == x) {
                if (curr.prev != null)
                    curr.prev.next = curr.next;
                else
                    head = curr.next;

                if (curr.next != null)
                    curr.next.prev = curr.prev;
            }
            curr = curr.next;
        }
        return head;
    }
}
