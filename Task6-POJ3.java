import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String T = input.nextLine();
        String K = input.nextLine();
        String tlow = T.toLowerCase();
        String klow = K.toLowerCase();

        if (tlow.contains(klow)) {
            System.out.println("Słowo " + K + " znajduje się w ciągu");
        } else {
            System.out.println("Słowo " + K + " nie znajduje się w ciągu");
        }
    }
}