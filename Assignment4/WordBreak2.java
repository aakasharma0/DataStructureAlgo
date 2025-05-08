import java.util.HashSet;
import java.util.List;

public class WordBreak2 {

    public void helper(String s, String ans, HashSet<String> set, List<String> li) {

        if (s.length() == 0) {
            li.add(ans);
        }
        int n = s.length();
        for (int i = 0; i < n; i++) {
            String temp = s.substring(0, i + 1);
            if (set.contains(temp)) {
                helper(s.substring(i + 1), ans + " " + temp, set, li);
            }
        }
    }
}
