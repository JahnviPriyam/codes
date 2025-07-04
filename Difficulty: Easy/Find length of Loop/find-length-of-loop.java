/*
class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
}
*/

class Solution {
    // Function to find the length of a loop in the linked list.
    public int countNodesinLoop(Node head) {
        // code here.
        Node slow= head;
        Node fast= head;
        while(fast!=null && fast.next!=null)
        {
            slow= slow.next;
            fast= fast.next.next;
            if(slow==fast)
            {
                int count=1;
                slow= slow.next;
                while(slow!=fast)
                {
                    count++;
                    slow= slow.next;
                }
                return count;
            }
        }
        return 0;
    }
}