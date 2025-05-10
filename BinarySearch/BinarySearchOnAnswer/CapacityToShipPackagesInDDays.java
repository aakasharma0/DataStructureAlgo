import java.util.Arrays;

public class CapacityToShipPackagesInDDays {

    public static int helper(int[] weights, int days) {

        int sum = Arrays.stream(weights).sum();
        int minWeightCapacity = Arrays.stream(weights).max().getAsInt();

        System.out.println("Sum of Weights: " + sum + " Minimum Weight capacity: " + minWeightCapacity);
        int start = minWeightCapacity, end = sum;
        int res = end;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            int numOfDaysAtCurrentCapacity = getDaysUsingCapacity(weights, mid);
            System.out.println("Current capacity decided is: " + mid + " Number Of days at current capacity: "
                    + numOfDaysAtCurrentCapacity);
            if (numOfDaysAtCurrentCapacity <= days) {
                res = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return res;

    }

    static int getDaysUsingCapacity(int[] weights, int capacity) { // i was commiting mistake here

        int days = 1; // Start with day 1
        int currCapacity = 0;

        for (int weight : weights) {
            if (currCapacity + weight > capacity) {
                days++;
                currCapacity = 0;
            }
            currCapacity += weight;
        }

        return days;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int days = 5;
        System.out.println(helper(arr, days));
    }
}
