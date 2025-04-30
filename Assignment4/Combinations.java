import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Combinations {
    public static void helper(int n, int k, int prevAdded, HashSet<Integer> set, List<Integer> li,
            List<List<Integer>> masterList) {

        if (k == 0) {
            List<Integer> ans = new ArrayList<>(li);
            masterList.add(ans);
            return;
        }

        for (int i = 1; i <= n; i++) {
            if (i > prevAdded) {

                if (!set.contains(i)) {
                    li.add(i);
                    set.add(i);
                    helper(n, k - 1, i, set, li, masterList);
                    set.remove(i);
                    li.remove(li.size() - 1);
                }
            }
        }

    }

    public static void helperTwo(int n, int k, int prevAdded, HashSet<Integer> set, List<Integer> li,
            List<List<Integer>> masterList) {

        if (k == 0) {
            List<Integer> ans = new ArrayList<>(li);
            masterList.add(ans);
            return;
        }

        for (int i = prevAdded + 1; i <= n; i++) {

            if (!set.contains(i)) {
                li.add(i);
                set.add(i);
                helper(n, k - 1, i, set, li, masterList);
                set.remove(i);
                li.remove(li.size() - 1);
            }

        }

    }

    public static void main(String[] args) {
        int n = 4;
        int k = 2;

        List<List<Integer>> ans = new ArrayList<>();
        helper(n, k, 0, new HashSet<>(), new ArrayList<>(), ans);
        System.out.println(ans.toString());
    }
}
