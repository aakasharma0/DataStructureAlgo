public class IsAnagram {
    public boolean isAnagram(String s, String t) {
        int[] arr = new int[26];

        int n = s.length();
        int m = t.length();
        if (n != m)
            return false;
        for (int i = 0; i < n; i++) {
            char sc = s.charAt(i);
            char tc = t.charAt(i);
            if (sc != tc) { // theis can be one last optimization
                arr[sc - 'a']++;
                arr[tc - 'a']--;
            }

        }
        for (int i = 0; i < 26; i++) {
            if (arr[i] != 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {

    }

    // link: https://leetcode.com/problems/valid-anagram/
}
