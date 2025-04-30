public class FindEleInRotatedSortedArr2 {
    public static int findMin(int[] arr) {
        int start = 0;
        int end = arr.length - 1; // -1
        int n = arr.length;
        while (start < end && arr[start] == arr[end]) {
            start++;
        }
        while (start <= end) {

            if (arr[start] <= arr[end])
                return start;
            int mid = start + (end - start) / 2; // 0
            int prev = mid - 1 == -1 ? n - 1 : mid - 1; // 0
            int next = mid + 1 == n ? 0 : mid + 1; // 0

            if ((arr[mid] < arr[prev])) { // condition for identifying mid element
                return mid;
            } else if (arr[mid] >= arr[start]) { // if left part sorted go for right
                start = mid + 1;
            } else { // go to right
                end = mid - 1;
            }
        }
        return -1;
    }

    static int BS(int arr[], int start, int end, int target) {

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            }
        }

        return -1;

    }

    public static void main(String[] args) {

        int arr[] = { 1, 0, 1, 1, 1 };
        int target = 0;

        int minElementIdx = findMin(arr);
        int idx = -1;
        if (minElementIdx == 0) {
            idx = BS(arr, 0, arr.length - 1, target);
        } else if (target >= arr[0] && target <= arr[minElementIdx - 1]) {
            idx = BS(arr, 0, minElementIdx - 1, target);
        } else {
            idx = BS(arr, minElementIdx, arr.length - 1, target);
        }
        System.out.println(idx);

        // System.out.println(approachTwo(target, arr));
    }
}