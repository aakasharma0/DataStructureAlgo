public class Floor {
    static int findFloor(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1, res = -1;
        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                res = mid;
                start = mid + 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
                res = mid;
            } else {
                end = mid - 1;
            }

        }
        return res;
    }
}
