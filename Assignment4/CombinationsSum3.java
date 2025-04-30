import java.util.ArrayList;
import java.util.List;

public class CombinationsSum3 {

    static List<Integer> li;
    static List<List<Integer>> ans;

    public static void helper(int n, int k, int prevIndex) {
        if (k < 0) {
            return;
        }
        if (k == 0 && n == 0) {
            ans.add(new ArrayList<>(li));
        }

        for (int i = prevIndex + 1; i <= 9; i++) {
            li.add(i);
            helper(n - i, k - 1, i);
            li.remove(li.size() - 1);
        }
    }

    public static void main(String[] args) {
        li = new ArrayList<>();
        ans = new ArrayList<>();
        int n = 3, k = 9;
        helper(9, 3, 0);
        System.out.println(ans.toString());
    }
}
