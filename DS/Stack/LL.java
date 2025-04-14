import java.util.LinkedList;

public class LL implements IStack {
    LinkedList<Integer> ll;

    public LL() {
        ll = new LinkedList<>();
    }

    @Override
    public void push(int data) {
        ll.add(data);
    }

    @Override
    public int pop() {
        if (ll.size() == 0) {
            throw new RuntimeException("Khali hai bhai hai stack");

        }
        return ll.pollLast();
    }

    @Override
    public int peek() {

        if (ll.size() == 0) {
            throw new RuntimeException("Khali hai bhai hai stack");
        }
        return ll.peekLast();
    }

    @Override
    public boolean isEmpty() {
        return ll.isEmpty();

    }

    @Override
    public int size() {
        return ll.size();
    }

    @Override
    public void display() {
        System.out.println(ll);
    }

}
