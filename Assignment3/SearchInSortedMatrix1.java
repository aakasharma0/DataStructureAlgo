public class SearchInSortedMatrix1 {

    public int helperOne(int[][] matrix, int target) {

        int start = 0;
        int end = matrix.length - 1;

        int col = matrix[0].length - 1;
        int res = -1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            int midElement = matrix[mid][col];
            if (mid == target) {
                return mid;
            }
            if (midElement == target) {
                return mid;
            } else if (midElement > target) {
                res = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }

        }

        return res;
    }

    public boolean helperTwo(int[][] matrix, int target, int row) {

        int start = 0;
        int end = matrix[0].length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            int midElement = matrix[row][mid];
            if (midElement == target) {
                return true;
            } else if (midElement > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        SearchInSortedMatrix1 obj = new SearchInSortedMatrix1();
        int[][] matrix = { { 1 }, { 3 }, { 5 } };
        int target = 1;
        int res = obj.helperOne(matrix, target);
        System.out.println(res);

    }
}
