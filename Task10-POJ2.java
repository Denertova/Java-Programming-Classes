import java.lang.Math;
import java.util.Scanner;

class Numbers {
    private int a, b, c;

    public Numbers(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int sum() {
        return a + b + c;
    }

    public double average() {
        return sum() / 3.0;
    }

    public int min() {
        return Math.min(Math.min(a, b), c);
    }

    public int max() {
        return Math.max(Math.max(a, b), c);
    }

    public double geometric() {
        return Math.pow(a * b * c, 1.0 / 3);
    }
}
class NumbersTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Numbers n1 = new Numbers(1, 2, 3);
        assert n1.sum() == 6 : "blad z suma";
        assert n1.average() == 2.0 : "blad ze srednia";
        assert n1.min() == 1 : "blad z minimalna";
        assert n1.max() == 3 : "blad z max";
        assert Math.abs(n1.geometric() - 1.8171) < 0.0001 : "blad ze srednia geometryczna";

        Numbers n2 = new Numbers(0, 0, 0);
        assert n2.sum() == 0 : "blad z suma";
        assert n2.average() == 0.0 : "blad ze srednia";
        assert n2.min() == 0 : "blad z minimalna";
        assert n2.max() == 0 : "blad z max";
        assert Double.isNaN(n2.geometric()) : "blad ze srednia geometryczna";
        
        Numbers n3 = new Numbers(10, -5, 7);
        assert n3.sum() == 12 : "blad z suma";
        assert n3.average() == 4.0 : "blad ze srednia";
        assert n3.min() == -5 : "blad z minimalna";
        assert n3.max() == 10 : "blad z max";
        assert Math.abs(n3.geometric() - 5.675) < 0.001 : "blad ze srednia geometryczna";
    }
}