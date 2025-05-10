public class CountGoodNumbers {
    static final int MOD = 1_000_000_007; //

    public static int helperTwo(int x, long n) { // here in thi situation one constraint is
        // n cna be from integer range if i do math.abs of intmin it will overflow so
        // better to use long for n helper three using long and this is divide and
        // concqurer
        if (n == 0)
            return 1;
        if (n == 1)
            return x;

        long ans = helperTwo(x, n / 2);

        boolean isEven = ((n & 1) == 0);

        ans = (ans * ans) % MOD;

        if (!isEven) {
            ans = (x * ans) % MOD;
        }
        return (int) ans;
    }

    public static int countGoodNumbers(long n) {

        long evenPlaces = (n + 1) / 2;
        long oddPlaces = n - evenPlaces;

        long res1 = helperTwo(5, evenPlaces);
        long res2 = helperTwo(4, oddPlaces);
        int ans = (int) ((res1 * res2) % MOD);
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(countGoodNumbers(50));
    }
}
