import java.util.Scanner;

class StringFormatting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       
        String text = input.nextLine();
        
        // Wypisanie ciągu dużymi literami
        System.out.println(text.toUpperCase());
        
        // Wypisanie ciągu małymi literami
        System.out.println(text.toLowerCase());
        
        // Wypisanie pierwszej litery dużą literą
        System.out.println(Character.toUpperCase(text.charAt(0)) + text.substring(1));
        
        // Wypisanie pierwszych liter każdego ze słów dużą literą
        String[] words = text.split(" ");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            result.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1)).append(" ");
        }
        System.out.println(result.toString().trim());
    }
}