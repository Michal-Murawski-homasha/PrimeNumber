import java.util.Arrays;

public class PrimeNumber {
    public static void main(String[] args) {
        int[] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15,16, 17,18, 19, 20};
        System.out.println("Some numbers " + Arrays.toString(numbers));

        int x = 19;
        if ((x / x == 1) && (x / 1 == x) && (x % 2 != 0) && (x % 3 != 0)) {
            System.out.println(x + " is prime number");
        } else {
            System.out.println(x + " is not prime number");
        }
    }
}
