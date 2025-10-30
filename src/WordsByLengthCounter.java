
import java.util.HashMap;
import java.util.ArrayList;

public class WordsByLengthCounter {

    private HashMap<Integer, ArrayList<String>> list;

    public WordsByLengthCounter() {
        list = new HashMap<>();
    }

    private void addWord(String word) {
        word = sanitize(word);
        int wordLength = word.length();

        ArrayList wordList = list.getOrDefault(wordLength, new ArrayList<>());
        if (!wordList.contains(word)) {
            wordList.add(word);
            list.put(wordLength, wordList);
        }
    }

    private String sanitize(String word) {
        return word.toLowerCase().trim();
    }

    public String toString() {
        String output = "";
        for (int length : list.keySet()) {
            output += "Word Length: [" + length + "]\n";
            int index = 1;
            for (String word : list.get(length)) {
                output += "\t" + index + ": " + word + "\n";
                index++;
            }
        }
        return output.trim();
    }

    public void addWords(String word) {
        String[] parts = word.split(" ");
        for (String part : parts) {
            addWord(part);
        }
    }
    
    public String getWordsWithLength(int length) {
        String output = "";
        ArrayList<String> wordList = list.getOrDefault(length, new ArrayList<>());
        
        if (wordList.isEmpty()) {
            output = "There are no words with this length.\n";
        } else {
            output += "There are [" + wordList.size() + "] words with [" +length + "] letters:\n";
            int index = 1;
            for (String word : wordList) {
                output += "\t" + index + ": " + word + "\n";
                index++;
            }
        }
        return output;
    }
}
