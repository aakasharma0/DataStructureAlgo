import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Permutations2 {
    static List<Integer> li;
    static List<List<Integer>> ans;
    static HashSet<Integer> set;

    public static void helper(int[] nums, int hashArray[]) { // here i am using hashset

        if (li.size() == nums.length) {
            ans.add(new ArrayList<>(li));
        }
        for (int i = 0; i < nums.length; i++) {

            if (hashArray[i] == 1)
                continue;
            if (i > 0 && nums[i - 1] == nums[i] && hashArray[i - 1] == 0)
                continue;
            // if (hashArray[i] == 1 || (i > 0 && nums[i] == nums[i - 1] && hashArray[i - 1]
            // == 0))
            // continue;
            li.add(nums[i]);
            hashArray[i] = 1;
            helper(nums, hashArray);
            li.remove(li.size() - 1);
            hashArray[i] = 0;

        }
    }

    public static void main(String[] args) {
        li = new ArrayList<>();
        ans = new ArrayList<>();
        set = new HashSet<>();
        int nums[] = { 1, 1, 2, };
        Arrays.sort(nums);
        helper(nums, new int[nums.length]);
        System.out.println(ans.toString());

    }
}
