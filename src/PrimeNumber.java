import java.util.Arrays;

public class PrimeNumber {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15,16, 17,18, 19, 20};
        System.out.println("Some numbers " + Arrays.toString(numbers));

//        int x = 19;
        for (int x = 0; x < numbers.length; x++) {
            if ((numbers[x] / numbers[x] == 1) && (numbers[x] / 1 == numbers[x]) && (numbers[x] % 2 != 0) && (numbers[x] % 3 != 0)) {
                System.out.println(numbers[x] + " is prime number");
            } else {
                System.out.println(numbers[x] + " is not prime number");
            }
        }
    }
}
