public class BinarySearchRecurisve {

    public static int BS(int[] nums, int target, int start, int end) {
        if (start > end)
            return -1;

        int mid = start + (end - start) / 2;

        if (nums[mid] == target)
            return mid;

        if (nums[mid] > target) {
            return BS(nums, target, start, mid - 1);
        } else {
            return BS(nums, target, mid + 1, end);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int target = 10;
        System.out.println(target + " is on index :" + BS(arr, target, 0, arr.length));
    }
}