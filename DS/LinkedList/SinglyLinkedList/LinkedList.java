public class LinkedList {
    private Node head;
    public int size;

    public LinkedList() {
        head = null;
        size = 0;
    }

    public void display() {
        if (head == null) {
            System.out.println("LL Empty");
        } else {
            Node root = head;
            while (root != null) {
                System.out.print(root.data + "->");
                root = root.next;
            }
            System.out.println();
        }

    }

    public boolean isEmpty() {
        return size == 0;
    }

    private Node getNodeAtIndex(int n) {
        if (n < 0 || n >= size) {
            throw new RuntimeException("Invalid Index");
        }
        Node node = head;
        while (n != 0) {
            node = node.next;
            n--;
        }
        return node;
    }

    public void addAtFirst(int val) {
        Node node = new Node(val);
        if (head == null) {
            head = node;
        } else {
            node.next = head;
            head = node;
        }
        size++;
    }

    public void addAtLast(int val) {
        Node node = new Node(val);
        if (head == null) {
            head = node;
            size++;
            return;
        }
        Node root = head;
        while (root.next != null) {
            root = root.next;
        }
        root.next = node;
        size++;
    }

    public void addAtIndex(int val, int index) {

        if (index < 0 || index > size) {
            throw new RuntimeException("Wrong Index hai bhai");
        }
        if (index == 0) {
            addAtFirst(val);
            return;
        } else if (index == size - 1) {
            addAtLast(val);
            return;

        }
        Node nodeToAdd = new Node(val);
        int numberOfIndexeToSkip = index;
        Node rootNode = head;
        while (numberOfIndexeToSkip == 0) {
            rootNode = rootNode.next;
        }
        nodeToAdd.next = rootNode.next;
        rootNode.next = nodeToAdd;
        size++;

    }

    public void deleteAtFirst() {
        if (head == null) {
            throw new RuntimeException("LL Khali hai");
        }
        Node head = this.head;
        this.head = head.next;
        head = null;
        size--;
    }

    public void deleteAtLast() {
        if (head == null) {
            throw new RuntimeException("LL Khali hai");
        }
        if (size == 1) {
            deleteAtFirst();
            return;
        }

        Node node = getNodeAtIndex(size - 2);
        node.next = null;
        size--;
    }

    public void deleteNodeAtIndex(int n) {
        if (n < 0 || n > size) {
            throw new RuntimeException("Invalid index hai bhai ");
        }
        if (n == 0) {
            deleteAtFirst();
            return;
        }
        if (n == size) {
            deleteAtLast();
        }
        Node node = getNodeAtIndex(n - 1);
        Node nodeNextToNode = node.next;
        node.next = node.next.next;
        nodeNextToNode = null;
        size--;
    }

    public void reverse() {
        Node prev = null;
        Node currNode = head;
        while (currNode != null) {
            Node nodeNext = currNode.next;
            currNode.next = prev;
            prev = currNode;
            currNode = nodeNext;
        }
        head = prev;
    }
}