
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortVowels {
    public String sortVowels(String s) {
        List<Character> li = new ArrayList<>();

        char[] arr = s.toCharArray();
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            char c = arr[i];
            if (isVowel(c))
                li.add(c);
        }

        Collections.sort(li, new Comparator<Character>() {
            @Override
            public int compare(Character a, Character b) {
                return a - b; // simpler
            }
        });
        int vowelIdx = 0;
        for (int i = 0; i < n; i++) {
            char c = arr[i];
            if (isVowel(c)) {
                arr[i] = li.get(vowelIdx++);
                // li.remove(0); // his will o(k2) complexity as it depends on the number of
                // vowels
            }
        }
        return new String(arr);
    }

    public boolean isVowel(char c) {

        return "AEIOUaeiou".indexOf(c) >= 0;
    }
}
