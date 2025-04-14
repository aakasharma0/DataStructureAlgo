public class Client {
    public static void main(String[] args) {
        CircularLL circularLL = new CircularLL();
        circularLL.insertAtBeginning(3);
        circularLL.insertAtBeginning(2);
        circularLL.insertAtBeginning(1);
        circularLL.insertAtEnd(100);
        circularLL.display();
        circularLL.insertAtIndex(1000, 1);
        circularLL.display();
        circularLL.deleteAtIndex(2);

        circularLL.display();
        // circularLL.deleteAtEnd();
        // circularLL.deleteAtEnd();
        // circularLL.display();
    }
}
