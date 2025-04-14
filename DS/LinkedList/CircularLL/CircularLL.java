public class CircularLL {

    private Node tail;
    private int size;

    public CircularLL() {
        this.tail = null;
        this.size = 0;
    }

    private class Node {
        Node next;
        int data;

        public Node(int data) {
            this.data = data;
        }

    }

    // mai logic starts here

    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        if (tail == null) {
            newNode.next = newNode;
            tail = newNode;
        } else {
            Node head = tail.next;
            newNode.next = head;
            tail.next = newNode;
        }
        size++;
    }

    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            newNode.next = newNode;
            tail = newNode;
        } else {
            newNode.next = tail.next;
            tail.next = newNode;
            tail = newNode;
        }
        this.size++;

    }

    public void insertAtIndex(int val, int idx) {
        if (idx < 0 || idx > size) {
            System.out.println("inserAtIndex() : galat index hai bhai");
            return;
        }
        if (idx == 0) {
            insertAtBeginning(val);
        } else if (idx == size) {
            insertAtEnd(val);
        } else {
            Node newNode = new Node(val);
            Node itr = tail.next;
            int currIdx = 0;
            while (currIdx < idx - 1) {
                itr = itr.next;
                currIdx++;
            }
            newNode.next = itr.next;
            itr.next = newNode;

        }
    }

    public void deleteAtBeginning() {
        if (isEmpty()) {
            System.out.println("LL khali hai bhai ");

        } else {
            if (size == 1) {
                tail = null;
            } else {
                tail.next = tail.next.next;
            }
            size--;
        }
    }

    public void deleteAtEnd() {
        if (isEmpty()) {
            System.out.println("LL khali hai bhai ");
        } else {

            if (size == 1) {
                tail = null;
            } else {
                Node itr = tail.next;
                Node end = itr;
                Node prevItr = end;
                do {
                    prevItr = itr;
                    itr = itr.next;
                } while (itr.next != end);

                prevItr.next = itr.next;
                tail = prevItr;

            }

            this.size--;
        }
    }

    public void deleteAtIndex(int idx) {
        if (idx < 0 || idx >= size) {
            System.out.println(" Invalid index bhai ");
            return;
        }

        if (idx == 0) {
            deleteAtBeginning();
        } else if (idx == size - 1) {
            deleteAtEnd();
        } else {
            Node itr = tail.next;
            Node prev = itr;
            int currIdx = 0;
            while (currIdx < idx) {
                prev = itr;
                itr = itr.next;
                currIdx++;
            }
            prev.next = itr.next;
        }
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("LL is empty");

        } else {
            Node itr = tail.next;
            Node end = itr;
            do {
                System.out.print(itr.data + "->");
                itr = itr.next;
            } while (itr != end);
            System.out.println();
        }
    }

    public boolean isEmpty() {
        return size == 0;
    }
}