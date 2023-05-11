class LambdaCalculator {

    interface Adder {
        int add(int a, int b);
    }

    interface Multiplier {
        int multiply(int a, int b);
    }

    interface StringLength {
        int getLength(String s);
    }

    public int calculateAddition(Adder adder, int a, int b) {
        return adder.add(a, b);
    }

    public int calculateMultiplication(Multiplier multiplier, int a, int b) {
        return multiplier.multiply(a, b);
    }

    public int calculateStringLength(StringLength stringLength, String s) {
        return stringLength.getLength(s);
    }

    public static void main(String[] args) {

        Adder adder = (int a, int b) -> a + b;
        int sum = new LambdaCalculator().calculateAddition(adder, 3, 5);
        System.out.println("Suma: " + sum);

        Multiplier multiplier = (int a, int b) -> a * b;
        int product = new LambdaCalculator().calculateMultiplication(multiplier, 4, 6);
        System.out.println("Iloczyn: " + product);

        StringLength stringLength = (String s) -> s.length();
        int length = new LambdaCalculator().calculateStringLength(stringLength, "Hello, world!");
        System.out.println("Długość łańcucha: " + length);
    }
}