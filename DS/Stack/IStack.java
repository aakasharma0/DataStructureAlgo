public interface IStack {
    public void push(int data);

    public int pop();

    public int peek();

    public boolean isEmpty();

    public int size();

    public void display();

}
// push(int data) – Adds an element to the top of the stack.
// pop() – Removes and returns the top element.
// peek() – Returns the top element without removing it.
// isEmpty() – Checks if the stack is empty.
// size() – Returns the number of elements in the stack.
// display()