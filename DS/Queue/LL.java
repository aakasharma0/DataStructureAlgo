import java.util.LinkedList;

public class LL implements IQueue {

    LinkedList<Integer> ll;

    public LL() {
        ll = new LinkedList<>();
    }

    @Override
    public int size() {
        return ll.size();
    }

    @Override
    public int peek() {
        if (ll.isEmpty()) {
            throw new RuntimeException("Khali hai bhai hai stack");
        }
        return ll.peekLast();
    }

    @Override
    public int pop() {
        if (ll.isEmpty()) {
            throw new RuntimeException("Khali hai bhai hai stack");
        }
        return ll.poll();
    }

    @Override
    public void push(int data) {
        ll.addFirst(data);

    }

    @Override
    public boolean isEmpty() {
        return ll.size()==0;
    }

    @Override
    public void display() {

        System.out.println(ll);
    }

}
