public class SearchInsertPostion {
    public int searchInsert(int[] A, int target) {

        int start = 0;
        int end = A.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (A[mid] == target) {
                return mid;
            } else if (A[mid] > target) {
                end = mid - 1;
            } else if (A[mid] < target) {
                start = mid + 1;
            }

        }
        return start;
    }

    // start will always be one value next to given target always
}
