
import java.util.HashMap;

public class WordCounter {

    private HashMap<String, Integer> hm;

    public WordCounter() {
        hm = new HashMap<>();
    }

    private void addOneWord(String word) {
        word = sanitize(word);
        int instances = hm.getOrDefault(word, 0);
        instances++;
        hm.put(word, instances);
    }
    
    public int getWordCount(String word) {
        word = sanitize(word);
        return hm.getOrDefault(word, 0);
    }
    
    public void addWords(String words) {
        words = sanitize(words);
        String[] parts = words.split(" ");
        
        for (String word : parts) {
            addOneWord(word);
        }
    }
    
    private String sanitize(String word) {
        return word.toLowerCase().trim();
    }
    
    public String toString() {
        String output = "";
        for (String key : hm.keySet()) {
            output += key + ": " + hm.get(key) + "\n";
        }
        
        return !output.isEmpty() ? output.trim() : "There are no words to count. Please add words.";
    }
}
