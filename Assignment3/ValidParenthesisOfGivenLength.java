public class ValidParenthesisOfGivenLength {

    static void gfgApproach(int open, int close, int[] ans) {
        if (open == 0 && close == 0) { // + ve base case
            ans[0]++;
        }
        if (open > close) { // -ve base case
            return;
        }
        if (open > 0) {
            gfgApproach(open - 1, close, ans);
        }
        if (close > 0) { // in my case i will stop it here only
            gfgApproach(open, close - 1, ans);
        }

    }

    public static void main(String[] args) {
        // if n is odd return

        int n = 4;
        int[] ans = { 0 };
        gfgApproach(n / 2, n / 2, ans);
        System.out.println(ans[0]);

    }
}
