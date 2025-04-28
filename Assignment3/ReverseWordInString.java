import java.util.Arrays;
import java.util.Stack;

public class ReverseWordInString {
    public static String reverseWords(String s) {

        Stack<String> stk = new Stack<>();
        int n = s.length();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);

            if (c != ' ') {
                sb.append(c);
            } else {
                if (sb.length() != 0) {
                    stk.push(sb.toString());
                    sb.setLength(0);
                }
            }
            if (i == n - 1 && sb.length() != 0)
                stk.push(sb.toString());
        }
        sb.setLength(0);
        while (!stk.isEmpty()) {
            sb.append(stk.pop()).append(" ");
        }
        return sb.toString();
    }

    public static String reverseWordTwo(String s) {
        char[] arr = s.toCharArray();
        int n = s.length();
        System.out.println(n);
        reverse(arr, 0, n - 1);
        int i = 0, r = 0, l = 0;
        while (r < n) {
            System.out.println(i + " " + r + " " + " " + l + " :" + Arrays.toString(arr));

            if (arr[r] == ' ') {
                l++;
                r++;
            } else {

                while (r < n && r + 1 < n && arr[r + 1] != ' ') {
                    r++;
                }
                reverse(arr, i, r);

                i = i + r - l + 2;
                l = r = r + 1;

            }
        }
        String ans = new String(arr, 0, i - 1);
        return ans;
    }

    public static void reverse(char[] arr, int i, int j) {
        while (i < j) {
            {
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }

        }
    }

    public static void main(String[] args) {
        String s = reverseWordTwo("the sky is blue    ");
        System.out.println(s);
    }
}
