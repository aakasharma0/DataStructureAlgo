public class ReverseString {
    public void helper(char[] s, int sp, int ep) {
        if (sp >= ep)
            return;

        char temp = s[sp];
        s[sp] = s[ep];
        s[ep] = temp;
        helper(s, sp + 1, ep - 1);
    }

    public static void main(String[] args) {
        // nice concept like combining 2 pointer and recursion
    }
}