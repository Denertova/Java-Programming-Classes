import java.io.*;

class pole {
  public static void main(String[] args) throws IOException {
    double a, b;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    a = Double.parseDouble(br.readLine());

    b = Double.parseDouble(br.readLine());

    double pole;
    pole = a*b;
    System.out.println(pole);
  }
}