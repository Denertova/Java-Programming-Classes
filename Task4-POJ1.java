import java.io.*;
import java.util.*;
class pole {
    public static void main(String[] args) throws IOException {
        int a, b;
        Scanner in = new Scanner(System.in);
        a = in.nextInt();
        b = in.nextInt();;
        int dodawanie, odejmowanie, mnożenie, dzielenie;
        dodawanie = a+b;
        odejmowanie = a-b;
        mnożenie = a*b;
        dzielenie = a%b;
        System.out.println("Dodawanie: " + a + " + " + b + " = " + dodawanie);
        System.out.println("Odejmowanie: " + a + " - " + b + " = " + odejmowanie);
        System.out.println("Mnożenie: " + a + " * " + b + " = " + mnożenie);
        System.out.println("Dzielenie modulo: " + a + " mod " + b + " = " + dzielenie);
    }
}