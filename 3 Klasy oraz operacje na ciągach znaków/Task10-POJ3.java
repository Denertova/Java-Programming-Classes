import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str1 = input.nextLine();
        String str2 = input.nextLine();
        int i;
        for (i = 0; i < str1.length() && i < str2.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                break;
            }
        }
        if (i < str1.length() || i < str2.length()) {
            System.out.println(i);
        } else {
            System.out.println("The strings are equal");
        }
    }
}