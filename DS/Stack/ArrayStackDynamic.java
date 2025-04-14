public class ArrayStackDynamic extends ArrayStack {

    @Override
    public void push(int data) {
        if (tos + 1 == this.data.length) {
            int[] tempArray = new int[this.data.length * 2];
            for (int i = 0; i < this.data.length; i++) {
                tempArray[i] = this.data[i];
            }
            this.data=tempArray;
        }
        tos++;
        this.data[tos] = data;
    }
}