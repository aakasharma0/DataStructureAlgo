public class Client {
    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.insertAtBeginning(1);
        dll.insertAtBeginning(0);
        dll.insertAtEnd(2);
        dll.insertAtEnd(4);
        dll.insertAtIndex(3, 1);
        dll.displayForward();
        // dll.displayBackward();
        dll.reverse();

        dll.displayForward();
    }
}
