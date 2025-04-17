public class SearchInSortedMatrix2 {
    public boolean searchMatrix(int[][] matrix, int target) {

        // int res=floorForTargetInCol(matrix,target);

        // while(res>=0){
        // if(BS(matrix,target,res)) return true;
        // res--;
        // }
        // return false;
        return helper(matrix, target);

    }

    public static boolean helper(int[][] matrix, int target) {

        int row = 0;
        int col = matrix[0].length - 1;

        while (col >= 0 && row < matrix.length) {

            int element = matrix[row][col];
            System.out.println(row + " " + col);
            if (element == target) {
                return true;
            } else if (element < target) {
                row++;
            } else {
                col--;
            }

        }
        return false;
    }

    public int floorForTargetInCol(int[][] matrix, int target) {
        int start = 0;
        int end = matrix[0].length - 1;
        int row = 0;
        int res = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            int midElement = matrix[row][mid];

            if (midElement == target) {
                return mid;
            } else if (midElement > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
                res = mid;
            }
        }
        return res;

    }

    public boolean BS(int[][] matrix, int target, int col) {

        int start = 0;
        int end = matrix.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            int midElement = matrix[mid][col];

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
}
