import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class MaxProductSubArray {
    public static int bruteForce(int arr[]) { // n cube
        int max = Integer.MIN_VALUE;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int product = 1;
                for (int k = i; k <= j; k++) {
                    product = product * arr[k];
                }
                max = Math.max(product, max);
            }
        }
        return max;

    }

    public static int optimized(int nums[]) {
        int prefix = 1;
        int suffix = 1;
        int max = Integer.MIN_VALUE;
        int n = nums.length;
        for (int i = 0; i < n; i++) {

            prefix = nums[i] * prefix;
            suffix = nums[n - i - 1] * suffix;

            max = Math.max(max, Math.max(prefix, suffix));

            if (prefix == 0)
                prefix = 1;
            if (suffix == 0)
                suffix = 1;

        }
        return max;
    }

    public int countCoveredBuildings(int d, int[][] buildings) {
        boolean leftCovered = false;
        boolean rightCovered = false;
        boolean topCovered = false;
        boolean bottomCovered = false;

        int ans = 0, n = buildings.length;

        for (int i = 0; i < n; i++) {
            int x = buildings[i][0];
            int y = buildings[i][1];

            for (int j = 0; j < n; j++) {
                if (i != j) {
                    int localX = buildings[j][0];
                    int localY = buildings[j][1];
                    if (localX > x && localY == y) {
                        rightCovered = true;
                    }
                    if (localX < x && localY == y) {
                        leftCovered = true;
                    }
                    if (localY > y && localX == x) {
                        topCovered = true;
                    }
                    if (localY < y && localX == x) {
                        bottomCovered = true;
                    }
                }
            }
            if (topCovered && bottomCovered && leftCovered && rightCovered) {
                ans++;
            }
            topCovered = bottomCovered = leftCovered = rightCovered = false;
        }
        return ans;
    }

    public int appraoch(int d, int[][] buildings) {

        HashMap<Integer, List<Integer>> map = new HashMap<>();
        int n = buildings.length;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            int x = buildings[i][0];
            int y = buildings[i][1];
            List<Integer> li = map.getOrDefault(x, map.getOrDefault(x, new ArrayList<>()));
            li.add(y);
            map.put(x, li);
        }
        for (Map.Entry<Integer, List<Integer>> set : map.entrySet()) {
            int x = set.getKey();
            if (x == d || x == 0)
                continue;
            List<Integer> li = set.getValue();
            int size = li.size();
            if (size > 2)
                ans += (size - 2);
        }
        return ans;
    }

    public static int appraoch3(int d, int[][] buildings) {

        int n = buildings.length;
        HashMap<Integer, int[]> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int x = buildings[i][0];
            int y = buildings[i][1];
            int[] arr = map.getOrDefault(x, new int[] { Integer.MAX_VALUE, Integer.MIN_VALUE });
            if (y < arr[0]) {
                arr[0] = y;
            }
            if (y > arr[1]) {
                arr[1] = y;
            }
            map.put(x, arr);
        }
        for (Map.Entry<Integer, int[]> set : map.entrySet()) {
            System.out.println(set.getKey() + " " + Arrays.toString(set.getValue()));
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            int x = buildings[i][0];
            int y = buildings[i][1];
            int arr[] = map.get(x);
            if (x == 1 || x == d)
                continue;
            if (y > arr[0] && y < arr[1]) {
                ans++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, -2, 4 };
        int arr2[][] = { { 1, 2 }, { 2, 2 }, { 3, 2 }, { 2, 1 }, { 2, 3 } };
        int n = 3;
        System.out.println(appraoch3(n, arr2));
    }
}
