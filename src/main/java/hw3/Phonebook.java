package hw3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Phonebook {
    private HashMap<String, Set<String>> phonebook = new HashMap<>();
    public void add (String name, String phone){
        Set<String> note = phonebook.getOrDefault(name, new HashSet<>());
        note.add(phone);
        phonebook.put(name, note);
    }
    public Set<String> get(String name) { return phonebook.get(name);}
}
