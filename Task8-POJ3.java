import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String email = input.nextLine();
        String[] parts = email.split("@");
        String username = parts[0];
        System.out.println(username);
    }
}