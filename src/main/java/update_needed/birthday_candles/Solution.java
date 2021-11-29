package update_needed.birthday_candles;

import java.io.IOException;
import java.util.Scanner;

public class Solution {

    // Complete the birthdayCakeCandles function below.
    static int birthdayCakeCandles(int[] ar) {
        int age = ar.length;

        int count = 0;
        int biggestCandle = -1;
        for (int candle : ar) {
            if (candle > biggestCandle) {
                biggestCandle = candle;
                count = 1;
            } else if (candle == biggestCandle) {
                count++;
            }
        }

        return count;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int arCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[arCount];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < arCount; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = birthdayCakeCandles(ar);

        scanner.close();
    }
}
