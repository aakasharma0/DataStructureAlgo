public class ArrayStack implements IStack {

    protected int[] data;
    int tos;

    public ArrayStack() {
        tos = -1;
        data = new int[5];
    }

    @Override
    public void push(int data) {
        // while pushing we need to take care about capacity of stack
        if (tos + 1 == this.data.length) {
            System.out.println("Stack is out of capacity");
            return;
        }
        tos++;
        this.data[tos] = data;
    }

    @Override
    public int pop() {
        if (tos == -1) {
            throw new RuntimeException("Stack is Empty");
        }
        int data = this.data[tos];
        tos--;
        return data;
    }

    @Override
    public int peek() {
        if (tos == -1) {
            throw new RuntimeException("Stack is Empty");
        }
        int data = this.data[tos];
        return data;
    }

    @Override
    public boolean isEmpty() {
        return tos == -1;
    }

    @Override
    public int size() {
        if (tos == -1) {
            throw new RuntimeException("Stack is Empty \\");
        }
        return tos + 1;

    }

    @Override
    public void display() {
        if (tos == -1) {
            throw new RuntimeException("Stack is Empty");
        }
        for (int i = tos; i >= 0; i--) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }

}
