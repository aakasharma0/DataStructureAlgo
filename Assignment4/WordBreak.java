import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class WordBreak {
    public static boolean helper(String s, List<String> li) { // this approach wont work

        HashSet<String> set = new HashSet<>();
        for (String _s : li) {
            set.add(_s);
        }
        int n = s.length();
        boolean flag = false;
        for (int i = 0; i < n;) {
            String temp = "";
            flag = false;
            while (i < n && !set.contains(temp)) {
                temp += s.charAt(i);
                i++;
            }
            // System.out.println(temp + " " + i + " " + n);
            if (i != n) {
                flag = true;
                temp = "";
            } else {
                if (set.contains(temp)) {
                    flag = true;
                }
            }

        }
        return flag;
    }

    public static boolean helper2(String s, HashSet<String> set) {

        if (s.length() == 0) {
            return true;
        }
        int n = s.length();
        for (int i = 0; i < n; i++) {
            String temp = s.substring(0, i + 1);
            if (set.contains(temp)) {
                if (helper2(s.substring(i + 1), set)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String s = "aaaaaaa";
        String[] arr = { "aaaa", "aaa" };
        List<String> li = Arrays.asList(arr);
        HashSet<String> set = new HashSet<>(li);
        System.out.println(helper2(s, set));

    }
}
