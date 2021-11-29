package update_needed.minimum_distance;

import java.io.*;
import java.util.*;

public class Solution {

    // Complete the minimumDistances function below.
    static int minimumDistances(int[] numbers) {
        HashMap<Integer, Integer> foundNumbers = new HashMap<>(numbers.length);
        List<Integer> distances = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            int currentNumber = numbers[i];
            if (foundNumbers.containsKey(currentNumber)) {
                distances.add(i - foundNumbers.get(currentNumber));
            } else {
                foundNumbers.put(currentNumber, i);
            }
        }
        Collections.sort(distances);
        return distances.isEmpty() ? -1 : distances.get(0);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }

        int result = minimumDistances(a);
        System.out.println(result);
//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();

        scanner.close();
    }
}
