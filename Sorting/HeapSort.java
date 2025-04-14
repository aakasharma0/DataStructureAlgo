public class HeapSort extends Sorting {

    @Override
    public void sort() {
        this.arr = new int[] { 1, 5, 3, 2 };
        int n = arr.length;
        for (int i = (n / 2) - 1; i >= 0; i--) {
            heapify(arr, i, n);
        }

        for (int i = n - 1; i >= 0; i--) {
            int temp = arr[i];
            arr[i] = arr[0];
            arr[0] = temp;
            heapify(arr, 0, i);
        }
    }

    public void heapify(int arr[], int currIdx, int end) {

        int leftIdx = 2 * currIdx + 1;
        int rightIdx = 2 * currIdx + 2;
        int max = currIdx;
        if (leftIdx < end && arr[max] < arr[leftIdx]) {
            max = leftIdx;
        }
        if (rightIdx < end && arr[max] < arr[rightIdx]) {
            max = rightIdx;
        }
        if (max != currIdx) {
            int temp = arr[max];
            arr[max] = arr[currIdx];
            arr[currIdx] = temp;
            heapify(arr, max, end);
        }
    }
}
