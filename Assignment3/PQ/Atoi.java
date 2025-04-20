package PQ;

public class Atoi {
    public int myAtoi(String s) {
        int n = s.length();
        // s = s.trim();
        int ans = 0;

        boolean foundCharacter = false;
        boolean signFound = false;
        boolean isPositive = true;

        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (!foundCharacter && c == ' ') {
                continue;
            }

            if (!signFound && (c == '+' || c == '-')) {
                signFound = true;
                foundCharacter = true;
                if (c == '-')
                    isPositive = false;
                continue;
            }

            if (c >= '0' && c <= '9') {
                int number = c - '0';
                if (isPositive) {
                    if (ans > (Integer.MAX_VALUE - number) / 10) {
                        return Integer.MAX_VALUE;
                    }

                } else {
                    if (ans > (Integer.MAX_VALUE - number) / 10) {
                        return Integer.MIN_VALUE;
                    }
                }

                // if (ans > (Integer.MAX_VALUE - number) / 10) {
                // return isPositive ? Integer.MAX_VALUE : Integer.MIN_VALUE;

                ans = ans * 10 + number;
                signFound = true;
                foundCharacter = true;
            } else {
                break;
            }

        }
        return isPositive ? ans : ans * (-1);

    }

    public int myAtoiTwo(String s) {
        int n = s.length();
        // s = s.trim();
        long ans = 0;

        boolean foundCharacter = false;
        boolean signFound = false;
        boolean isPositive = true;

        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (!foundCharacter && c == ' ') {
                continue;
            }

            if (!signFound && (c == '+' || c == '-')) {
                signFound = true;
                foundCharacter = true;
                if (c == '-')
                    isPositive = false;
                continue;
            }

            if (c >= '0' && c <= '9') {

                int number = c - '0';
                ans = ans * 10 + number;
                if (ans > Integer.MAX_VALUE) {
                    return isPositive ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                }
                signFound = true;
                foundCharacter = true;

            } else {
                break;
            }

        }
        return isPositive ? (int) ans : (int) ans * (-1);

    }
}
