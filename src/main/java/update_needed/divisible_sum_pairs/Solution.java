package update_needed.divisible_sum_pairs;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Solution {

    static int divisibleSumPairs(int n, int k, int[] ar) {
        // todo: tests
        int[] numbers = Arrays.stream(ar).sorted().toArray();
        int countDivisible = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (isSumDivisible(numbers[i], numbers[j], k)) {
                    countDivisible++;
                }
            }
        }
        return countDivisible;
    }

    private static boolean isSumDivisible(int number1, int number2, int coefficient) {
        return (number1 + number2) % coefficient == 0;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        String[] nk = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nk[0]);
        int k = Integer.parseInt(nk[1]);
        int[] ar = new int[n];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = divisibleSumPairs(n, k, ar);
        System.out.println(result);
        scanner.close();
    }
}
