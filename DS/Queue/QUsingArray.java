public class QUsingArray implements IQueue {

    int data[];
    int front;
    int size;

    public QUsingArray() {
        this.data = new int[5];
        front = size = 0;
    }

    @Override
    public int size() {
        return size;

    }

    @Override
    public int peek() {
        return data[front];
    }

    @Override
    public int pop() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty ");
        }
        int ans = data[front];
        front++;
        size--;
        return ans;

    }

    @Override
    public void push(int data) {
        if (size == this.data.length) {
            throw new RuntimeException(" Queue ki capacity full hai Bhai");
        }
        int idx = front + size;
        idx = idx % this.data.length;
        this.data[idx] = data;
        size++;
        front = front % this.data.length;

    }

    @Override
    public boolean isEmpty() {

        return size == 0;
    }

    @Override
    public void display() {
        for (int i = 0; i < size; i++) {
            int idx = front + i;
            idx = idx % data.length;
            System.out.print(data[idx] + " ");
        }
        System.out.println();
    }

}
