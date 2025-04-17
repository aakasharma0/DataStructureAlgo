public class IntegerToRoman {
    public String intToRoman(int num) {

        String ans = "";
        while (num > 0) {
            if (num >= 1000) {
                ans += "M";
                num = num - 1000;
            } else if (num >= 900) {
                ans += "CM";
                num = num - 900;
            } else if (num >= 500) {
                ans += "D";
                num = num - 500;
            } else if (num >= 400) {
                ans += "CD";
                num = num - 400;
            } else if (num >= 100) {
                ans += "C";
                num = num - 100;
            } else if (num >= 90) {
                ans += "XC";
                num = num - 90;
            } else if (num >= 50) {
                ans += "L";
                num = num - 50;
            } else if (num >= 40) {
                ans += "XL";
                num = num - 40;
            } else if (num >= 10) {
                ans += "X";
                num = num - 10;
            } else if (num >= 9) {
                ans += "IX";
                num = num - 9;
            } else if (num >= 5) {
                ans += "V";
                num = num - 5;
            } else if (num >= 4) {
                ans += "IV";
                num = num - 4;
            } else {
                ans += "I";
                num = num - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {

    }
    // link :https://leetcode.com/problems/integer-to-roman/
}
