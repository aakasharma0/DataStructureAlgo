public class LinkedListClient {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        // ll.addAtFirst(2);
        // ll.addAtFirst(1);
        // ll.addAtLast(3);
        // ll.addAtIndex(1, 0);
        // ll.addAtIndex(2, 1);
        // ll.addAtIndex(3, 1);
        ll.addAtLast(1);
        ll.addAtLast(2);
        ll.addAtLast(3);
        ll.addAtLast(4);

        ll.display();
        ll.reverse();

        ll.display();

        // System.out.println("Started deletion 1");
        // ll.deleteNodeAtIndex(0);
        // ll.display();
        // System.out.println("Started deletion 2");
        // ll.deleteAtFirst();
        // ll.display();
        // System.out.println("Started deletion 3");
        // ll.deleteAtFirst();
        // ll.display();
        // System.out.println("Started deletion 4");
        // ll.deleteAtFirst();
        // ll.display();

    }
}
