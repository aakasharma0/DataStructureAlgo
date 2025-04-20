package PQ;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;

public class PQDemoOnMap {

    public static void main(String[] args) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('a', 20);
        map.put('b', 21);
        map.put('c', 23);
        map.put('d', 41);
        map.put('e', 61);

        PriorityQueue<Map.Entry<Character, Integer>> pqEntrySet = new PriorityQueue<>(
                new Comparator<Map.Entry<Character, Integer>>() {

                    @Override
                    public int compare(Entry<Character, Integer> o1, Entry<Character, Integer> o2) {
                        return o2.getValue() - o1.getValue();
                    }

                });
        pqEntrySet.addAll(map.entrySet());
        while (!pqEntrySet.isEmpty()) {
            Map.Entry<Character, Integer> set = pqEntrySet.poll();
            System.out.println(set.getKey() + " " + set.getValue());
        }

        List<Character> li = new ArrayList<>();

        li.addAll(Arrays.asList('a', 'A', 'b'));

        Collections.sort(li, new Comparator<Character>() {
            @Override
            public int compare(Character a, Character b) {
                return a - b; // simpler
            }
        });

    }
}
