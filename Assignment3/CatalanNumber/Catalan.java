package CatalanNumber;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Catalan {

    static int catalan(int n, int[] dp) {

        if (n <= 1)
            return 1;

        if (dp[n] != -1)
            return dp[n];
        int res = 0;
        for (int i = 0; i <= n - 1; i++) {
            res += catalan(i, dp) * catalan(n - i - 1, dp);
        }
        return dp[n] = res;
    }

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            int[] dp = new int[i + 1];
            Arrays.fill(dp, -1);
            System.out.println(catalan(i, dp));

        }
    }
}
