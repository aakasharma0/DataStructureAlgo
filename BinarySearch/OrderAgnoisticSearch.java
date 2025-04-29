public class OrderAgnoisticSearch {
    // simple binary search just need to what order it is then take deicison bases
    // of that

    public static int BS(int arr[], int target) {

        if (arr == null)
            return -1;
        int start = 0, end = arr.length - 1;
        boolean iAsc = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (iAsc) {
                if (arr[mid] > target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (arr[mid] > target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 4, 5, 6, 7 };
        int nums2[] = { 7, 6, 5, 4, 3, 2, 1 };
        System.out.println(BS(nums, 7));
        System.out.println(BS(nums2, 7));
    }
}
