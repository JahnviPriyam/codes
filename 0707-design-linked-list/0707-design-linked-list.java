class MyLinkedList {

    class Node {
        int val;
        Node next;
        Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    Node head;

    public MyLinkedList() {
        head = null;
    }

    public int get(int index) {
        Node temp = head;
        for (int i = 0; i < index; i++) {
            if (temp == null) return -1;
            temp = temp.next;
        }
        return temp == null ? -1 : temp.val;
    }

    public void addAtHead(int val) {
        Node n = new Node(val);
        n.next = head;
        head = n;
    }

    public void addAtTail(int val) {
        Node n = new Node(val);
        if (head == null) {
            head = n;
            return;
        }
        Node temp = head;
        while (temp.next != null)
            temp = temp.next;
        temp.next = n;
    }

    public void addAtIndex(int index, int val) {
        if (index == 0) {
            addAtHead(val);
            return;
        }
        Node temp = head;
        for (int i = 0; i < index - 1; i++) {
            if (temp == null) return;
            temp = temp.next;
        }
        if (temp == null) return;
        Node n = new Node(val);
        n.next = temp.next;
        temp.next = n;
    }

    public void deleteAtIndex(int index) {
        if (head == null) return;
        if (index == 0) {
            head = head.next;
            return;
        }
        Node temp = head;
        for (int i = 0; i < index - 1; i++) {
            if (temp.next == null) return;
            temp = temp.next;
        }
        if (temp.next == null) return;
        temp.next = temp.next.next;
    }
}
