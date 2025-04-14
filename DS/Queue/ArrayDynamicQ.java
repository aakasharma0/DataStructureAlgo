public class ArrayDynamicQ extends QUsingArray {

    @Override
    public void push(int data) {
        if (size == this.data.length) {
            int temp[] = new int[this.data.length * 2];
            for (int i = 0; i < this.data.length; i++) {
                temp[i] = this.data[i];
            }
            this.data = temp;
        }
        int idx = front + size;
        idx = idx % this.data.length;
        this.data[idx] = data;
        size++;
        front = front % this.data.length;
    }
}
