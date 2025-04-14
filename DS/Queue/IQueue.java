public interface IQueue {
    public int size();

    public int peek();

    public int pop();

    public void push(int data);

    public boolean isEmpty();

    public void display();
}