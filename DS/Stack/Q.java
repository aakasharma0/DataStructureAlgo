import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Q implements IStack {
    Queue<Integer> q;

    public Q() {
        q = new LinkedList<>();
    }

    @Override
    public void push(int data) { // that will O(n) and peek and pop will be O(1)
        int size = q.size();
        q.add(data);
        for (int i = 0; i < size; i++) {
            q.add(q.poll());
        }
    }

    @Override
    public int pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack khali hai bhai");
        }

        return q.poll();
    }

    @Override
    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack khali hai bhai");
        }

        return this.q.peek();
    }

    @Override
    public boolean isEmpty() {
        return q.size() == 0;
    }

    @Override
    public int size() {
        return q.size();
    }

    @Override
    public void display() {
        System.out.println(q);
    }

}
