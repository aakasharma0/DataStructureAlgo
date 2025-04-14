public class QClient {
    public static void main(String[] args) {
        IQueue q = new ArrayDynamicQ();
        q.push(1);
        q.push(2);
        q.push(3);
        q.push(4);
        q.push(5);
        q.pop();
        q.push(0);
        q.push(1);
        q.push(2);
        q.push(3);
        q.push(4);
        q.push(5);
        q.pop();
        q.display();
    }
}
