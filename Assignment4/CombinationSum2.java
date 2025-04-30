import java.util.*;

public class CombinationSum2 {
    static List<Integer> li;
    static List<List<Integer>> ans;

    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        li = new ArrayList<>();
        ans = new ArrayList<>();

        Arrays.sort(candidates);
        System.out.println(Arrays.toString(candidates));
        helper(candidates, target, 0);
        return ans;
    }

    public static void helper(int nums[], int target, int idx) {
        if (target < 0 || idx == nums.length) {
            return;
        }
        if (target == 0) {
            ans.add(new ArrayList<>(li));
            return;
        }
        li.add(nums[idx]);
        helper(nums, target - nums[idx], idx + 1);
        li.remove(li.size() - 1);
        helper(nums, target, idx + 1);

    }

    public static void main(String[] args) {

        int[] candidates = { 1, 2, 1, 2, 3, 3, 1 };
        int target = 3;

        combinationSum2(candidates, target);
        System.out.println(ans.toString());
    }
}
