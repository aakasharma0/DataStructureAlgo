public class MaximumNesting {

    public static int maxDepth(String s) {
        int max = 0;
        int openCount = 0;
        int n = s.length();
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (c == '(') {
                openCount++;
                max = Math.max(max, openCount);
            }
            if (c == ')') {
                openCount--;
            }
        }
        return max;

    }

    public static void main(String[] args) {

    }
    // link :
    // https://leetcode.com/problems/maximum-nesting-depth-of-the-parentheses/description/
}
