import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.io.IOException;
class PangramChecker {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        boolean isPangram = isPangram(text);
        System.out.println(isPangram);
    }

    public static boolean isPangram(String text) {
        Set<Character> alphabet = new HashSet<>();
        for (char c = 'a'; c <= 'z'; c++) {
            alphabet.add(c);
        }
        for (int i = 0; i < text.length(); i++) {
            char c = Character.toLowerCase(text.charAt(i));
            alphabet.remove(c);
            if (alphabet.isEmpty()) {
                return true;
            }
        }
        return false;
    }
}