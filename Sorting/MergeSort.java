public class MergeSort extends Sorting {

    @Override
    public void sort() {
        // int arr[] = this.arr;
        mergeSort(0, arr.length - 1, arr);

    }

    private void mergeSort(int start, int end, int arr[]) {
        if (start == end) {
            return;
        }
        int mid = (start + end) / 2;
        mergeSort(start, mid, arr);
        mergeSort(mid + 1, end, arr);
        merge(start, end, mid, arr);

    }

    private void merge(int start, int end, int mid, int arr[]) {
        int[] tempArray = new int[end - start + 1];
        int startIndexFirstArray = start;
        int startIndexSecondArray = mid + 1;
        int tempArrayIndex = 0;

        while (startIndexFirstArray <= mid && startIndexSecondArray <= end) {
            if (arr[startIndexFirstArray] <= arr[startIndexSecondArray]) {
                tempArray[tempArrayIndex++] = arr[startIndexFirstArray++];
            } else {
                tempArray[tempArrayIndex++] = arr[startIndexSecondArray++];
            }
        }
        while (startIndexFirstArray <= mid) {
            tempArray[tempArrayIndex++] = arr[startIndexFirstArray++];
        }
        while (startIndexSecondArray <= end) {
            tempArray[tempArrayIndex++] = arr[startIndexSecondArray++];
        }
        for (int i = 0; i < tempArray.length; i++) {
            arr[start + i] = tempArray[i];
        }
    }

}
