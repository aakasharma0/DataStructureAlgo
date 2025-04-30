import java.util.ArrayList;
import java.util.List;

public class CombinationSum { // given that all the elements are distinct
    static List<Integer> li;
    static List<List<Integer>> ans;

    public static void helper(int nums[], int target, int idx) {
        if (target < 0 || idx == nums.length) {
            return;
        }
        if (target == 0) {
            ans.add(new ArrayList<>(li));
            return;
        }
        li.add(nums[idx]);
        helper(nums, target - nums[idx], idx);
        li.remove(li.size() - 1);
        helper(nums, target, idx + 1);

    }

    public static void main(String[] args) {
        li = new ArrayList<>();
        ans = new ArrayList<>();
        int candidates[] = { 2, 3, 6, 7 };
        int target = 7;
        helper(candidates, target, 0);
        System.out.println(ans.toString());
    }
}
