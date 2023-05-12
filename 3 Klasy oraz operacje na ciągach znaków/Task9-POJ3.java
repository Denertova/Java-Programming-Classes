import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String T = input.nextLine();
        String R = input.nextLine();
        String K = input.nextLine();
        String result = T.replaceAll(R, K);
        System.out.println(result);
    }
}