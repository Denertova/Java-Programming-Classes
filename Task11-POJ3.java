import java.util.Objects;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String letter = input.next();
        if (Objects.equals(letter, "z")) {
            System.out.println ("a");
        }
        else {
            char nextLetter = (char) (letter.charAt(0) + 1);

        System.out.println(nextLetter);
        }
    }
}