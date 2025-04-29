public class Ceil {
    public int findCeil(int[] arr, int target) {
        // code here
        int start = 0;
        int end = arr.length - 1, res = -1;
        while (start <= end) {

            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                res = mid;
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                res = mid;
                end = mid - 1;
            }

        }
        return res;
    }
}
