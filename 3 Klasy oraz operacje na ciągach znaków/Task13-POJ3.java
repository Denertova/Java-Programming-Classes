import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String numbersOnly = input.replaceAll("['\\\\/:*?\"<>|+-.']", " ")
                                   .replaceAll("\\s+", " ")
                                   .trim();
        System.out.println(numbersOnly);
    }
}