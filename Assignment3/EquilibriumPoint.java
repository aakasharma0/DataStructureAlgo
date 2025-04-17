public class EquilibriumPoint {

    public static int secondApproach(int arr[]) {

        int n = arr.length;
        int[] prefix = new int[n];
        prefix[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];

        }

        for (int i = 1; i < n - 1; i++) {
            int leftSum = prefix[i - 1];
            int rightSum = prefix[n - 1] - prefix[i];
            if (leftSum == rightSum) {
                return i;
            }
        }

        return -1;
    }

    public static int firstApproach(int arr[]) {

        int n = arr.length;
        for (int i = 0; i < arr.length; i++) {

            int sumOnLeftSide = Integer.MAX_VALUE;
            int sumOnRightSide = Integer.MAX_VALUE;
            // calculate sum on leftSide // store in sumOnLeftSide
            for (int j = i - 1; j >= 0; j--) {
                sumOnLeftSide += arr[j];
            }
            // calculate sum on rightSide // store in sumOnRightSide
            for (int k = i + 1; k < n; k++) {
                sumOnRightSide += arr[k];
            }

            if (sumOnLeftSide != Integer.MAX_VALUE && sumOnRightSide != Integer.MAX_VALUE
                    && sumOnLeftSide == sumOnRightSide) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

    }
}