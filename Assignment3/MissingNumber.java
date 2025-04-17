public class MissingNumber {

    int missingNumber(int arr[]) {
        // code here
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int num = Math.abs(arr[i]);
            if (num - 1 != n) {
                arr[num - 1] = arr[num - 1] * (-1);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0)
                return i + 1;
        }

        return n + 1;
    }

    public static void main(String[] args) {
        // link :https://www.geeksforgeeks.org/problems/missing-number-in-array1416/1
    }
}
