import java.util.Stack;

public class Stk implements IQueue {

    Stack<Integer> stk;

    public Stk() {
        this.stk = new Stack<>();
    }

    @Override
    public int size() {

        return stk.size();
    }

    @Override
    public int peek() {
        return stk.peek();
    }

    @Override
    public int pop() {
        return stk.pop();
    }

    @Override
    public void push(int data) {
        if (stk.isEmpty()) {
            stk.add(data);
            return;
        }
        int temp = stk.pop();
        push(data);
        stk.add(temp);
    }

    @Override
    public boolean isEmpty() {
        return stk.isEmpty();
    }

    @Override
    public void display() {
        System.out.println(stk);
    }

}
