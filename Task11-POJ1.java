import java.util.*;
import java.io.IOException; 
class transpozycja {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
 
        int a = 0;
        if (in.hasNextInt()) {
            a = in.nextInt();
        } else {
            System.out.println("BŁĄD");
            return;
        }
 
        int b = 0;
        if (in.hasNextInt()) {
            b = in.nextInt();
        } else {
            System.out.println("BŁĄD");
            return;
        }
 
        if (a <= 0 || b <= 0) {
            System.out.println("BŁĄD");
            return;
        }
 
        int tabela[][] = new int[a][b];
 
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                if (in.hasNextInt()) {
                    tabela[i][j] = in.nextInt();
                } else {
                    System.out.println("BŁĄD");
                    return;
                }
            }
        }
 
        for (int j = 0; j < b; j++) {
            for (int i = 0; i < a; i++) {
                if (i == a -1 ) {
                    System.out.print(tabela[i][j]);
                } else {
                    System.out.print(tabela[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}