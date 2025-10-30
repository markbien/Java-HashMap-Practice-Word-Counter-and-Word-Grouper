
import java.util.Scanner;

public class HashMapPractice {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        WordCounter wc = new WordCounter();
        WordsByLengthCounter lc = new WordsByLengthCounter();
        UserInterface ui = new UserInterface(sc, wc, lc);
        ui.start();
    }
}
