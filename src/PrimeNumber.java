import java.util.Arrays;

public class PrimeNumber {
    public static void main(String[] args) {
        int[] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15,16, 17,18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30};
        int[] dividerNumbers = {2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Some numbers " + Arrays.toString(numbers));

        for (int x = 0; x < numbers.length; x++) {
            boolean first = true;
            if (numbers[x] < 2) {
                System.out.println(numbers[x] + " is not prime number");
                first = false;
            } else {
                for (int y = 2; y <= numbers[x] / dividerNumbers[y]; y++) {
                    if (numbers[x] % y == 0) {
                        first = false;
                        System.out.println(numbers[x] + " is not prime number for y = " + y);
                    }
                }
            }
            if (first) {
                System.out.println(numbers[x] + " is prime number");
            }
        }
    }
}
