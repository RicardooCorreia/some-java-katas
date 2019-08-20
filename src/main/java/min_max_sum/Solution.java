package min_max_sum;

import java.math.BigInteger;
import java.util.*;

public class Solution {

    // Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) {

        assert Arrays.stream(arr).count() >= 4;

        BigInteger minSum = Arrays.stream(arr)
                .mapToObj(value -> new BigInteger(String.valueOf(value)))
                .sorted()
                .limit(4)
                .reduce(BigInteger::add)
                .get();

        BigInteger maxSum = Arrays.stream(arr)
                .mapToObj(value -> new BigInteger(String.valueOf(value)))
                .sorted(Comparator.reverseOrder())
                .limit(4)
                .reduce(BigInteger::add)
                .get();

        System.out.println(minSum + " " + maxSum);

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        miniMaxSum(arr);

        scanner.close();
    }
}

