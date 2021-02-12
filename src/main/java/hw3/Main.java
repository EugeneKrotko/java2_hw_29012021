package hw3;

import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
    String[] words = {"tree", "beer","foot", "tree", "foot", "door", "bear", "week","vibe", "neck", "rose", "week", "bike", "beer"};
    System.out.println(Arrays.toString(words));

        HashMap<String, Integer> hashMap = new HashMap<>();
        for (String x : words){
            hashMap.put(x, hashMap.getOrDefault(x, 0) + 1);
        }
        System.out.println(hashMap);
    }
}
