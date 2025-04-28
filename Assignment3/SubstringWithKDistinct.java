import java.util.HashMap;

public class SubstringWithKDistinct {
    public static int countSubstr(String s, int k) {
        HashMap<Character, Integer> map = new HashMap<>();
        int count = 0;
        int start = 0, end = 0, n = s.length();
        while (end < n) {
            System.out.println(start + "  " + end);
            map.put(s.charAt(end), map.getOrDefault(s.charAt(end), 0) + 1);
           
            if (map.size() < k) {
                end++;
            }
            else if (map.size() == k) {
                count++;
                end++;
            } 
             else {
                while (map.size()<=k) {
                    
                }
                int countStart = map.get(s.charAt(start));
                countStart--;
                if (countStart == 0) {
                    map.remove(s.charAt(start));
                } else {
                    map.put(s.charAt(start), countStart);
                }
                start++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countSubstr("aba", 2));
    }
}
