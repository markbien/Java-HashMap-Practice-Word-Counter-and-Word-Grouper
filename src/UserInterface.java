
import java.util.Scanner;

public class UserInterface {

    private Scanner scanner;
    private WordCounter wc;
    private WordsByLengthCounter lc;

    public UserInterface(Scanner scanner, WordCounter wc, WordsByLengthCounter lc) {
        this.scanner = scanner;
        this.wc = wc;
        this.lc = lc;
    }

    public void start() {
        while (true) {
            System.out.println("Available commands: ");
            System.out.println("\t[A] - To add word(s)");
            System.out.println("\t[C] - To view count of a specific word");
            System.out.println("\t[V] - To view counts of all words");
            System.out.println("\t[L] - To view all words with the specified length");
            System.out.println("\t[W] - To view all word lengths with their words");
            System.out.println("\t[Q] - To quit the program");
            System.out.print("Enter your command: ");
            String cmd = scanner.nextLine().toLowerCase();

            if (cmd.equals("a")) {
                System.out.print("Enter your words: ");
                String words = scanner.nextLine();
                wc.addWords(words);
                lc.addWords(words);
            } else if (cmd.equals("c")) {
                System.out.print("Which word to view the count: ");
                String word = scanner.nextLine();

                System.out.println("The word: [" +word + "] has [" + wc.getWordCount(word) + "] instances.\n");
            } else if (cmd.equals("q")) {
                break;
            } else if (cmd.equals("v")) {
                System.out.println(wc);
                System.out.println("");
            } else if(cmd.equals("l")) {
                System.out.print("Enter the length of words to show: ");
                int length = Integer.valueOf(scanner.nextLine());
                System.out.println(lc.getWordsWithLength(length));
            } else if (cmd.equals("w")) {
                System.out.println(lc);
                System.out.println("");
            }
            else {
                System.out.println("The command: [" + cmd + "] is invalid.\nPlease enter a valid command.\n");
            }
        }
    }
}
