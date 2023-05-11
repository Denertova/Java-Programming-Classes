import java.util.*;
import java.io.*;
class Palindrom  {
    public static void main(String[] args) throws IOException  {
        Scanner in = new Scanner(System.in);
        String word = in.nextLine();

        if (isPalindrome(word)) {
            System.out.println("TAK");
        } else {
            System.out.println("NIE");
        }}
        public static boolean isPalindrome(String str) {
            int left =0, right = str.length() -1;
            while (left<right)
            {
                if (str.charAt(left) != str.charAt(right))
                {
                    return  false;
                }
                left++;
                right--;
            }return true;

    }
}