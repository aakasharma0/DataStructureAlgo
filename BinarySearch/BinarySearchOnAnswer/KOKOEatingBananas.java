import java.util.Arrays;
import java.util.stream.IntStream;

public class KOKOEatingBananas {

    public static int helper(int[] piles, int h) {

        int max = Arrays.stream(piles).max().getAsInt();

        int start = 1, end = max;
        int res = max; // at start asnwer will be max that is why

        while (start < end) {
            int mid = start + (end - start) / 2;

            long hoursNeeded = calHours(piles, mid); // here long is much needed thing beacuse int can over flow so
                                                     // mostly use long else int for calculatioon like this
            System.out.println(mid + " " + hoursNeeded);
            if (hoursNeeded <= h) {
                end = mid - 1;
                res = mid;
            } else {
                start = mid + 1;
            }

        }

        return res;
    }

    public static long calHours(int[] piles, int k) { // here very important observation for using long

        long hoursNeeded = 0;
        for (int pile : piles) {
            hoursNeeded += (pile + k - 1) / k; // (int) Math.ceil((double) pile / k); precision in double can never be
                                               // correct so to dp
            // hoursNeeded += (int)((pile + (long)k - 1) / k); needed to understand this

        }
        System.out.println(hoursNeeded);
        return hoursNeeded;
    }

    public static void main(String[] args) {
        int[] piles = { 805306368, 805306368, 805306368 };
        int h = 1000000000;
        System.out.println(helper(piles, h));
    }
}

// 2 / 3 -> ceil 1 4/3
