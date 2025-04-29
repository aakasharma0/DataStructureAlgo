public class FindMinimumInRotatedSorted {

    public int findMin(int[] arr) {
        int start = 0;
        int end = arr.length - 1; // -1
        int n = arr.length;
        while (start <= end) {

            if (arr[start] <= arr[end])
                return arr[start];
            int mid = start + (end - start) / 2; // 0
            int prev = mid - 1 == -1 ? n - 1 : mid - 1; // 0
            int next = mid + 1 == n ? 0 : mid + 1; // 0

            if (arr[mid] < arr[prev] && arr[mid] < arr[next]) {
                return arr[mid];
            } else if (arr[mid] >= arr[start]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
