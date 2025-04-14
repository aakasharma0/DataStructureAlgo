public class DoublyLinkedList {

    Node head;
    Node tail;
    int size;

    public DoublyLinkedList() {
        this.size = 0;
    }

    private class Node {
        Node prev;
        Node next;
        int data;

        public Node(int data) {
            this.data = data;
        }
    }

    public void displayForward() {
        Node itr = head;
        while (itr != null) {
            System.out.print(itr.data);
            if (itr.next != null) {
                System.out.print("<=>");
            }
            itr = itr.next;
        }
        System.out.println();
    }

    public void displayBackward() {
        Node itr = tail;
        while (itr != null) {
            System.out.print(itr.data);
            if (itr.prev != null) {
                System.out.print("<=>");
            }
            itr = itr.prev;
        }
    }

    public void insertAtBeginning(int data) {
        Node node = new Node(data);
        size++;
        if (head == null) {
            head = tail = node;
            return;
        }
        head.prev = node;
        node.next = head;
        head = node;

    }

    public void insertAtEnd(int data) {
        Node node = new Node(data);
        size++;
        if (head == null) {
            head = tail = node;
            return;
        }
        tail.next = node;
        node.prev = tail;
        tail = node;

    }

    public void insertAtIndex(int val, int idx) {
        if (idx < 0 || idx > size) {
            System.out.println("In valid index");
            return;
        }
        if (idx == 0) {
            insertAtBeginning(val);
        } else if (idx == size) {
            insertAtEnd(val);
        } else {
            Node root = new Node(val);
            Node itr = head;
            int currIdx = 0;
            while (currIdx < idx - 1) {
                currIdx++;
                itr = itr.next;
            }
            root.prev = itr;
            root.next = itr.next;
            itr.next.prev = root;
            itr.next = root;
            size++;
        }
    }

    public void reverse() {
        Node itr = head;
        Node tempNode = null;
        while (itr != null) {
            tempNode = itr.next;
            itr.next = itr.prev;
            itr.prev = tempNode;
            itr = tempNode;
        }
        tempNode = head;
        head = tail;
        tail = tempNode;
    }

}