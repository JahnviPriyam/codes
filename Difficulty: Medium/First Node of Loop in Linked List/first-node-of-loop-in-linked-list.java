/*
class Node {
    int data;
    Node next;

    Node(int x)
    {
        data = x;
        next = null;
    }
};
*/

class Solution {
    public int cycleStart(Node head) {
        // code here
        Node slow= head;
        Node fast= head;
        while(fast!= null && fast.next!= null)
        {
            slow= slow.next;
            fast= fast.next.next;
            if(slow==fast)
            {
                Node entry= head;
                while(entry!=slow)
                {
                    entry= entry.next;
                    slow= slow.next;
                }
                return entry.data;
            }
        }
        return -1;
    }
}