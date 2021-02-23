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

    Phonebook phNote = new Phonebook();
    phNote.add("John", "567629485");
    phNote.add("Ben", "2478247847");
    phNote.add("Ivan","979375375");
    phNote.add("David","83985856853");
    phNote.add("Carl","8359835984");
    phNote.add("Sam","65873568735");

        System.out.println("Phone" + phNote.get("David"));
        System.out.println("Phone" + phNote.get("Ivan"));

    }
}
