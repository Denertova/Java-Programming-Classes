import java.io.*;
import java.util.*;

class Planets {
    public static void main(String[] args) throws IOException {
    Scanner input = new Scanner(System.in);
    long seconds = input.nextLong();
    String planet = input.next();
    double earthYears = seconds / 31557600.0;
    double age;
    switch (planet) {
        case "Ziemia":
            age = earthYears;
            break;
        case "Merkury":
            age = earthYears / 0.2408467;
            break;
        case "Wenus":
            age = earthYears / 0.61519726;
            break;
        case "Mars":
            age = earthYears / 1.8808158;
            break;
        case "Jowisz":
            age = earthYears / 11.862615;
            break;
        case "Saturn":
            age = earthYears / 29.447498;
            break;
        case "Uran":
            age = earthYears / 84.016846;
            break;
        case "Neptun":
            age = earthYears / 164.79132;
            break;
           default:
            age = earthYears;
            break;
        }
            System.out.printf("%.2f", age);
        }
}