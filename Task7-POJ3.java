import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String url = input.nextLine();
        String[] parts = url.split("/");
        String filename = parts[parts.length - 1];
        System.out.println(filename);
    }
}