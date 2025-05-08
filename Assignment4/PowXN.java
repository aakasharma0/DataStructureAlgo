public class PowXN {

    public static double helper(double x, int n) { // this solution is okay but it will give tle

        if (n == 0)
            return 1;
        boolean isPos = n > 0;
        n = Math.abs(n);
        double ans = 1.0;

        for (int i = 0; i < n; i++) {
            ans = ans * x;
        }

        return isPos ? ans : 1 / ans;
    }

    public static double helperTwo(double x, int n) { // here in thi situation one constraint is
        // n cna be from integer range if i do math.abs of intmin it will overflow so
        // better to use long for n helper three using long and this is divide and
        // concqurer
        if (n == 0)
            return 1;
        if (n == 1)
            return x;

        double ans = helperTwo(x, n / 2);

        boolean isPositive = ((n & 1) == 0);

        ans = ans * ans;
        return isPositive ? ans : x * ans;

    }

    public static double helperTwo(double x, long n) { // here in thi situation one constraint is
        // n cna be from integer range if i do math.abs of intmin it will overflow so
        // better to use long for n helper three using long and this is divide and
        // concqurer
        if (n == 0)
            return 1;
        if (n == 1)
            return x;

        double ans = helperTwo(x, n / 2);

        boolean isPositive = ((n & 1) == 0);

        ans = ans * ans;
        return isPositive ? ans : x * ans;

    }

    public static void main(String[] args) {
        double x = 1.0000;
        int n = 2147483647;
        // System.out.println(helper(x, n));
        System.out.println(helperTwo(x, n));
    }
}
