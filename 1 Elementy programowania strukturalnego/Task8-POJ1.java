import java.util.*;
import java.io.IOException;

class IloczynSkalarny {
    public static void main(String[] args) throws IOException {


        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int m = scanner.nextInt();

        if (n <= 0 || m <= 0) {
            System.out.println("BŁĄD");
            return;
        }

        int[] A = new int[n];
        int[] B = new int[m];
        for (int i = 0; i < n; i++) {
            A[i] = scanner.nextInt();
        }

        for (int i = 0; i < m; i++) {
            B[i] = scanner.nextInt();
        }

        int iloczynSkalarny = 0;
        if (n == m) {
            for (int i = 0; i < n; i++) {
                iloczynSkalarny += A[i] * B[i];
            }
        } else if (n < m) {
            for (int i = 0; i < n; i++) {
                iloczynSkalarny += A[i] * B[i];
            }
        } else {
            for (int i = 0; i < m; i++) {
                iloczynSkalarny += A[i] * B[i];
            }
            
        }       System.out.println(iloczynSkalarny);
    }
}