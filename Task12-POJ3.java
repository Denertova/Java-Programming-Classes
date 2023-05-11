import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number = scanner.next();

        // Usuwanie wiodących zer i ewentualnego zera po kropce
        String result = number.replaceFirst("^0+(?!$)", "").replaceAll("\\.?0*$", "");

        System.out.println(result);
    }
}