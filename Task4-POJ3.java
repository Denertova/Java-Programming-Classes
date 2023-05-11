import java.util.Random;

class RandomNumbers {
    static final int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    static final Random random = new Random();

    public static int randomElement() {
        int index = random.nextInt(numbers.length);
        return numbers[index];
    }
}